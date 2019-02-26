/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Message;
import bean.Utilisateur;

/**
 *
 * @author Lenovo
 */
public class MessageService extends AbstractFacade<Message> {

    public MessageService() {
        super(Message.class);
    }

    public int creerMessage(String text, String objet, Utilisateur emeteur) {
        Message message = new Message(text, objet, emeteur);
        create(message);
        return 1;
    }

}
