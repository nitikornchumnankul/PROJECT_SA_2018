
package com.sa.group18.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.util.ArrayList;
import java.util.List;
import lombok.*;
@Entity
@Data
@Table(name="Religion")

public class Religion{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="ReligionId")
    private @NonNull Long religionId;
    private String religion;
    
    
    public  Religion() {}

    public  Religion(String religion){
        this.religion=religion;
    }
    public Religion(Long  religionId){
        this.religionId=religionId;
    }
}
