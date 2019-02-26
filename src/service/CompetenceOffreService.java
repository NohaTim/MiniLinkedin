/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.CompetenceOffre;
import bean.OffreEmploi;

/**
 *
 * @author Lenovo
 */
public class CompetenceOffreService extends AbstractFacade<CompetenceOffre> {

    public CompetenceOffreService() {
        super(CompetenceOffre.class);
    }

    public int creerCompetenceOffre(double miniporcentage, OffreEmploi offreEmploi) {
        CompetenceOffre competenceOffre = new CompetenceOffre(miniporcentage, offreEmploi);
        create(competenceOffre);
        return 1;
    }

}
