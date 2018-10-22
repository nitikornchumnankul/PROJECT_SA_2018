
package com.sa.group18.repository;
import com.sa.group18.entity.Status;//ชื่อ entity

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
@CrossOrigin(origins = "http://localhost:4200")
    //ชื่อ repo
    public interface StatusRepository extends JpaRepository<Status, Long> {
         Status findById(long statusId);
         Status findByStatus (String Status);
}
