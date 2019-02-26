/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import bean.CompetenceOffre;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author YOUNES
 */
public class CompetenceOffreHelper extends AbstractHelper<CompetenceOffre> {

    private static AbstractHelperItem[] titres;

    static {
        titres = new AbstractHelperItem[]{
            new AbstractHelperItem("IDENTIFIANT ", "id"),
            new AbstractHelperItem("MINI POURCENTAGE ", "miniporcentage"),
            new AbstractHelperItem("OFFRE D'EMPLOI", "offreEmploi"),};

    }

    public CompetenceOffreHelper(JTable jTable, List<CompetenceOffre> list) {
        super(titres, jTable, list);
    }

    public CompetenceOffreHelper(AbstractHelperItem[] abstractHelperItem, JTable jTable) {
        super(titres, jTable);
    }

    public CompetenceOffreHelper(JTable jTable) {
        super(titres, jTable);
    }
}
