/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import bean.Emploi;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author YOUNES
 */
public class CompetenceHelper extends AbstractHelper<Emploi> {

    private static AbstractHelperItem[] titres;

    static {
        titres = new AbstractHelperItem[]{
            new AbstractHelperItem("IDENTIFIANT ", "id"),
            new AbstractHelperItem("LIBELLE ", "libelle"),
            new AbstractHelperItem("DESCRIPTION", "discription"),
            new AbstractHelperItem("DOMAINE", "domaine"),
            new AbstractHelperItem("COMPETENCE D'UTILISATEUR", "competenceUtilisateur"),
            new AbstractHelperItem("COMPETENCE OFFRE", "competenceOffre"),};

    }

    public CompetenceHelper(JTable jTable, List<Emploi> list) {
        super(titres, jTable, list);
    }

    public CompetenceHelper(AbstractHelperItem[] abstractHelperItem, JTable jTable) {
        super(titres, jTable);
    }

    public CompetenceHelper(JTable jTable) {
        super(titres, jTable);
    }
}
