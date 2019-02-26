/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import bean.Invitation;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author YOUNES
 */
public class InvitationHelper extends AbstractHelper<Invitation> {

    private static AbstractHelperItem[] titres;

    static {
        titres = new AbstractHelperItem[]{
            new AbstractHelperItem("IDENTIFIANT ", "id"),
            new AbstractHelperItem("DOMAINE", "domaine"),
            new AbstractHelperItem("DATE DEBUT", "dateDebut"),
            new AbstractHelperItem("DATE FIN", "dateFin"),
            new AbstractHelperItem("UTILISATEUR", "utilisateur"),
            new AbstractHelperItem("ENTREPRISE", "entreprise"),};

    }

    public InvitationHelper(JTable jTable, List<Invitation> list) {
        super(titres, jTable, list);
    }

    public InvitationHelper(AbstractHelperItem[] abstractHelperItem, JTable jTable) {
        super(titres, jTable);
    }

    public InvitationHelper(JTable jTable) {
        super(titres, jTable);
    }
}
