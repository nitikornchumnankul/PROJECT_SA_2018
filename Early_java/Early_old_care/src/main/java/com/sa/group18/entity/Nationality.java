package com.sa.group18.entity;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.*;

@Entity
@Data
@Table(name="Nationality")

public class Nationality {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private @NonNull Long nationalityId;
    private String nationality;
  
    public  Nationality() {}
    public Nationality(String nationality){
        this.nationality=nationality;
    }
    public Nationality(Long  nationalityId){
        this.nationalityId=nationalityId;
    }
}
