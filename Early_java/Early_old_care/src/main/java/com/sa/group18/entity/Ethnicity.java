package com.sa.group18.entity;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import javax.persistence.OneToMany;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import lombok.*;
@Entity
@Data
@Table(name="Ethnicity")
public class Ethnicity{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private @NonNull Long Ethnicity_Id;
    private @NonNull String Ethnicity;
    
    @OneToMany(mappedBy="Ethnicity",fetch= FetchType.LAZY)
    @JsonManagedReference
    private List<Profile> profiles =new ArrayList<>();
    
    protected Ethnicity(){}
    public Ethnicity(String Ethnicity) {
        this.Ethnicity=Ethnicity;
    }
    public Ethnicity(long Ethnicity_Id){
        this.Ethnicity_Id=Ethnicity_Id;
    }

}

 