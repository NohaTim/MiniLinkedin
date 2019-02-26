/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Lenovo
 */
@Entity
public class Message implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String text;
    private String objet;
    @ManyToOne
    Utilisateur emeteur;
    @OneToMany(mappedBy = "message")
    private List<DetailMessage> detailMessages;

    public Message() {
    }

    public Message(Long id) {
        this.id = id;
    }

    public Message(String text, String objet, Utilisateur emeteur) {
        this.text = text;
        this.objet = objet;
        this.emeteur = emeteur;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getObjet() {
        return objet;
    }

    public void setObjet(String objet) {
        this.objet = objet;
    }

    public Utilisateur getEmeteur() {
        return emeteur;
    }

    public void setEmeteur(Utilisateur emeteur) {
        this.emeteur = emeteur;
    }

    public List<DetailMessage> getDetailMessages() {
        return detailMessages;
    }

    public void setDetailMessages(List<DetailMessage> detailMessages) {
        this.detailMessages = detailMessages;
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
        if (!(object instanceof Message)) {
            return false;
        }
        Message other = (Message) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Message{" + "id=" + id + ", text=" + text + ", objet=" + objet + '}';
    }

}
