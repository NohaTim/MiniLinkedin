/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import bean.Formation;
import java.util.List;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author YOUNES
 */
public class FormationHelper extends AbstractHelper<Formation> {

    private static AbstractHelperItem[] titres;

    static {
        titres = new AbstractHelperItem[]{
            new AbstractHelperItem("Formation ", "discription"),
            new AbstractHelperItem("Domaine ", "domaine"),
            new AbstractHelperItem("Université", "universite"),
            new AbstractHelperItem("Année Obtention", "anneeObtention")};

    }

    

    public FormationHelper(JTable jTable, List<Formation> list) {
        super(titres, jTable, list);
    }

    public FormationHelper(AbstractHelperItem[] abstractHelperItem, JTable jTable) {
        super(titres, jTable);
    }

    public FormationHelper(JTable jTable) {
        super(titres, jTable);
    }
}
