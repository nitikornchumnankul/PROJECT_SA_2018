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
@Table(name="Religion")
@Entity
public class Religion{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="Religion_Id")
    private @NonNull Long Religion_Id;

    @Column
    private @NonNull String Religion;
    
    @OneToMany(mappedBy="Religion",fetch= FetchType.LAZY)
    private List<Profile> profiles =new ArrayList<>();
    protected Religion() {}

    public  Religion(String Religion){
        this.Religion=Religion;
        
    }
}
