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
 * @author User
 */
@Entity
@Table(name = "userdetails", catalog = "lsms1", schema = "")
@NamedQueries({
    @NamedQuery(name = "Userdetails.findAll", query = "SELECT u FROM Userdetails u")
    , @NamedQuery(name = "Userdetails.findByUsername", query = "SELECT u FROM Userdetails u WHERE u.username = :username")
    , @NamedQuery(name = "Userdetails.findByPassword", query = "SELECT u FROM Userdetails u WHERE u.password = :password")
    , @NamedQuery(name = "Userdetails.findByEmail", query = "SELECT u FROM Userdetails u WHERE u.email = :email")
    , @NamedQuery(name = "Userdetails.findByContact", query = "SELECT u FROM Userdetails u WHERE u.contact = :contact")
    , @NamedQuery(name = "Userdetails.findByPerson", query = "SELECT u FROM Userdetails u WHERE u.person = :person")
    , @NamedQuery(name = "Userdetails.findByActivated", query = "SELECT u FROM Userdetails u WHERE u.activated = :activated")
    , @NamedQuery(name = "Userdetails.findByUserId", query = "SELECT u FROM Userdetails u WHERE u.userId = :userId")})
public class Userdetails implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
    @Column(name = "email")
    private String email;
    @Column(name = "contact")
    private Integer contact;
    @Column(name = "person")
    private String person;
    @Basic(optional = false)
    @Column(name = "activated")
    private int activated;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "user_id")
    private Integer userId;

    public Userdetails() {
    }

    public Userdetails(Integer userId) {
        this.userId = userId;
    }

    public Userdetails(Integer userId, int activated) {
        this.userId = userId;
        this.activated = activated;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        String oldUsername = this.username;
        this.username = username;
        changeSupport.firePropertyChange("username", oldUsername, username);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        String oldPassword = this.password;
        this.password = password;
        changeSupport.firePropertyChange("password", oldPassword, password);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public Integer getContact() {
        return contact;
    }

    public void setContact(Integer contact) {
        Integer oldContact = this.contact;
        this.contact = contact;
        changeSupport.firePropertyChange("contact", oldContact, contact);
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        String oldPerson = this.person;
        this.person = person;
        changeSupport.firePropertyChange("person", oldPerson, person);
    }

    public int getActivated() {
        return activated;
    }

    public void setActivated(int activated) {
        int oldActivated = this.activated;
        this.activated = activated;
        changeSupport.firePropertyChange("activated", oldActivated, activated);
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        Integer oldUserId = this.userId;
        this.userId = userId;
        changeSupport.firePropertyChange("userId", oldUserId, userId);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userId != null ? userId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Userdetails)) {
            return false;
        }
        Userdetails other = (Userdetails) object;
        if ((this.userId == null && other.userId != null) || (this.userId != null && !this.userId.equals(other.userId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "project.Userdetails[ userId=" + userId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
