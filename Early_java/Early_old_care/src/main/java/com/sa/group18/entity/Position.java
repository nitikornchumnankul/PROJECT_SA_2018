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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Data
@Table(name="Position")
@Entity
public class Position {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="Position_Id")
    private @NonNull Long Position_Id;

    @Column
    private @NonNull String Position;

    @OneToMany(mappedBy="Position",fetch= FetchType.LAZY)
    private List<Profile>  profiles =new ArrayList<>();

    protected Position (){}
    public Position(String Position){
        this.Position=Position;
    }
}
