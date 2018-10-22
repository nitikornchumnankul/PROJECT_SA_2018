package com.sa.group18.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.util.ArrayList;
import java.util.List;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import lombok.*;
@Entity
@Data
@Table(name="Sex")

public class Sex{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="SexId")
    private @NonNull Long sexId;
    private String sex;

    
    
    public  Sex(){}
    public  Sex(String sex) {
        this.sex=sex;
    }
    public Sex(Long sexId){
        this.sexId=sexId;
    }
}

