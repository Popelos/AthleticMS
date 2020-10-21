/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package popelos.entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author popelos
 */
@Entity
@Table(name = "stadium")
@NamedQueries({
    @NamedQuery(name = "Stadium.findAll", query = "SELECT s FROM Stadium s")
    , @NamedQuery(name = "Stadium.findById", query = "SELECT s FROM Stadium s WHERE s.id = :id")
    , @NamedQuery(name = "Stadium.findByLocation", query = "SELECT s FROM Stadium s WHERE s.location = :location")})
public class Stadium implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 5)
    @Column(name = "location")
    private String location;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sid")
    private Collection<Games> gamesCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sid")
    private Collection<Trainings> trainingsCollection;

    public Stadium() {
    }

    public Stadium(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Collection<Games> getGamesCollection() {
        return gamesCollection;
    }

    public void setGamesCollection(Collection<Games> gamesCollection) {
        this.gamesCollection = gamesCollection;
    }

    public Collection<Trainings> getTrainingsCollection() {
        return trainingsCollection;
    }

    public void setTrainingsCollection(Collection<Trainings> trainingsCollection) {
        this.trainingsCollection = trainingsCollection;
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
        if (!(object instanceof Stadium)) {
            return false;
        }
        Stadium other = (Stadium) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "popelos.entity.Stadium[ id=" + id + " ]";
    }
    
}
