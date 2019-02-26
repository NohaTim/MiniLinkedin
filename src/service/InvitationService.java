/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Invitation;
import bean.Utilisateur;
import java.util.Date;

/**
 *
 * @author Lenovo
 */
public class InvitationService extends AbstractFacade<Invitation> {

    public InvitationService() {
        super(Invitation.class);
    }

    public int creerInvitation(Date dateEnvoie, Date dateAcceptation, Utilisateur emetteur, Utilisateur recepteur) {
        Invitation invitation = new Invitation(dateEnvoie, dateAcceptation, emetteur, recepteur);
        return 1;
    }
}
