package com.revature.baileysbarista.Models;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * classes
 */
@Entity
@Table(name = "classes")
public class Classes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column
    private String classname;
    @Column
    private String classdesc;
    @Column
    private int skillid;
    @Column
    private LocalDate startdate;
    @Column
    private int enrolled;
    @Column
    private int rep;

    public Classes(int id, String classname, String classdesc, int skillid, LocalDate startdate, int enrolled, int rep) {
        this.id = id;
        this.classname = classname;
        this.classdesc = classdesc;
        this.skillid = skillid;
        this.startdate = startdate;
        this.enrolled = enrolled;
        this.rep = rep;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public String getClassdesc() {
        return classdesc;
    }

    public void setClassdesc(String classdesc) {
        this.classdesc = classdesc;
    }

    public int getSkillid() {
        return skillid;
    }

    public void setSkillid(int skillid) {
        this.skillid = skillid;
    }

    public LocalDate getStartdate() {
        return startdate;
    }

    public void setStartdate(LocalDate startdate) {
        this.startdate = startdate;
    }

    public int getEnrolled() {
        return enrolled;
    }

    public void setEnrolled(int enrolled) {
        this.enrolled = enrolled;
    }

    public int getRep() {
        return rep;
    }

    public void setRep(int rep) {
        this.rep = rep;
    }

    public Classes() {
    }
}