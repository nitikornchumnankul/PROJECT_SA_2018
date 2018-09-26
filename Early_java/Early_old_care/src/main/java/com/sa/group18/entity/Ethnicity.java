package com.sa.group18.entity;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import lombok.*;

@Data
@Table(name="Ethnicity")
@Entity
public class Ethnicity{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private @NonNull Long Ethnicity_Id;
    private @NonNull String Ethnicity;
    
    @OneToMany(mappedBy="Ethnicity",fetch= FetchType.LAZY)
    private List<Profile> profiles =new ArrayList<>();

    protected Ethnicity(){}
    public Ethnicity(String Ethnicity) {
        this.Ethnicity=Ethnicity;
    }
}
 

