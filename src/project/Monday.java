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
@Table(name = "monday", catalog = "lsms1", schema = "")
@NamedQueries({
    @NamedQuery(name = "Monday.findAll", query = "SELECT m FROM Monday m")
    , @NamedQuery(name = "Monday.findById", query = "SELECT m FROM Monday m WHERE m.id = :id")
    , @NamedQuery(name = "Monday.findByTime", query = "SELECT m FROM Monday m WHERE m.time = :time")
    , @NamedQuery(name = "Monday.findByD1", query = "SELECT m FROM Monday m WHERE m.d1 = :d1")})
public class Monday implements Serializable {

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

    public Monday() {
    }

    public Monday(String id) {
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Monday)) {
            return false;
        }
        Monday other = (Monday) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "project.Monday[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
