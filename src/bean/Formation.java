/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author Lenovo
 */
@Entity
public class Formation implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String domaine;
    private String universite;
    private int anneeObtention;
    private String discription;

    @ManyToOne
    Utilisateur utilisateur;

    public Formation() {
    }

    public Formation(Long id) {
        this.id = id;
    }

    public Formation(String domaine, String universite, int anneeObtention, String discription, Utilisateur utilisateur) {
        this.domaine = domaine;
        this.universite = universite;
        this.anneeObtention = anneeObtention;
        this.discription = discription;
        this.utilisateur = utilisateur;
    }

    
    
   
    public Formation( String discription,String domaine, String universite, int anneeObtention) {
        this.discription = discription;
        this.domaine = domaine;
        this.universite = universite;
        this.anneeObtention = anneeObtention;
        
        
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDomaine() {
        return domaine;
    }

    public void setDomaine(String domaine) {
        this.domaine = domaine;
    }

    
    

    public int getAnneeObtention() {
        return anneeObtention;
    }

    public void setAnneeObtention(int anneeObtention) {
        this.anneeObtention = anneeObtention;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public String getUniversite() {
        return universite;
    }

    public void setUniversite(String universite) {
        this.universite = universite;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Formation)) {
            return false;
        }
        Formation other = (Formation) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Formation{" + "id=" + id + ", domaine=" + domaine + ", universite=" + universite + ", anneeObtention=" + anneeObtention + ", discription=" + discription + '}';
    }

    

    

}
