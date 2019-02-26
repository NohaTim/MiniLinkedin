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
public class Entreprise implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nomEntreprise;
    private String lieu;

    @ManyToOne
    Emploi emploi;
    @OneToMany(mappedBy = "entreprise")
    private List<OffreEmploi> offreEmplois;

    public Entreprise() {
    }

    public Entreprise(Long id) {
        this.id = id;
    }

    public Entreprise(String nomEntreprise, String lieu, Emploi emploi) {
        this.nomEntreprise = nomEntreprise;
        this.lieu = lieu;
        this.emploi = emploi;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomEntreprise() {
        return nomEntreprise;
    }

    public void setNomEntreprise(String nomEntreprise) {
        this.nomEntreprise = nomEntreprise;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public Emploi getEmploi() {
        return emploi;
    }

    public void setEmploi(Emploi emploi) {
        this.emploi = emploi;
    }

    public List<OffreEmploi> getOffreEmplois() {
        return offreEmplois;
    }

    public void setOffreEmplois(List<OffreEmploi> offreEmplois) {
        this.offreEmplois = offreEmplois;
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
        if (!(object instanceof Entreprise)) {
            return false;
        }
        Entreprise other = (Entreprise) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entreprise{" + "id=" + id + ", nom=" + nomEntreprise + ", lieu=" + lieu + '}';
    }

}
