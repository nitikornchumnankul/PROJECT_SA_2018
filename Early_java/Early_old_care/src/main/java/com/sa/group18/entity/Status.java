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
@Table(name="Status")
@Entity
public class Status{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="Status_Id")
    private @NonNull Long Status_Id;

    @Column
    private @NonNull String Status;

    
    @OneToMany(mappedBy="Status",fetch= FetchType.LAZY)
    private List<Profile> profiles =new ArrayList<>();
    
    protected Status(){}
    public  Status(String Status) {
        this.Status=Status;
    }
}
