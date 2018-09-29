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
@Table(name="Position")

public class Position {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="Position_Id")
    private @NonNull Long Position_Id;
    private @NonNull String Position;

    @OneToMany(mappedBy="Position",fetch= FetchType.LAZY)
    @JsonManagedReference
    private List<Profile>  profiles =new ArrayList<>();

    protected Position (){}
    public Position(String Position){
        this.Position=Position;
    }
    public Position(long Position_Id){
        this.Position_Id=Position_Id;
    }
}
