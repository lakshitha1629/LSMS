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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "com_lab_facilities", catalog = "lsms1", schema = "")
@NamedQueries({
    @NamedQuery(name = "ComLabFacilities.findAll", query = "SELECT c FROM ComLabFacilities c")
    , @NamedQuery(name = "ComLabFacilities.findByLabId", query = "SELECT c FROM ComLabFacilities c WHERE c.labId = :labId")
    , @NamedQuery(name = "ComLabFacilities.findByEquipment", query = "SELECT c FROM ComLabFacilities c WHERE c.equipment = :equipment")
    , @NamedQuery(name = "ComLabFacilities.findByMcl", query = "SELECT c FROM ComLabFacilities c WHERE c.mcl = :mcl")
    , @NamedQuery(name = "ComLabFacilities.findByDblock", query = "SELECT c FROM ComLabFacilities c WHERE c.dblock = :dblock")
    , @NamedQuery(name = "ComLabFacilities.findByDblock2", query = "SELECT c FROM ComLabFacilities c WHERE c.dblock2 = :dblock2")
    , @NamedQuery(name = "ComLabFacilities.findByEblock", query = "SELECT c FROM ComLabFacilities c WHERE c.eblock = :eblock")})
public class ComLabFacilities implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "lab_id")
    private Integer labId;
    @Column(name = "equipment")
    private String equipment;
    @Column(name = "MCL")
    private String mcl;
    @Column(name = "D_block")
    private String dblock;
    @Basic(optional = false)
    @Column(name = "D_block2")
    private String dblock2;
    @Basic(optional = false)
    @Column(name = "E_block")
    private String eblock;

    public ComLabFacilities() {
    }

    public ComLabFacilities(Integer labId) {
        this.labId = labId;
    }

    public ComLabFacilities(Integer labId, String dblock2, String eblock) {
        this.labId = labId;
        this.dblock2 = dblock2;
        this.eblock = eblock;
    }

    public Integer getLabId() {
        return labId;
    }

    public void setLabId(Integer labId) {
        Integer oldLabId = this.labId;
        this.labId = labId;
        changeSupport.firePropertyChange("labId", oldLabId, labId);
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        String oldEquipment = this.equipment;
        this.equipment = equipment;
        changeSupport.firePropertyChange("equipment", oldEquipment, equipment);
    }

    public String getMcl() {
        return mcl;
    }

    public void setMcl(String mcl) {
        String oldMcl = this.mcl;
        this.mcl = mcl;
        changeSupport.firePropertyChange("mcl", oldMcl, mcl);
    }

    public String getDblock() {
        return dblock;
    }

    public void setDblock(String dblock) {
        String oldDblock = this.dblock;
        this.dblock = dblock;
        changeSupport.firePropertyChange("dblock", oldDblock, dblock);
    }

    public String getDblock2() {
        return dblock2;
    }

    public void setDblock2(String dblock2) {
        String oldDblock2 = this.dblock2;
        this.dblock2 = dblock2;
        changeSupport.firePropertyChange("dblock2", oldDblock2, dblock2);
    }

    public String getEblock() {
        return eblock;
    }

    public void setEblock(String eblock) {
        String oldEblock = this.eblock;
        this.eblock = eblock;
        changeSupport.firePropertyChange("eblock", oldEblock, eblock);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (labId != null ? labId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ComLabFacilities)) {
            return false;
        }
        ComLabFacilities other = (ComLabFacilities) object;
        if ((this.labId == null && other.labId != null) || (this.labId != null && !this.labId.equals(other.labId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "project.ComLabFacilities[ labId=" + labId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
