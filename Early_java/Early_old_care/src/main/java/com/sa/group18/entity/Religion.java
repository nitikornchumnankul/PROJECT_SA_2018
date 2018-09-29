package com.sa.group18.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import lombok.*;
@Entity
@Data
@Table(name="Religion")

public class Religion{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="Religion_Id")
    private @NonNull Long Religion_Id;
    private @NonNull String Religion;
    
    @OneToMany(mappedBy="Religion",fetch= FetchType.LAZY)
    @JsonManagedReference
    private List<Profile> profiles =new ArrayList<>();
    protected Religion() {}

    public  Religion(String Religion){
        this.Religion=Religion;
    }
    public Religion(long Religion_Id){
        this.Religion_Id=Religion_Id;
    }
}
