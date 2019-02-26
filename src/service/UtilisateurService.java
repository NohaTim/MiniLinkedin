/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Utilisateur;

/**
 *
 * @author Lenovo
 */
public class UtilisateurService extends AbstractFacade<Utilisateur> {

    public UtilisateurService() {
        super(Utilisateur.class);
    }

    public int creerUtilisateur(String id, String motDePasse, String nom, String prenom, String adresse, String telephone, String loisir) {
        Utilisateur utilisateur = new Utilisateur(id, motDePasse, nom, prenom, adresse, telephone, loisir);
        create(utilisateur);
        return 1;
    }

    public int seConnecte(Utilisateur utilisateur) {
        Utilisateur utilCharge = find(utilisateur.getId());
        if (utilCharge.getId() == null) {
            return -1;
        } else if (!utilCharge.getMotDePasse().equals(utilisateur.getMotDePasse())) {
            return -2;
        } else {
            return 1;
        }
    }

    public int inscrir(Utilisateur utilisateur) {
        Utilisateur nvUtil = new Utilisateur();
        nvUtil.setNom(utilisateur.getNom());
        nvUtil.setPrenom(utilisateur.getPrenom());
        nvUtil.setId(utilisateur.getId());
        nvUtil.setMotDePasse(utilisateur.getMotDePasse());
        create(nvUtil);
        return 1;
        
    }

    public  int creerProfil(Utilisateur utilisateur){
       Utilisateur nvUtil = new Utilisateur();
        nvUtil.setNom(utilisateur.getNom());
        nvUtil.setPrenom(utilisateur.getPrenom());
        nvUtil.setAdresse(utilisateur.getAdresse());
        nvUtil.setTelephone(utilisateur.getTelephone()); 
        nvUtil.setId(utilisateur.getId());
        create(nvUtil);
        return 1;
    }
    public void edit(Utilisateur utilisateur) {
        getEntityManager().getTransaction().begin();
        getEntityManager().merge(utilisateur);
        getEntityManager().getTransaction().commit();

    }

}
