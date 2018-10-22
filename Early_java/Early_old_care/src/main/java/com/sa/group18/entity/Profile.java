package com.sa.group18.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.*;
import lombok.*;

@Getter
@Setter
@Entity
@ToString
@Data
@EqualsAndHashCode
@Table(name="Profile")
public class Profile{

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private @NonNull Long   profileId;

    private  String firstName;
    private  String lastName; 
    @Column(length=13)
    private String identificationnumber;
    private   String email;
    private   String phone;


    @ManyToOne()
    @JoinColumn(name= "titlenameId")
    private Titlename titlename;

    @ManyToOne()
    @JoinColumn(name= "sexId")
    private Sex sex ;
    
    @ManyToOne()
    @JoinColumn(name= "statusId")
    private Status status;
    
    @ManyToOne()
    @JoinColumn(name= "nationalityId")
    private Nationality nationality;

    @ManyToOne()
    @JoinColumn(name= "ethnicityId")
    private Ethnicity ethnicity;

    @ManyToOne()
    @JoinColumn(name= "religionId")
    private Religion religion;

    @ManyToOne()
    @JoinColumn(name= "positionId")
    private Position position;

    public  Profile(){ }
}
