/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Anushka
 */
@Entity
@Table(name = "hall_facilities1", catalog = "lsms1", schema = "")
@NamedQueries({
    @NamedQuery(name = "HallFacilities1.findAll", query = "SELECT h FROM HallFacilities1 h")
    , @NamedQuery(name = "HallFacilities1.findByHallid", query = "SELECT h FROM HallFacilities1 h WHERE h.hallid = :hallid")
    , @NamedQuery(name = "HallFacilities1.findByA1", query = "SELECT h FROM HallFacilities1 h WHERE h.a1 = :a1")
    , @NamedQuery(name = "HallFacilities1.findByA2", query = "SELECT h FROM HallFacilities1 h WHERE h.a2 = :a2")
    , @NamedQuery(name = "HallFacilities1.findByA3", query = "SELECT h FROM HallFacilities1 h WHERE h.a3 = :a3")
    , @NamedQuery(name = "HallFacilities1.findByC1", query = "SELECT h FROM HallFacilities1 h WHERE h.c1 = :c1")
    , @NamedQuery(name = "HallFacilities1.findByC2", query = "SELECT h FROM HallFacilities1 h WHERE h.c2 = :c2")
    , @NamedQuery(name = "HallFacilities1.findByC3", query = "SELECT h FROM HallFacilities1 h WHERE h.c3 = :c3")
    , @NamedQuery(name = "HallFacilities1.findByD1", query = "SELECT h FROM HallFacilities1 h WHERE h.d1 = :d1")
    , @NamedQuery(name = "HallFacilities1.findByD2", query = "SELECT h FROM HallFacilities1 h WHERE h.d2 = :d2")
    , @NamedQuery(name = "HallFacilities1.findByD3", query = "SELECT h FROM HallFacilities1 h WHERE h.d3 = :d3")
    , @NamedQuery(name = "HallFacilities1.findByF1", query = "SELECT h FROM HallFacilities1 h WHERE h.f1 = :f1")
    , @NamedQuery(name = "HallFacilities1.findByF2", query = "SELECT h FROM HallFacilities1 h WHERE h.f2 = :f2")
    , @NamedQuery(name = "HallFacilities1.findByF3", query = "SELECT h FROM HallFacilities1 h WHERE h.f3 = :f3")
    , @NamedQuery(name = "HallFacilities1.findByEquipment", query = "SELECT h FROM HallFacilities1 h WHERE h.equipment = :equipment")})
public class HallFacilities1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Hall_id")
    private Integer hallid;
    @Basic(optional = false)
    @Column(name = "A1")
    private String a1;
    @Basic(optional = false)
    @Column(name = "A2")
    private String a2;
    @Basic(optional = false)
    @Column(name = "A3")
    private String a3;
    @Basic(optional = false)
    @Column(name = "C1")
    private String c1;
    @Basic(optional = false)
    @Column(name = "C2")
    private String c2;
    @Basic(optional = false)
    @Column(name = "C3")
    private String c3;
    @Basic(optional = false)
    @Column(name = "D1")
    private String d1;
    @Basic(optional = false)
    @Column(name = "D2")
    private String d2;
    @Basic(optional = false)
    @Column(name = "D3")
    private String d3;
    @Basic(optional = false)
    @Column(name = "F1")
    private String f1;
    @Basic(optional = false)
    @Column(name = "F2")
    private String f2;
    @Basic(optional = false)
    @Column(name = "F3")
    private String f3;
    @Column(name = "Equipment")
    private String equipment;

    public HallFacilities1() {
    }

    public HallFacilities1(Integer hallid) {
        this.hallid = hallid;
    }

    public HallFacilities1(Integer hallid, String a1, String a2, String a3, String c1, String c2, String c3, String d1, String d2, String d3, String f1, String f2, String f3) {
        this.hallid = hallid;
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        this.f1 = f1;
        this.f2 = f2;
        this.f3 = f3;
    }

    public Integer getHallid() {
        return hallid;
    }

    public void setHallid(Integer hallid) {
        Integer oldHallid = this.hallid;
        this.hallid = hallid;
        changeSupport.firePropertyChange("hallid", oldHallid, hallid);
    }

    public String getA1() {
        return a1;
    }

    public void setA1(String a1) {
        String oldA1 = this.a1;
        this.a1 = a1;
        changeSupport.firePropertyChange("A1", oldA1, a1);
    }

    public String getA2() {
        return a2;
    }

    public void setA2(String a2) {
        String oldA2 = this.a2;
        this.a2 = a2;
        changeSupport.firePropertyChange("A2", oldA2, a2);
    }

    public String getA3() {
        return a3;
    }

    public void setA3(String a3) {
        String oldA3 = this.a3;
        this.a3 = a3;
        changeSupport.firePropertyChange("A3", oldA3, a3);
    }

    public String getC1() {
        return c1;
    }

    public void setC1(String c1) {
        String oldC1 = this.c1;
        this.c1 = c1;
        changeSupport.firePropertyChange("C1", oldC1, c1);
    }

    public String getC2() {
        return c2;
    }

    public void setC2(String c2) {
        String oldC2 = this.c2;
        this.c2 = c2;
        changeSupport.firePropertyChange("C2", oldC2, c2);
    }

    public String getC3() {
        return c3;
    }

    public void setC3(String c3) {
        String oldC3 = this.c3;
        this.c3 = c3;
        changeSupport.firePropertyChange("C3", oldC3, c3);
    }

    public String getD1() {
        return d1;
    }

    public void setD1(String d1) {
        String oldD1 = this.d1;
        this.d1 = d1;
        changeSupport.firePropertyChange("D1", oldD1, d1);
    }

    public String getD2() {
        return d2;
    }

    public void setD2(String d2) {
        String oldD2 = this.d2;
        this.d2 = d2;
        changeSupport.firePropertyChange("D2", oldD2, d2);
    }

    public String getD3() {
        return d3;
    }

    public void setD3(String d3) {
        String oldD3 = this.d3;
        this.d3 = d3;
        changeSupport.firePropertyChange("D3", oldD3, d3);
    }

    public String getF1() {
        return f1;
    }

    public void setF1(String f1) {
        String oldF1 = this.f1;
        this.f1 = f1;
        changeSupport.firePropertyChange("F1", oldF1, f1);
    }

    public String getF2() {
        return f2;
    }

    public void setF2(String f2) {
        String oldF2 = this.f2;
        this.f2 = f2;
        changeSupport.firePropertyChange("F2", oldF2, f2);
    }

    public String getF3() {
        return f3;
    }

    public void setF3(String f3) {
        String oldF3 = this.f3;
        this.f3 = f3;
        changeSupport.firePropertyChange("F3", oldF3, f3);
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        String oldEquipment = this.equipment;
        this.equipment = equipment;
        changeSupport.firePropertyChange("equipment", oldEquipment, equipment);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (hallid != null ? hallid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HallFacilities1)) {
            return false;
        }
        HallFacilities1 other = (HallFacilities1) object;
        if ((this.hallid == null && other.hallid != null) || (this.hallid != null && !this.hallid.equals(other.hallid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "project.HallFacilities1[ hallid=" + hallid + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
