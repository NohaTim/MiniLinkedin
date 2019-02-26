/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import bean.Utilisateur;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author YOUNES
 */
public class UtilisateurHelper extends AbstractHelper<Utilisateur> {

    private static AbstractHelperItem[] titres;

    static {
        titres = new AbstractHelperItem[]{
            new AbstractHelperItem("Identifiant ", "id"),
            new AbstractHelperItem("Nom ", "nom"),
            new AbstractHelperItem("Prenom", "prenom"),
            new AbstractHelperItem("Adresse", "adresse"),
            new AbstractHelperItem("Tel", "telephone"),
            new AbstractHelperItem("Email", "loisir")};
            

    }

    public UtilisateurHelper(JTable jTable, List<Utilisateur> list) {
        super(titres, jTable, list);
    }

    public UtilisateurHelper(AbstractHelperItem[] abstractHelperItem, JTable jTable) {
        super(titres, jTable);
    }

    public UtilisateurHelper(JTable jTable) {
        super(titres, jTable);
    }
}
