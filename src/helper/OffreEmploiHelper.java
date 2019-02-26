/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import bean.OffreEmploi;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author YOUNES
 */
public class OffreEmploiHelper extends AbstractHelper<OffreEmploi> {

    private static AbstractHelperItem[] titres;

    static {
        titres = new AbstractHelperItem[]{
            new AbstractHelperItem("IDENTIFIANT ", "id"),
            new AbstractHelperItem("DOMAINE", "domaine"),
            new AbstractHelperItem("POSTE", "poste"),
            new AbstractHelperItem("DATE DE PUBLICATION", "datePublication"),
            new AbstractHelperItem("DATE D'EMBAUCHE", "dateEmbauche"),
            new AbstractHelperItem("ENTREPRISE", "entreprise"),};

    }

    public OffreEmploiHelper(JTable jTable, List<OffreEmploi> list) {
        super(titres, jTable, list);
    }

    public OffreEmploiHelper(AbstractHelperItem[] abstractHelperItem, JTable jTable) {
        super(titres, jTable);
    }

    public OffreEmploiHelper(JTable jTable) {
        super(titres, jTable);
    }
}
