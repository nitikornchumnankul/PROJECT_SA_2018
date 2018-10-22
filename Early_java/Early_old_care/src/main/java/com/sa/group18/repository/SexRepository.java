
package com.sa.group18.repository;
import com.sa.group18.entity.Sex;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
@CrossOrigin(origins = "http://localhost:4200")

    public interface SexRepository extends JpaRepository<Sex, Long> {
        Sex findById(long sexId);
        Sex findBySex(String  sex);
}
