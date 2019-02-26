/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import bean.CompetenceLinguistique;
import bean.Langue;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author YOUNES
 */
public class CompetenceLanguistiqueHelper extends AbstractHelper<CompetenceLinguistique> {

    private static AbstractHelperItem[] titres;

    static {
        titres = new AbstractHelperItem[]{
            new AbstractHelperItem("Langue ", "nonLnague"),
            new AbstractHelperItem("Niveau ", "niveau")};

    }
    
     @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if(columnIndex==0){
            Langue langue=list.get(rowIndex).getLangue();
            String nomLangue=""+langue.getNomLangue();
            return nomLangue;
        }
        return super.getValueAt(rowIndex, columnIndex);
    }

    public CompetenceLanguistiqueHelper(JTable jTable, List<CompetenceLinguistique> list) {
        super(titres, jTable, list);
    }

    public CompetenceLanguistiqueHelper(AbstractHelperItem[] abstractHelperItem, JTable jTable) {
        super(titres, jTable);
    }

    public CompetenceLanguistiqueHelper(JTable jTable) {
        super(titres, jTable);
    }
}
