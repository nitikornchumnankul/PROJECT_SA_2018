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
@Table(name="Titlename")
@Entity
public class Titlename{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="Titlename_Id")
    private @NonNull Long Titlename_id;

    @Column
    private @NonNull String Titlename;

    @OneToMany(mappedBy="Titlename",fetch= FetchType.LAZY)
    private List<Profile> profiles =new ArrayList<>();
    
    protected Titlename() {}

    public Titlename(String name){
        this.Titlename=Titlename;
    }
}
