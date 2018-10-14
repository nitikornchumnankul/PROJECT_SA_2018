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
@Data
@Table(name="Profile")
public class Profile{

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private @NonNull Long   profileId;
    private @NonNull String firstName;
    private @NonNull String lastName;
    private @NonNull String sex;

  
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date    brithday;
    @Column(length=13)
    private String identificationnumber;
    @Column(length=6)
    private long   sarary;
    @Column(length=3)
    private long   height;
    @Column(length=3)
    private long   weight;
    private @NonNull String congennitialdisease;
    private @NonNull String email;


   
    @ManyToOne()
    @JoinColumn(name= "religionId")
    private Religion religion;

    @ManyToOne()
    @JoinColumn(name= "positionId")
    private Position position;

    @ManyToOne()
    @JoinColumn(name= "titlenameId")
    private Titlename titlename;

    @ManyToOne()
    @JoinColumn(name= "statusId")
    private Status status;


    @ManyToOne()
    @JoinColumn(name= "nationalityId")
    private Nationality nationality;


    @ManyToOne()
    @JoinColumn(name= "ethnicityId")
    private Ethnicity ethnicity;

    public  Profile(){ }
    public  Profile( String firstName,             String lastName,
                     String sex,                   Date   brithday,
                     String identificationnumber,  long   sarary,
                     long   height,                long   weight,
                     String congennitialdisease,   String email,
                     long   religionId,            long   positionId,
                     long   titlenameId,           long   statusId,
                     long   nationalityId,         long   ethnicityId){

        Religion    religion    = new Religion(religionId);
        Position    position    = new Position(positionId);
        Titlename   titlename   = new Titlename(titlenameId);
        Status      status      = new Status(statusId);
        Nationality nationality = new Nationality(nationalityId);
        Ethnicity   ethnicity   = new Ethnicity(ethnicityId);

        this.firstName               = firstName;
        this.lastName                = lastName;
        this.brithday                = brithday;
        this.identificationnumber    = identificationnumber;
        this.sarary                  = sarary;
        this.height                  = height;
        this.weight                  = weight;
        this.congennitialdisease     = congennitialdisease;
        this.email                   = email;

        this.religion                = religion;
        this.position                = position;
        this.titlename               = titlename;
        this.status                  = status;
        this.nationality             = nationality;
        this.ethnicity               = ethnicity;
        
        

    }

   
}
