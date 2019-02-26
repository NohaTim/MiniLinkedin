/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import bean.DetailMessage;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author YOUNES
 */
public class DetailMessageHelper extends AbstractHelper<DetailMessage> {

    private static AbstractHelperItem[] titres;

    static {
        titres = new AbstractHelperItem[]{
            new AbstractHelperItem("IDENTIFIANT ", "id"),
            new AbstractHelperItem("NOM", "nomUniversite"),
            new AbstractHelperItem("DATE DEBUT", "dateDebut"),
            new AbstractHelperItem("DATE FIN", "dateFin"),
            new AbstractHelperItem("UTILISATEUR", "utilisateur")
        };

    }

    public DetailMessageHelper(JTable jTable, List<DetailMessage> list) {
        super(titres, jTable, list);
    }

    public DetailMessageHelper(AbstractHelperItem[] abstractHelperItem, JTable jTable) {
        super(titres, jTable);
    }

    public DetailMessageHelper(JTable jTable) {
        super(titres, jTable);
    }
}
