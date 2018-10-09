/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timeTable;

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
 * @author Madushka
 */
@Entity
@Table(name = "cst1_2", catalog = "lsms1", schema = "")
@NamedQueries({
    @NamedQuery(name = "Cst12.findAll", query = "SELECT c FROM Cst12 c")
    , @NamedQuery(name = "Cst12.findById", query = "SELECT c FROM Cst12 c WHERE c.id = :id")
    , @NamedQuery(name = "Cst12.findByTime", query = "SELECT c FROM Cst12 c WHERE c.time = :time")
    , @NamedQuery(name = "Cst12.findByMonday", query = "SELECT c FROM Cst12 c WHERE c.monday = :monday")
    , @NamedQuery(name = "Cst12.findByTuesday", query = "SELECT c FROM Cst12 c WHERE c.tuesday = :tuesday")
    , @NamedQuery(name = "Cst12.findByWednesday", query = "SELECT c FROM Cst12 c WHERE c.wednesday = :wednesday")
    , @NamedQuery(name = "Cst12.findByThursday", query = "SELECT c FROM Cst12 c WHERE c.thursday = :thursday")
    , @NamedQuery(name = "Cst12.findByFriday", query = "SELECT c FROM Cst12 c WHERE c.friday = :friday")
    , @NamedQuery(name = "Cst12.findBySaturday", query = "SELECT c FROM Cst12 c WHERE c.saturday = :saturday")
    , @NamedQuery(name = "Cst12.findBySunday", query = "SELECT c FROM Cst12 c WHERE c.sunday = :sunday")})
public class Cst12 implements Serializable {

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

    public Cst12() {
    }

    public Cst12(String id) {
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
        if (!(object instanceof Cst12)) {
            return false;
        }
        Cst12 other = (Cst12) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "timeTable.Cst12[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
