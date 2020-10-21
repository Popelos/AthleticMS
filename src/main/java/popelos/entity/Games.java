/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package popelos.entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author popelos
 */
@Entity
@Table(name = "games")
@NamedQueries({
    @NamedQuery(name = "Games.findAll", query = "SELECT g FROM Games g")
    , @NamedQuery(name = "Games.findById", query = "SELECT g FROM Games g WHERE g.id = :id")
    , @NamedQuery(name = "Games.findByGameDate", query = "SELECT g FROM Games g WHERE g.gameDate = :gameDate")
    , @NamedQuery(name = "Games.findByResult", query = "SELECT g FROM Games g WHERE g.result = :result")})
public class Games implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "game_date")
    @Temporal(TemporalType.DATE)
    private Date gameDate;
    @Size(max = 4)
    @Column(name = "result")
    private String result;
    @JoinColumn(name = "sid", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Stadium sid;
    @JoinColumn(name = "tid", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Team tid;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "gid")
    private Collection<Performances> performancesCollection;

    public Games() {
    }

    public Games(Integer id) {
        this.id = id;
    }

    public Games(Integer id, Date gameDate) {
        this.id = id;
        this.gameDate = gameDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getGameDate() {
        return gameDate;
    }

    public void setGameDate(Date gameDate) {
        this.gameDate = gameDate;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Stadium getSid() {
        return sid;
    }

    public void setSid(Stadium sid) {
        this.sid = sid;
    }

    public Team getTid() {
        return tid;
    }

    public void setTid(Team tid) {
        this.tid = tid;
    }

    public Collection<Performances> getPerformancesCollection() {
        return performancesCollection;
    }

    public void setPerformancesCollection(Collection<Performances> performancesCollection) {
        this.performancesCollection = performancesCollection;
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
        if (!(object instanceof Games)) {
            return false;
        }
        Games other = (Games) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "popelos.entity.Games[ id=" + id + " ]";
    }
    
}
