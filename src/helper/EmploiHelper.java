/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import bean.Emploi;
import bean.Formation;
import controler.util.DateUtil;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author YOUNES
 */
public class EmploiHelper extends AbstractHelper<Emploi> {

    private static AbstractHelperItem[] titres;

    static {
        titres = new AbstractHelperItem[]{
            new AbstractHelperItem("Poste ", "poste"),
            new AbstractHelperItem("Entreprise", "secteur"),
            new AbstractHelperItem("TypeContrat", "TypeContrat")};

    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (list != null && rowIndex < list.size()) {
            if (columnIndex == 2) {
                if (list.get(rowIndex).getTypeContrat() == 1) {
                    return "DETERMINER";
                } else if (list.get(rowIndex).getTypeContrat() == 2) {
                    return "INDETERMINER";
                } else if (list.get(rowIndex).getTypeContrat() == 3) {
                    return "STAGE";
                } else {
                    return super.getValueAt(rowIndex, columnIndex);
                }

            } else if (columnIndex == 0) {
                if (list.get(rowIndex).getPoste().equalsIgnoreCase("Administrateur")) {
                    return "Administrateur";
                } else if (list.get(rowIndex).getPoste().equalsIgnoreCase("Chauffeur rouier")) {
                    return "Chauffeur rouier";
                } else if (list.get(rowIndex).getPoste().equalsIgnoreCase("chef Comptable")) {
                    return "chef Comptable";
                } else if (list.get(rowIndex).getPoste().equalsIgnoreCase("chef Entreprise")) {
                    return "chef Entreprise";
                } else if (list.get(rowIndex).getPoste().equalsIgnoreCase("Directeur")) {
                    return "Directeur";
                } else if (list.get(rowIndex).getPoste().equalsIgnoreCase("Comptable")) {
                    return "Comptable";
                } else if (list.get(rowIndex).getPoste().equalsIgnoreCase("Hotesse d'Accueil")) {
                    return "Hotesse d'Accueil";
                } else if (list.get(rowIndex).getPoste().equalsIgnoreCase("Technicien")) {
                    return "Technicien";
                } else if (list.get(rowIndex).getPoste().equalsIgnoreCase("Ingénieur Informatique ")) {
                    return "Ingénieur Informatique ";
                } else if (list.get(rowIndex).getPoste().equalsIgnoreCase("Assistant(e) Bureautique Internet ")) {
                    return "Assistant(e) Bureautique Internet ";
                } else {
                    return super.getValueAt(rowIndex, columnIndex);
                }
            }else if (columnIndex == 1) {
                if (list.get(rowIndex).getSecteur().equalsIgnoreCase("SAHAM")) {
                    return "SAHAM";
                }else if (list.get(rowIndex).getSecteur().equalsIgnoreCase("Maroc Telecom")) {
                    return "Maroc Telecom";
                }else if (list.get(rowIndex).getSecteur().equalsIgnoreCase("AttijariWafa Bank")) {
                    return "AttijariWafa Bank";
                }else if (list.get(rowIndex).getSecteur().equalsIgnoreCase("BMCE bank")) {
                    return "BMCE bank";
                }else if (list.get(rowIndex).getSecteur().equalsIgnoreCase("CDG")) {
                    return "CDG";
                }else if (list.get(rowIndex).getSecteur().equalsIgnoreCase("OCP")) {
                    return "OCP";
                }else if (list.get(rowIndex).getSecteur().equalsIgnoreCase("Ynna Holding")) {
                    return "Ynna Holding";
                }else if (list.get(rowIndex).getSecteur().equalsIgnoreCase("Optorg")) {
                    return "Optorg";
                }else if (list.get(rowIndex).getSecteur().equalsIgnoreCase("Hps")) {
                    return "Hps";
                }else if (list.get(rowIndex).getSecteur().equalsIgnoreCase("Finatech")) {
                    return "Finatech";
                }else if (list.get(rowIndex).getSecteur().equalsIgnoreCase("S2M")) {
                    return "S2M";
                }else if (list.get(rowIndex).getSecteur().equalsIgnoreCase("M2M")) {
                    return "M2M";
                }else {
                    return super.getValueAt(rowIndex, columnIndex);
                }
        }
    }
        return "";
    }
    public EmploiHelper(JTable jTable, List<Emploi> list) {
        super(titres, jTable, list);
    }

    public EmploiHelper(AbstractHelperItem[] abstractHelperItem, JTable jTable) {
        super(titres, jTable);
    }

    public EmploiHelper(JTable jTable) {
        super(titres, jTable);
    }
}
