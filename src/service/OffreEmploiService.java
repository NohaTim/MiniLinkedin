/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Entreprise;
import bean.OffreEmploi;
import java.util.Date;

/**
 *
 * @author Lenovo
 */
public class OffreEmploiService extends AbstractFacade<OffreEmploi> {

    public OffreEmploiService() {
        super(OffreEmploi.class);
    }

    public int creerOffreEmploi(String poste, String domaine, Date datePublication, Date dateEmbauche, Entreprise entreprise) {
        OffreEmploi offreEmploi = new OffreEmploi(poste, domaine, datePublication, dateEmbauche, entreprise);
        create(offreEmploi);
        return 1;
    }
}
