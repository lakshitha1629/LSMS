/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Anushka
 */
@Entity
@Table(name = "all_timetables_monday", catalog = "lsms1", schema = "")
@NamedQueries({
    @NamedQuery(name = "AllTimetablesMonday_1.findAll", query = "SELECT a FROM AllTimetablesMonday_1 a")
    , @NamedQuery(name = "AllTimetablesMonday_1.findById", query = "SELECT a FROM AllTimetablesMonday_1 a WHERE a.id = :id")
    , @NamedQuery(name = "AllTimetablesMonday_1.findByTime", query = "SELECT a FROM AllTimetablesMonday_1 a WHERE a.time = :time")
    , @NamedQuery(name = "AllTimetablesMonday_1.findByA1", query = "SELECT a FROM AllTimetablesMonday_1 a WHERE a.a1 = :a1")
    , @NamedQuery(name = "AllTimetablesMonday_1.findByMlt", query = "SELECT a FROM AllTimetablesMonday_1 a WHERE a.mlt = :mlt")
    , @NamedQuery(name = "AllTimetablesMonday_1.findByMcl", query = "SELECT a FROM AllTimetablesMonday_1 a WHERE a.mcl = :mcl")
    , @NamedQuery(name = "AllTimetablesMonday_1.findByD1", query = "SELECT a FROM AllTimetablesMonday_1 a WHERE a.d1 = :d1")
    , @NamedQuery(name = "AllTimetablesMonday_1.findByD3", query = "SELECT a FROM AllTimetablesMonday_1 a WHERE a.d3 = :d3")
    , @NamedQuery(name = "AllTimetablesMonday_1.findByE1", query = "SELECT a FROM AllTimetablesMonday_1 a WHERE a.e1 = :e1")
    , @NamedQuery(name = "AllTimetablesMonday_1.findByE3", query = "SELECT a FROM AllTimetablesMonday_1 a WHERE a.e3 = :e3")
    , @NamedQuery(name = "AllTimetablesMonday_1.findByF3", query = "SELECT a FROM AllTimetablesMonday_1 a WHERE a.f3 = :f3")
    , @NamedQuery(name = "AllTimetablesMonday_1.findByPhyLab", query = "SELECT a FROM AllTimetablesMonday_1 a WHERE a.phyLab = :phyLab")
    , @NamedQuery(name = "AllTimetablesMonday_1.findByBioLab", query = "SELECT a FROM AllTimetablesMonday_1 a WHERE a.bioLab = :bioLab")})
public class AllTimetablesMonday_1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Column(name = "Time")
    private String time;
    @Column(name = "A1")
    private String a1;
    @Column(name = "MLT")
    private String mlt;
    @Column(name = "MCL")
    private String mcl;
    @Column(name = "D1")
    private String d1;
    @Column(name = "D3")
    private String d3;
    @Column(name = "E1")
    private String e1;
    @Column(name = "E3")
    private String e3;
    @Column(name = "F3")
    private String f3;
    @Column(name = "Phy Lab")
    private String phyLab;
    @Column(name = "Bio Lab")
    private String bioLab;

    public AllTimetablesMonday_1() {
    }

    public AllTimetablesMonday_1(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getA1() {
        return a1;
    }

    public void setA1(String a1) {
        this.a1 = a1;
    }

    public String getMlt() {
        return mlt;
    }

    public void setMlt(String mlt) {
        this.mlt = mlt;
    }

    public String getMcl() {
        return mcl;
    }

    public void setMcl(String mcl) {
        this.mcl = mcl;
    }

    public String getD1() {
        return d1;
    }

    public void setD1(String d1) {
        this.d1 = d1;
    }

    public String getD3() {
        return d3;
    }

    public void setD3(String d3) {
        this.d3 = d3;
    }

    public String getE1() {
        return e1;
    }

    public void setE1(String e1) {
        this.e1 = e1;
    }

    public String getE3() {
        return e3;
    }

    public void setE3(String e3) {
        this.e3 = e3;
    }

    public String getF3() {
        return f3;
    }

    public void setF3(String f3) {
        this.f3 = f3;
    }

    public String getPhyLab() {
        return phyLab;
    }

    public void setPhyLab(String phyLab) {
        this.phyLab = phyLab;
    }

    public String getBioLab() {
        return bioLab;
    }

    public void setBioLab(String bioLab) {
        this.bioLab = bioLab;
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
        if (!(object instanceof AllTimetablesMonday_1)) {
            return false;
        }
        AllTimetablesMonday_1 other = (AllTimetablesMonday_1) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "project.AllTimetablesMonday_1[ id=" + id + " ]";
    }
    
}
