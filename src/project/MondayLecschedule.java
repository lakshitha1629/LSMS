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
@Table(name = "monday_lecschedule", catalog = "lsms1", schema = "")
@NamedQueries({
    @NamedQuery(name = "MondayLecschedule.findAll", query = "SELECT m FROM MondayLecschedule m")
    , @NamedQuery(name = "MondayLecschedule.findById", query = "SELECT m FROM MondayLecschedule m WHERE m.id = :id")
    , @NamedQuery(name = "MondayLecschedule.findByTime", query = "SELECT m FROM MondayLecschedule m WHERE m.time = :time")
    , @NamedQuery(name = "MondayLecschedule.findByD1", query = "SELECT m FROM MondayLecschedule m WHERE m.d1 = :d1")
    , @NamedQuery(name = "MondayLecschedule.findByD3", query = "SELECT m FROM MondayLecschedule m WHERE m.d3 = :d3")
    , @NamedQuery(name = "MondayLecschedule.findByMlt", query = "SELECT m FROM MondayLecschedule m WHERE m.mlt = :mlt")
    , @NamedQuery(name = "MondayLecschedule.findByMcl", query = "SELECT m FROM MondayLecschedule m WHERE m.mcl = :mcl")
    , @NamedQuery(name = "MondayLecschedule.findByE1", query = "SELECT m FROM MondayLecschedule m WHERE m.e1 = :e1")
    , @NamedQuery(name = "MondayLecschedule.findByE3", query = "SELECT m FROM MondayLecschedule m WHERE m.e3 = :e3")
    , @NamedQuery(name = "MondayLecschedule.findByA1", query = "SELECT m FROM MondayLecschedule m WHERE m.a1 = :a1")
    , @NamedQuery(name = "MondayLecschedule.findByF3", query = "SELECT m FROM MondayLecschedule m WHERE m.f3 = :f3")
    , @NamedQuery(name = "MondayLecschedule.findByChemPhyLab", query = "SELECT m FROM MondayLecschedule m WHERE m.chemPhyLab = :chemPhyLab")
    , @NamedQuery(name = "MondayLecschedule.findByBioLab", query = "SELECT m FROM MondayLecschedule m WHERE m.bioLab = :bioLab")})
public class MondayLecschedule implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private String id;
    @Column(name = "Time")
    private String time;
    @Column(name = "D1")
    private String d1;
    @Column(name = "D3")
    private String d3;
    @Column(name = "MLT")
    private String mlt;
    @Column(name = "MCL")
    private String mcl;
    @Column(name = "E1")
    private String e1;
    @Column(name = "E3")
    private String e3;
    @Column(name = "A1")
    private String a1;
    @Column(name = "F3")
    private String f3;
    @Column(name = "Chem_Phy_Lab")
    private String chemPhyLab;
    @Column(name = "Bio_Lab")
    private String bioLab;

    public MondayLecschedule() {
    }

    public MondayLecschedule(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        String oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        String oldTime = this.time;
        this.time = time;
        changeSupport.firePropertyChange("time", oldTime, time);
    }

    public String getD1() {
        return d1;
    }

    public void setD1(String d1) {
        String oldD1 = this.d1;
        this.d1 = d1;
        changeSupport.firePropertyChange("D1", oldD1, d1);
    }

    public String getD3() {
        return d3;
    }

    public void setD3(String d3) {
        String oldD3 = this.d3;
        this.d3 = d3;
        changeSupport.firePropertyChange("D3", oldD3, d3);
    }

    public String getMlt() {
        return mlt;
    }

    public void setMlt(String mlt) {
        String oldMlt = this.mlt;
        this.mlt = mlt;
        changeSupport.firePropertyChange("mlt", oldMlt, mlt);
    }

    public String getMcl() {
        return mcl;
    }

    public void setMcl(String mcl) {
        String oldMcl = this.mcl;
        this.mcl = mcl;
        changeSupport.firePropertyChange("mcl", oldMcl, mcl);
    }

    public String getE1() {
        return e1;
    }

    public void setE1(String e1) {
        String oldE1 = this.e1;
        this.e1 = e1;
        changeSupport.firePropertyChange("E1", oldE1, e1);
    }

    public String getE3() {
        return e3;
    }

    public void setE3(String e3) {
        String oldE3 = this.e3;
        this.e3 = e3;
        changeSupport.firePropertyChange("E3", oldE3, e3);
    }

    public String getA1() {
        return a1;
    }

    public void setA1(String a1) {
        String oldA1 = this.a1;
        this.a1 = a1;
        changeSupport.firePropertyChange("A1", oldA1, a1);
    }

    public String getF3() {
        return f3;
    }

    public void setF3(String f3) {
        String oldF3 = this.f3;
        this.f3 = f3;
        changeSupport.firePropertyChange("F3", oldF3, f3);
    }

    public String getChemPhyLab() {
        return chemPhyLab;
    }

    public void setChemPhyLab(String chemPhyLab) {
        String oldChemPhyLab = this.chemPhyLab;
        this.chemPhyLab = chemPhyLab;
        changeSupport.firePropertyChange("chemPhyLab", oldChemPhyLab, chemPhyLab);
    }

    public String getBioLab() {
        return bioLab;
    }

    public void setBioLab(String bioLab) {
        String oldBioLab = this.bioLab;
        this.bioLab = bioLab;
        changeSupport.firePropertyChange("bioLab", oldBioLab, bioLab);
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
        if (!(object instanceof MondayLecschedule)) {
            return false;
        }
        MondayLecschedule other = (MondayLecschedule) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "project.MondayLecschedule[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
