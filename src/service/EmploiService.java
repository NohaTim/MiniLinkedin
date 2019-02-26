/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Emploi;
import bean.Utilisateur;
import java.util.Date;
import java.util.List;


/**
 *
 * @author Lenovo
 */
public class EmploiService extends AbstractFacade<Emploi> {

    public EmploiService() {
        super(Emploi.class);
    }

     public int creerEmploi( String poste, String secteur, int TypeContrat, Date dateDebut, Date dateFin, Utilisateur utilisateur) {
        Emploi emploi = new Emploi(  poste,  secteur,  TypeContrat,  dateDebut,  dateFin,  utilisateur);
        create(emploi);
        return 1;
    }
     public List<Emploi> findByRib(String id){
         return getEntityManager().createQuery("SELECT  e FROM  Emploi e  WHERE e.utilisateur.id='" +id+ "'").getResultList();
         
     }
    
}
