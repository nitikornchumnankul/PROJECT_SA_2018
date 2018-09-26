package com.sa.group18.repository;
import com.sa.group18.entity.Ethnicity;//ชื่อ entity

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
    //ชื่อ repo
    public interface EthnicityRepository extends JpaRepository<Ethnicity, Long> {

}