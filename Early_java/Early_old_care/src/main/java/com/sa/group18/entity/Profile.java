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
import java.util.*;
import lombok.*;
@Entity
@lombok.Data
@Table(name="Profile")
public class Profile{

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private @NonNull Long   Profile_Id;
    private @NonNull String First_Name;
    private @NonNull String Last_Name;
    private @NonNull String Sex;

  
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date    Brithday;
    @Column(length=13)
    private String Identification_number;
    @Column(length=6)
    private long   Sarary;
    @Column(length=3)
    private long   Height;
    @Column(length=3)
    private long   Weight;
    private @NonNull String Congennitial_disease;
    private @NonNull String Email;


   
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name= "Religion_Id")
    @JsonBackReference
    private Religion Religion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name= "Position_Id")
    @JsonBackReference
    private Position Position;

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

    protected  Profile(){ }
    public  Profile( String name,                  String lastname,
                    String sex,                   Date   Brithday,
                     String Identification_number, long   Sarary,
                     long   Height,                long   Weight,
                     String Congennitial_disease,  String Email,
                     long   Religion_Id,           long   Position_Id,
                     long   Titlename_Id,          long   Status_Id,
                     long   Nationality_Id,        long   Ethnicity_Id){

        Religion    religion    = new Religion(Religion_Id);
        Position    position    = new Position(Position_Id);
        Titlename   titlename   = new Titlename(Titlename_Id);
        Status      status      = new Status(Status_Id);
        Nationality nationality = new Nationality(Nationality_Id);
        Ethnicity   ethnicity   = new Ethnicity(Ethnicity_Id);

        this.First_Name           = name;
        this.Last_Name            = lastname;
        this.Brithday             = Brithday;
        this.Identification_number= Identification_number;
        this.Sarary               = Sarary;
        this.Height               = Height;
        this.Weight               = Weight;
        this.Congennitial_disease = Congennitial_disease;
        this.Email                = Email;

        this.Religion             = religion;
        this.Position             = position;
        this.Titlename            = titlename;
        this.Status               = status;
        this.Nationality          = nationality;
        this.Ethnicity            = ethnicity;
        
        

    }

   
}
