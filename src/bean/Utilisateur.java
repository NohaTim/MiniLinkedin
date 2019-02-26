/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Lenovo
 */
@Entity
public class Utilisateur implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private String id;
    private String motDePasse;
    private String nom;
    private String prenom;
    private String adresse;
    private String telephone;
    private String loisir;

    @OneToMany(mappedBy = "utilisateur")
    private List<CompetenceLinguistique> competenceLanguistiques;
    @OneToMany(mappedBy = "utilisateur")
    private List<Formation> formations;
    @OneToMany(mappedBy = "utilisateur")
    private List<Emploi> emplois;
    @OneToMany(mappedBy = "utilisateur")
    private List<CompetenceUtilisateur> competenceUtilisateurs;
    @OneToMany(mappedBy = "emeteur")
    private List<Message> messages;
    @OneToMany(mappedBy = "recepteur")
    private List<Invitation> invitations;
    @OneToMany(mappedBy = "recepteur")
    private List<DetailMessage> detailMessages;

    public Utilisateur() {
    }

    public Utilisateur(String id) {
        this.id = id;
    }

    public Utilisateur(String id, String motDePasse, String nom, String prenom, String adresse, String telephone, String loisir) {
        this.id = id;
        this.motDePasse = motDePasse;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.telephone = telephone;
        this.loisir = loisir;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getLoisir() {
        return loisir;
    }

    public void setLoisir(String loisir) {
        this.loisir = loisir;
    }

    public List<CompetenceLinguistique> getCompetenceLanguistiques() {
        return competenceLanguistiques;
    }

    public void setCompetenceLanguistiques(List<CompetenceLinguistique> competenceLanguistiques) {
        this.competenceLanguistiques = competenceLanguistiques;
    }

    public List<Formation> getFormations() {
        return formations;
    }

    public void setFormations(List<Formation> formations) {
        this.formations = formations;
    }

    public List<Emploi> getEmplois() {
        return emplois;
    }

    public void setEmplois(List<Emploi> emplois) {
        this.emplois = emplois;
    }

    public List<CompetenceUtilisateur> getCompetenceUtilisateurs() {
        return competenceUtilisateurs;
    }

    public void setCompetenceUtilisateurs(List<CompetenceUtilisateur> competenceUtilisateurs) {
        this.competenceUtilisateurs = competenceUtilisateurs;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public List<DetailMessage> getDetailMessages() {
        return detailMessages;
    }

    public void setDetailMessages(List<DetailMessage> detailMessages) {
        this.detailMessages = detailMessages;
    }

    public List<Invitation> getInvitations() {
        return invitations;
    }

    public void setInvitations(List<Invitation> invitations) {
        this.invitations = invitations;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 61 * hash + Objects.hashCode(this.id);
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
        final Utilisateur other = (Utilisateur) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Utilisateur{" + "id=" + id + ", motDePasse=" + motDePasse + ", nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", telephone=" + telephone + ", loisir=" + loisir + '}';
    }

    


}
