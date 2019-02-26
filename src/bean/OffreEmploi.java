/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

/**
 *
 * @author Lenovo
 */
@Entity
public class OffreEmploi implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String poste;
    private String domaine;

    @Temporal(javax.persistence.TemporalType.DATE)
    private Date datePublication;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateEmbauche;

    @ManyToOne
    Entreprise entreprise;
    @OneToMany(mappedBy = "offreEmploi")
    private List<CompetenceOffre> competenceOffres;

    public OffreEmploi() {
    }

    public OffreEmploi(Long id) {
        this.id = id;
    }

    public OffreEmploi(String poste, String domaine, Date datePublication, Date dateEmbauche, Entreprise entreprise) {
        this.poste = poste;
        this.domaine = domaine;
        this.datePublication = datePublication;
        this.dateEmbauche = dateEmbauche;
        this.entreprise = entreprise;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPoste() {
        return poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }

    public String getDomaine() {
        return domaine;
    }

    public void setDomaine(String domaine) {
        this.domaine = domaine;
    }

    public Date getDatePublication() {
        return datePublication;
    }

    public void setDatePublication(Date datePublication) {
        this.datePublication = datePublication;
    }

    public Date getDateEmbauche() {
        return dateEmbauche;
    }

    public void setDateEmbauche(Date dateEmbauche) {
        this.dateEmbauche = dateEmbauche;
    }

    public Entreprise getEntreprise() {
        return entreprise;
    }

    public void setEntreprise(Entreprise entreprise) {
        this.entreprise = entreprise;
    }

    public List<CompetenceOffre> getCompetenceOffres() {
        return competenceOffres;
    }

    public void setCompetenceOffres(List<CompetenceOffre> competenceOffres) {
        this.competenceOffres = competenceOffres;
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
        if (!(object instanceof OffreEmploi)) {
            return false;
        }
        OffreEmploi other = (OffreEmploi) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "OffreEmploi{" + "id=" + id + ", poste=" + poste + ", domaine=" + domaine + ", datePublication=" + datePublication + ", dateEmbauche=" + dateEmbauche + '}';
    }

}
