package com.sa.group18.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import lombok.*;

@Data
@Table(name="Profile")
@Entity
public class Profile{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="Profile_Id")
    private @NonNull Long Profile_Id;
    private @NonNull String First_Name;
    private @NonNull String Last_Name;
    private @NonNull String Sex;

  
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Data Brithday;
    @Column(length=13)
    private @NonNull String Identification_number;
   
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name= "Religion_Id")
    @JsonBackReference
    private Religion Religion;


    @Column(length=6)
    private @NonNull long Sarary;
    @Column(length=3)
    private @NonNull long Height;
    @Column(length=3)
    private @NonNull long Weight;
    private @NonNull String Congennitial_disease;
    private @NonNull String Email;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name= "Position_Id")
    @JsonBackReference
    private Position position;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name= "Titlename_Id")
    @JsonBackReference
    private Titlename Titlename;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name= "Status_Id")
    @JsonBackReference
    private Status Status;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name= "Nationality_Id")
    @JsonBackReference
    private Nationality Nationality;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name= "Ethnicity_Id")
    @JsonBackReference
    private Ethnicity Ethnicity;


   
}
