/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import bean.Langue;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author YOUNES
 */
public class LangueHelper extends AbstractHelper<Langue> {

    private static AbstractHelperItem[] titres;

    static {
        titres = new AbstractHelperItem[]{
            new AbstractHelperItem("Langue", "nomLangue"),
            new AbstractHelperItem("Niveau", "competanceLanguistique.getNiveau()"),
        };

    }

    public LangueHelper(JTable jTable, List<Langue> list) {
        super(titres, jTable, list);
    }

    public LangueHelper(AbstractHelperItem[] abstractHelperItem, JTable jTable) {
        super(titres, jTable);
    }

    public LangueHelper(JTable jTable) {
        super(titres, jTable);
    }
}
