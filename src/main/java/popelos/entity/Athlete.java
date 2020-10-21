/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package popelos.entity;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "athlete")
@NamedQueries({
    @NamedQuery(name = "Athlete.findAll", query = "SELECT a FROM Athlete a")
    , @NamedQuery(name = "Athlete.findById", query = "SELECT a FROM Athlete a WHERE a.id = :id")
    , @NamedQuery(name = "Athlete.findByName", query = "SELECT a FROM Athlete a WHERE a.name = :name")
    , @NamedQuery(name = "Athlete.findByAge", query = "SELECT a FROM Athlete a WHERE a.age = :age")
    , @NamedQuery(name = "Athlete.findByHeight", query = "SELECT a FROM Athlete a WHERE a.height = :height")
    , @NamedQuery(name = "Athlete.findByWeight", query = "SELECT a FROM Athlete a WHERE a.weight = :weight")
    , @NamedQuery(name = "Athlete.findByDateOfBirth", query = "SELECT a FROM Athlete a WHERE a.dateOfBirth = :dateOfBirth")})
public class Athlete implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "age")
    private int age;
    @Basic(optional = false)
    @NotNull
    @Column(name = "height")
    private BigDecimal height;
    @Basic(optional = false)
    @NotNull
    @Column(name = "weight")
    private BigDecimal weight;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date_of_birth")
    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;
    @JoinColumn(name = "tid", referencedColumnName = "id")
    @ManyToOne
    private Team tid;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "aid")
    private Collection<Trainings> trainingsCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "aid")
    private Collection<Performances> performancesCollection;

    public Athlete() {
    }

    public Athlete(Integer id) {
        this.id = id;
    }

    public Athlete(Integer id, String name, int age, BigDecimal height, BigDecimal weight, Date dateOfBirth) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.dateOfBirth = dateOfBirth;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public BigDecimal getHeight() {
        return height;
    }

    public void setHeight(BigDecimal height) {
        this.height = height;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Team getTid() {
        return tid;
    }

    public void setTid(Team tid) {
        this.tid = tid;
    }

    public Collection<Trainings> getTrainingsCollection() {
        return trainingsCollection;
    }

    public void setTrainingsCollection(Collection<Trainings> trainingsCollection) {
        this.trainingsCollection = trainingsCollection;
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
        if (!(object instanceof Athlete)) {
            return false;
        }
        Athlete other = (Athlete) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "popelos.entity.Athlete[ id=" + id + " ]";
    }
    
}
