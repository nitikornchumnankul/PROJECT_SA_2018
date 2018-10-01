
package com.sa.group18.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.util.ArrayList;
import java.util.List;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import lombok.*;
@Entity
@Data
@Table(name="Status")

public class Status{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="Status_Id")
    private @NonNull Long Status_Id;
    private @NonNull String Status;

    
    @OneToMany(mappedBy="Status",fetch= FetchType.LAZY)
    @JsonManagedReference
    private List<Profile> profiles =new ArrayList<>();
    
    protected Status(){}
    public  Status(String Status) {
        this.Status=Status;
    }
    public Status(long Status_Id){
        this.Status_Id=Status_Id;
    }
}

