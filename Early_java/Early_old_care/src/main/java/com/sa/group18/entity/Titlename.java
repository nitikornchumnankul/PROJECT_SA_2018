package com.sa.group18.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.*;

@Entity
@Data
@Table(name="Titlename")

public class Titlename{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="Titlename_Id")
    private @NonNull Long Titlename_id;

    @Column
    private @NonNull String Titlename;

    @OneToMany(mappedBy="Titlename",fetch= FetchType.LAZY)
    @JsonManagedReference
    private List<Profile> profiles =new ArrayList<>();
    
    protected Titlename() {}

    public Titlename(String Titlename){
        this.Titlename=Titlename;
    }
    public Titlename(long Titlename_id){
        this.Titlename_id=Titlename_id;
    }
}
