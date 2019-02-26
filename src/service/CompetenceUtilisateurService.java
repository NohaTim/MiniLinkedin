/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.CompetenceUtilisateur;
import bean.Utilisateur;

/**
 *
 * @author Lenovo
 */
public class CompetenceUtilisateurService extends AbstractFacade<CompetenceUtilisateur> {

    public CompetenceUtilisateurService() {
        super(CompetenceUtilisateur.class);
    }

    public int creerCompetenceUtilisateur(double pourcentage, Utilisateur utilisateur) {
        CompetenceUtilisateur competenceUtilisateur = new CompetenceUtilisateur(pourcentage, utilisateur);
        create(competenceUtilisateur);
        return 1;
    }

}
