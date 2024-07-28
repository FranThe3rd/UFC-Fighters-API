package com.ufc.ultimate_fighting_championship;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ufc_fighters")
public class Fighters {

    @Id
    private Integer id;
    private String name;
    private String height;
    private String weight;
    private String reach;
    private String stance;
    private String dob;
    private String url;


    public Fighters() {
    }

    public Fighters(Integer id, String name, String height, String weight, String reach, String stance, String dob, String url) {
        this.id = id;
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.reach = reach;
        this.stance = stance;
        this.dob = dob;
        this.url = url;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getReach() {
        return reach;
    }

    public void setReach(String reach) {
        this.reach = reach;
    }

    public String getStance() {
        return stance;
    }

    public void setStance(String stance) {
        this.stance = stance;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
