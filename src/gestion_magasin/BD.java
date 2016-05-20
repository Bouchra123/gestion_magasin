package gestion_magasin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BD {

    private static Connection cn = seConnecter("localhost", "gestion_magasin", "root", "");/*en connecter a la basse bonne un seul foit ci pour ca en fait private*/

    private static Connection seConnecter(String serveur, String nom_bd, String user, String mot_de_passe) {
        Connection cn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver"); // importation du pilote
            cn = DriverManager.getConnection("jdbc:mysql://" + serveur + "/" + nom_bd, user, mot_de_passe);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(BD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cn;
    }

    public static int mise_a_jour(String requette) {
        int nb_lignes = 0;/*le nomber des ligens qui modefer ou ajouter ou suprimer*/

        try {
            Statement st = cn.createStatement();
            nb_lignes = st.executeUpdate(requette);
        } catch (SQLException ex) {
            Logger.getLogger(BD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nb_lignes;
    }

    public static ResultSet selection(String requette) {
        ResultSet rs = null;/*ResltSet c'est un coliction on a 11 type*/
        try {
            Statement st = cn.createStatement();
            rs = st.executeQuery(requette);
        } catch (SQLException ex) {
            Logger.getLogger(BD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
}
