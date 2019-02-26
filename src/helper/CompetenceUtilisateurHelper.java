/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import bean.CompetenceUtilisateur;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author YOUNES
 */
public class CompetenceUtilisateurHelper extends AbstractHelper<CompetenceUtilisateur> {

    private static AbstractHelperItem[] titres;

    static {
        titres = new AbstractHelperItem[]{
            new AbstractHelperItem("IDENTIFIANT ", "id"),
            new AbstractHelperItem("POURCENTAGE ", "pourcentage"),
            new AbstractHelperItem("UTILISATEUR", "utilisateur"),};

    }

    public CompetenceUtilisateurHelper(JTable jTable, List<CompetenceUtilisateur> list) {
        super(titres, jTable, list);
    }

    public CompetenceUtilisateurHelper(AbstractHelperItem[] abstractHelperItem, JTable jTable) {
        super(titres, jTable);
    }

    public CompetenceUtilisateurHelper(JTable jTable) {
        super(titres, jTable);
    }
}
