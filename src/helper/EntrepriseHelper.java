/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import bean.Entreprise;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author YOUNES
 */
public class EntrepriseHelper extends AbstractHelper<Entreprise> {

    private static AbstractHelperItem[] titres;

    static {
        titres = new AbstractHelperItem[]{
            new AbstractHelperItem("IDENTIFIANT ", "id"),
            new AbstractHelperItem("POSTE ", "poste"),
            new AbstractHelperItem("SECTEUR", "secteur"),
            new AbstractHelperItem("TYPE DE CONTRAT ", "TypeContrat"),
            new AbstractHelperItem("DATE DEBUT", "dateDebut"),
            new AbstractHelperItem("DATE FIN", "dateFin"),
            new AbstractHelperItem("UTILISATEUR", "utilisateur"),
        };

    }

    public EntrepriseHelper(JTable jTable, List<Entreprise> list) {
        super(titres, jTable, list);
    }

    public EntrepriseHelper(AbstractHelperItem[] abstractHelperItem, JTable jTable) {
        super(titres, jTable);
    }

    public EntrepriseHelper(JTable jTable) {
        super(titres, jTable);
    }
}
