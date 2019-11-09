package com.example.sagartraining;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FamilyEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;



    private String father;
    private String mother;
    private String sibiling;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public String getMother() {
        return mother;
    }

    public void setMother(String mother) {
        this.mother = mother;
    }

    public String getSibiling() {
        return sibiling;
    }

    public void setSibiling(String sibiling) {
        this.sibiling = sibiling;
    }

    @Override
    public String toString() {
        return "FamilyEntity{" +
                "Id=" + Id +
                ", father='" + father + '\'' +
                ", mother='" + mother + '\'' +
                ", sibiling='" + sibiling + '\'' +
                '}';
    }
}
