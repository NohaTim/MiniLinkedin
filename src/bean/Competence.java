/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.Objects;
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
public class Competence implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String libelle;
    private String discription;
    private String domaine;

    @ManyToOne
    CompetenceUtilisateur competenceUtilisateur;
    @ManyToOne
    CompetenceOffre competenceOffre;

    public Competence() {
    }

    public Competence(Long id) {
        this.id = id;
    }

    public Competence(String libelle, String discription, String domaine, CompetenceUtilisateur competenceUtilisateur, CompetenceOffre competenceOffre) {
        this.libelle = libelle;
        this.discription = discription;
        this.domaine = domaine;
        this.competenceUtilisateur = competenceUtilisateur;
        this.competenceOffre = competenceOffre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public String getDomaine() {
        return domaine;
    }

    public void setDomaine(String domaine) {
        this.domaine = domaine;
    }

    public CompetenceUtilisateur getCompetenceUtilisateur() {
        return competenceUtilisateur;
    }

    public void setCompetenceUtilisateur(CompetenceUtilisateur competenceUtilisateur) {
        this.competenceUtilisateur = competenceUtilisateur;
    }

    public CompetenceOffre getCompetenceOffre() {
        return competenceOffre;
    }

    public void setCompetenceOffre(CompetenceOffre competenceOffre) {
        this.competenceOffre = competenceOffre;
    }

   

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Competence other = (Competence) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Competence{" + "id=" + id + ", libelle=" + libelle + ", discription=" + discription + ", domaine=" + domaine + '}';
    }

}
