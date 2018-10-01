
package com.sa.group18.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import lombok.*;
@Entity
@Data
@Table(name="Titlename")

public class Titlename{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="Titlename_Id")
    private @NonNull Long Titlename_Id;

    @Column
    private @NonNull String Titlename;
/*
    @OneToMany(mappedBy="Titlename",fetch= FetchType.LAZY)
    @JsonManagedReference
    private List<Profile> profiles =new ArrayList<>();
*/
    protected Titlename() {}

    public Titlename(String Titlename){
        this.Titlename=Titlename;
    }
    public Titlename(long Titlename_Id){
        this.Titlename_Id=Titlename_Id;
    }
}
