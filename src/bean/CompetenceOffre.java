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
public class CompetenceOffre implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private double miniporcentage;
    @ManyToOne
    OffreEmploi offreEmploi;
    @OneToMany(mappedBy = "competenceOffre")
    private List<Competence> competences;

    public CompetenceOffre() {
    }

    public CompetenceOffre(Long id) {
        this.id = id;
    }

    public CompetenceOffre(double miniporcentage, OffreEmploi offreEmploi) {
        this.miniporcentage = miniporcentage;
        this.offreEmploi = offreEmploi;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getMiniporcentage() {
        return miniporcentage;
    }

    public void setMiniporcentage(double miniporcentage) {
        this.miniporcentage = miniporcentage;
    }

    public OffreEmploi getOffreEmploi() {
        return offreEmploi;
    }

    public void setOffreEmploi(OffreEmploi offreEmploi) {
        this.offreEmploi = offreEmploi;
    }

    public List<Competence> getCompetences() {
        return competences;
    }

    public void setCompetences(List<Competence> competences) {
        this.competences = competences;
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
        if (!(object instanceof CompetenceOffre)) {
            return false;
        }
        CompetenceOffre other = (CompetenceOffre) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CompetenceOffre{" + "id=" + id + ", miniporcentage=" + miniporcentage + '}';
    }

}
