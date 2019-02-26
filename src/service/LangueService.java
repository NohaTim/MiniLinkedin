/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.CompetenceLinguistique;
import bean.Langue;

/**
 *
 * @author Lenovo
 */
public class LangueService extends AbstractFacade<Langue> {

    public LangueService() {
        super(Langue.class);
    }

   public int creerLangue( String nomLangue){
     Langue langue =new Langue( nomLangue);
       create(langue);
       return 1;
   }
   
}
