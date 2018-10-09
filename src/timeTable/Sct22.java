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
@Table(name = "sct2_2", catalog = "lsms1", schema = "")
@NamedQueries({
    @NamedQuery(name = "Sct22.findAll", query = "SELECT s FROM Sct22 s")
    , @NamedQuery(name = "Sct22.findById", query = "SELECT s FROM Sct22 s WHERE s.id = :id")
    , @NamedQuery(name = "Sct22.findByTime", query = "SELECT s FROM Sct22 s WHERE s.time = :time")
    , @NamedQuery(name = "Sct22.findByMonday", query = "SELECT s FROM Sct22 s WHERE s.monday = :monday")
    , @NamedQuery(name = "Sct22.findByTuesday", query = "SELECT s FROM Sct22 s WHERE s.tuesday = :tuesday")
    , @NamedQuery(name = "Sct22.findByWednesday", query = "SELECT s FROM Sct22 s WHERE s.wednesday = :wednesday")
    , @NamedQuery(name = "Sct22.findByThursday", query = "SELECT s FROM Sct22 s WHERE s.thursday = :thursday")
    , @NamedQuery(name = "Sct22.findByFriday", query = "SELECT s FROM Sct22 s WHERE s.friday = :friday")
    , @NamedQuery(name = "Sct22.findBySaturday", query = "SELECT s FROM Sct22 s WHERE s.saturday = :saturday")
    , @NamedQuery(name = "Sct22.findBySunday", query = "SELECT s FROM Sct22 s WHERE s.sunday = :sunday")})
public class Sct22 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "Time")
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

    public Sct22() {
    }

    public Sct22(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
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
        if (!(object instanceof Sct22)) {
            return false;
        }
        Sct22 other = (Sct22) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "timeTable.Sct22[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
