
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
    @Column(name="StatusId")
    private @NonNull Long statusId;
    private @NonNull String status;

    
    
    public  Status(){}
    public  Status(String status) {
        this.status=status;
    }
    public Status(long statusId){
        this.statusId=statusId;
    }
}

