
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
    @Column(name="TitlenameId")
    private @NonNull Long  titlenameId;
    private String titlename;


    public Titlename() {}

    public Titlename(String titlename){
        this.titlename=titlename;
    }
    public Titlename(Long  titlenameId){
        this.titlenameId=titlenameId;
    }
}
