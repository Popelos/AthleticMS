/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package popelos.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

/**
 *
 * @author popelos
 */
@Entity
@Table(name = "trainings")
@NamedQueries({
    @NamedQuery(name = "Trainings.findAll", query = "SELECT t FROM Trainings t")
    , @NamedQuery(name = "Trainings.findById", query = "SELECT t FROM Trainings t WHERE t.id = :id")
    , @NamedQuery(name = "Trainings.findByTainingDate", query = "SELECT t FROM Trainings t WHERE t.trainingDate = :trainingDate")
    , @NamedQuery(name = "Trainings.findByAttended", query = "SELECT t FROM Trainings t WHERE t.attended = :attended")})
public class Trainings implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "training_date")
    @Temporal(TemporalType.DATE)
    private Date trainingDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "attended")
    private boolean attended;
    @JoinColumn(name = "aid", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Athlete aid;
    @JoinColumn(name = "sid", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Stadium sid;

    public Trainings() {
    }

    public Trainings(Integer id) {
        this.id = id;
    }

    public Trainings(Integer id, Date trainingDate, boolean attended) {
        this.id = id;
        this.trainingDate = trainingDate;
        this.attended = attended;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getTrainingDate() {
        return trainingDate;
    }

    public void setTrainingDate(Date trainingDate) {
        this.trainingDate = trainingDate;
    }

    public boolean getAttended() {
        return attended;
    }

    public void setAttended(boolean attended) {
        this.attended = attended;
    }

    public Athlete getAid() {
        return aid;
    }

    public void setAid(Athlete aid) {
        this.aid = aid;
    }

    public Stadium getSid() {
        return sid;
    }

    public void setSid(Stadium sid) {
        this.sid = sid;
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
        if (!(object instanceof Trainings)) {
            return false;
        }
        Trainings other = (Trainings) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "popelos.entity.Trainings[ id=" + id + " ]";
    }
    
}
