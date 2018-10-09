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
@Table(name = "subject_names", catalog = "lsms1", schema = "")
@NamedQueries({
    @NamedQuery(name = "SubjectNames.findAll", query = "SELECT s FROM SubjectNames s")
    , @NamedQuery(name = "SubjectNames.findBySubjectCodes", query = "SELECT s FROM SubjectNames s WHERE s.subjectCodes = :subjectCodes")
    , @NamedQuery(name = "SubjectNames.findBySubjectNames", query = "SELECT s FROM SubjectNames s WHERE s.subjectNames = :subjectNames")})
public class SubjectNames implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "subject_codes")
    private String subjectCodes;
    @Column(name = "subject_Names")
    private String subjectNames;

    public SubjectNames() {
    }

    public SubjectNames(String subjectCodes) {
        this.subjectCodes = subjectCodes;
    }

    public String getSubjectCodes() {
        return subjectCodes;
    }

    public void setSubjectCodes(String subjectCodes) {
        String oldSubjectCodes = this.subjectCodes;
        this.subjectCodes = subjectCodes;
        changeSupport.firePropertyChange("subjectCodes", oldSubjectCodes, subjectCodes);
    }

    public String getSubjectNames() {
        return subjectNames;
    }

    public void setSubjectNames(String subjectNames) {
        String oldSubjectNames = this.subjectNames;
        this.subjectNames = subjectNames;
        changeSupport.firePropertyChange("subjectNames", oldSubjectNames, subjectNames);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (subjectCodes != null ? subjectCodes.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SubjectNames)) {
            return false;
        }
        SubjectNames other = (SubjectNames) object;
        if ((this.subjectCodes == null && other.subjectCodes != null) || (this.subjectCodes != null && !this.subjectCodes.equals(other.subjectCodes))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "project.SubjectNames[ subjectCodes=" + subjectCodes + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
