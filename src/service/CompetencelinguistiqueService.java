/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.CompetenceLinguistique;
import bean.Langue;
import bean.Utilisateur;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public class CompetencelinguistiqueService extends AbstractFacade<CompetenceLinguistique> {

    public CompetencelinguistiqueService() {
        super(CompetenceLinguistique.class);
    }

    public int creerCompetenceLinguistique( String niveau, Utilisateur utilisateur, Langue langue){
     CompetenceLinguistique competenceLinguistique  = new CompetenceLinguistique(niveau,utilisateur,langue);
        create(competenceLinguistique);
         return 1;
    }
    public List<CompetenceLinguistique> findByRib(String id){
        return getEntityManager().createQuery("SELECT comLing FROM CompetenceLinguistique comLing WHERE comLing.utilisateur.id=' "+id+"'").getResultList();
    }

    

}
