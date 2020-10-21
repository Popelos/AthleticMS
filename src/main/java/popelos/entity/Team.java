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
@Table(name = "team")
@NamedQueries({
    @NamedQuery(name = "Team.findAll", query = "SELECT t FROM Team t")
    , @NamedQuery(name = "Team.findById", query = "SELECT t FROM Team t WHERE t.id = :id")
    , @NamedQuery(name = "Team.findBySport", query = "SELECT t FROM Team t WHERE t.sport = :sport")})
public class Team implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 10)
    @Column(name = "sport")
    private String sport;
    @OneToMany(mappedBy = "tid")
    private Collection<Athlete> athleteCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tid")
    private Collection<Games> gamesCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tid")
    private Collection<Coach> coachCollection;

    public Team() {
    }

    public Team(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public Collection<Athlete> getAthleteCollection() {
        return athleteCollection;
    }

    public void setAthleteCollection(Collection<Athlete> athleteCollection) {
        this.athleteCollection = athleteCollection;
    }

    public Collection<Games> getGamesCollection() {
        return gamesCollection;
    }

    public void setGamesCollection(Collection<Games> gamesCollection) {
        this.gamesCollection = gamesCollection;
    }

    public Collection<Coach> getCoachCollection() {
        return coachCollection;
    }

    public void setCoachCollection(Collection<Coach> coachCollection) {
        this.coachCollection = coachCollection;
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
        if (!(object instanceof Team)) {
            return false;
        }
        Team other = (Team) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "popelos.entity.Team[ id=" + id + " ]";
    }
    
}
