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
 * @author User
 */
@Entity
@Table(name = "iit2_2", catalog = "lsms1", schema = "")
@NamedQueries({
    @NamedQuery(name = "Iit22.findAll", query = "SELECT i FROM Iit22 i")
    , @NamedQuery(name = "Iit22.findById", query = "SELECT i FROM Iit22 i WHERE i.id = :id")
    , @NamedQuery(name = "Iit22.findByTime", query = "SELECT i FROM Iit22 i WHERE i.time = :time")
    , @NamedQuery(name = "Iit22.findByMonday", query = "SELECT i FROM Iit22 i WHERE i.monday = :monday")
    , @NamedQuery(name = "Iit22.findByTuesday", query = "SELECT i FROM Iit22 i WHERE i.tuesday = :tuesday")
    , @NamedQuery(name = "Iit22.findByWednesday", query = "SELECT i FROM Iit22 i WHERE i.wednesday = :wednesday")
    , @NamedQuery(name = "Iit22.findByThursday", query = "SELECT i FROM Iit22 i WHERE i.thursday = :thursday")
    , @NamedQuery(name = "Iit22.findByFriday", query = "SELECT i FROM Iit22 i WHERE i.friday = :friday")
    , @NamedQuery(name = "Iit22.findBySaturday", query = "SELECT i FROM Iit22 i WHERE i.saturday = :saturday")
    , @NamedQuery(name = "Iit22.findBySunday", query = "SELECT i FROM Iit22 i WHERE i.sunday = :sunday")})
public class Iit22 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private String id;
    @Column(name = "time")
    private String time;
    @Column(name = "Monday")
    private String monday;
    @Column(name = "Tuesday")
    private String tuesday;
    @Column(name = "Wednesday")
    private String wednesday;
    @Column(name = "Thursday")
    private String thursday;
    @Column(name = "Friday")
    private String friday;
    @Column(name = "Saturday")
    private String saturday;
    @Column(name = "Sunday")
    private String sunday;

    public Iit22() {
    }

    public Iit22(String id) {
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

    public String getMonday() {
        return monday;
    }

    public void setMonday(String monday) {
        String oldMonday = this.monday;
        this.monday = monday;
        changeSupport.firePropertyChange("monday", oldMonday, monday);
    }

    public String getTuesday() {
        return tuesday;
    }

    public void setTuesday(String tuesday) {
        String oldTuesday = this.tuesday;
        this.tuesday = tuesday;
        changeSupport.firePropertyChange("tuesday", oldTuesday, tuesday);
    }

    public String getWednesday() {
        return wednesday;
    }

    public void setWednesday(String wednesday) {
        String oldWednesday = this.wednesday;
        this.wednesday = wednesday;
        changeSupport.firePropertyChange("wednesday", oldWednesday, wednesday);
    }

    public String getThursday() {
        return thursday;
    }

    public void setThursday(String thursday) {
        String oldThursday = this.thursday;
        this.thursday = thursday;
        changeSupport.firePropertyChange("thursday", oldThursday, thursday);
    }

    public String getFriday() {
        return friday;
    }

    public void setFriday(String friday) {
        String oldFriday = this.friday;
        this.friday = friday;
        changeSupport.firePropertyChange("friday", oldFriday, friday);
    }

    public String getSaturday() {
        return saturday;
    }

    public void setSaturday(String saturday) {
        String oldSaturday = this.saturday;
        this.saturday = saturday;
        changeSupport.firePropertyChange("saturday", oldSaturday, saturday);
    }

    public String getSunday() {
        return sunday;
    }

    public void setSunday(String sunday) {
        String oldSunday = this.sunday;
        this.sunday = sunday;
        changeSupport.firePropertyChange("sunday", oldSunday, sunday);
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
        if (!(object instanceof Iit22)) {
            return false;
        }
        Iit22 other = (Iit22) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "project.Iit22[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
