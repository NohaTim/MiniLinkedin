/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Emploi;
import bean.Entreprise;

/**
 *
 * @author Lenovo
 */
public class EntrepriseService extends AbstractFacade<Entreprise> {

    public EntrepriseService() {
        super(Entreprise.class);
    }

    public int creerEntreprise(String nomEntreprise, String lieu, Emploi emploi) {

        Entreprise entreprise = new Entreprise(nomEntreprise, lieu, emploi);
        create(entreprise);
        return 1;
    }
}
