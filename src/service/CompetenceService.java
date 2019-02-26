/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Competence;
import bean.CompetenceOffre;
import bean.CompetenceUtilisateur;

/**
 *
 * @author Lenovo
 */
public class CompetenceService extends AbstractFacade<Competence> {

    public CompetenceService() {
        super(Competence.class);
    }

    public int creerCompetence(String libelle, String discription, String domaine, CompetenceUtilisateur competenceUtilisateur, CompetenceOffre competenceOffre) {
        Competence competence = new Competence(libelle, discription, domaine, competenceUtilisateur, competenceOffre);
        create(competence);
        return 1;
    }

}
