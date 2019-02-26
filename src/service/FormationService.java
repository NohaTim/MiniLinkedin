/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Formation;
import bean.Utilisateur;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public class FormationService extends AbstractFacade<Formation> {

    public FormationService() {
        super(Formation.class);
    }

    public int creerFormation(String domaine, String universite, int anneeObtention, String discription, Utilisateur utilisateur) {
        Formation formation = new Formation(domaine, universite, anneeObtention, discription, utilisateur);
        create(formation);
        return 1;
    }
     public List<Formation> findByRib(String id){
         return getEntityManager().createQuery("SELECT f FROM  Formation f  WHERE f.utilisateur.id='" +id+ "'").getResultList();
         
     }
    
    
    

   
}
