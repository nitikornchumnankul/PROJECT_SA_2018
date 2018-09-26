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
@Table(name="Nationality")
@Entity
public class Nationality {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private @NonNull Long NationalityId;

    @Column
    private @NonNull String Nationality;

    @OneToMany(mappedBy="Nationality",fetch= FetchType.LAZY)
    private List<Profile> profiles = new ArrayList<>();

    protected Nationality() {}
    public Nationality(String Nationality){
        this.Nationality=Nationality;
    }
}
