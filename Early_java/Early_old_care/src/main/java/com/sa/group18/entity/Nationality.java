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
@Table(name="Nationality")

public class Nationality {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="Nationality_Id")
    private @NonNull Long Nationality_Id;
    private @NonNull String Nationality;

    @OneToMany(mappedBy="Nationality",fetch= FetchType.LAZY)
    @JsonManagedReference
    private List<Profile> profiles = new ArrayList<>();

    protected Nationality() {}
    public Nationality(String Nationality){
        this.Nationality=Nationality;
    }
    public Nationality(long Nationality_Id){
        this.Nationality_Id=Nationality_Id;
    }
}
