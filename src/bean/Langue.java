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
public class Langue implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nomLangue;
    @OneToMany(mappedBy = "langue")
    private List<CompetenceLinguistique> competenceLinguistiques;

    public Langue() {
    }

    public Langue(Long id) {
        this.id = id;
    }

    public Langue( String nomLangue) {
        this.nomLangue = nomLangue;
    }

    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomLangue() {
        return nomLangue;
    }

    public void setNomLangue(String nomLangue) {
        this.nomLangue = nomLangue;
    }

    public List<CompetenceLinguistique> getCompetenceLinguistiques() {
        return competenceLinguistiques;
    }

    public void setCompetenceLinguistiques(List<CompetenceLinguistique> competenceLinguistiques) {
        this.competenceLinguistiques = competenceLinguistiques;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.id);
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
        final Langue other = (Langue) obj;
        return true;
    }

    @Override
    public String toString() {
        return "Langue{" + "id=" + id + ", nomLangue=" + nomLangue + '}';
    }
    
}

    
    