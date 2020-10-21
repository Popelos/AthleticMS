/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package popelos.entity;

import java.io.Serializable;
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
import javax.validation.constraints.NotNull;

/**
 *
 * @author popelos
 */
@Entity
@Table(name = "performances")
@NamedQueries({
    @NamedQuery(name = "Performances.findAll", query = "SELECT p FROM Performances p")
    , @NamedQuery(name = "Performances.findById", query = "SELECT p FROM Performances p WHERE p.id = :id")
    , @NamedQuery(name = "Performances.findByPerformance", query = "SELECT p FROM Performances p WHERE p.performance = :performance")})
public class Performances implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "performance")
    private int performance;
    @JoinColumn(name = "aid", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Athlete aid;
    @JoinColumn(name = "gid", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Games gid;

    public Performances() {
    }

    public Performances(Integer id) {
        this.id = id;
    }

    public Performances(Integer id, int performance) {
        this.id = id;
        this.performance = performance;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getPerformance() {
        return performance;
    }

    public void setPerformance(int performance) {
        this.performance = performance;
    }

    public Athlete getAid() {
        return aid;
    }

    public void setAid(Athlete aid) {
        this.aid = aid;
    }

    public Games getGid() {
        return gid;
    }

    public void setGid(Games gid) {
        this.gid = gid;
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
        if (!(object instanceof Performances)) {
            return false;
        }
        Performances other = (Performances) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "popelos.entity.Performances[ id=" + id + " ]";
    }
    
}
