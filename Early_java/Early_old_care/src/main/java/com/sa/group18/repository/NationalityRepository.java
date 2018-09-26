package com.sa.group18.repository;
import com.sa.group18.entity.Nationality;//ชื่อ entity

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
    //ชื่อ repo
    public interface NationalityRepository extends JpaRepository<Nationality, Long> {

}