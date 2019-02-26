/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.DetailMessage;
import bean.Message;
import bean.Utilisateur;
import java.util.Date;

/**
 *
 * @author Lenovo
 */
public class DetailMessageService extends AbstractFacade<DetailMessage> {

    public DetailMessageService() {
        super(DetailMessage.class);
    }

    public int creerDetailMessage(Date dateLecture, Message message, Utilisateur recepteur) {
        DetailMessage detailMessage = new DetailMessage(dateLecture, message, recepteur);
        create(detailMessage);
        return 1;
    }
}
