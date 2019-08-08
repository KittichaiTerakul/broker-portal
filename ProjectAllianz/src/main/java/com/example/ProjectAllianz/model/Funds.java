package com.example.ProjectAllianz.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="fund")
public class Funds {

    @Id
    @Column(name = "percent")
    private int percent;

    @Column(name = "name")
    private String name;

    @Column(name = "informationQuoteId")
    private int id;

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
