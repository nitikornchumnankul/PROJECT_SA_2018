
package com.sa.group18.repository;
import com.sa.group18.entity.Titlename;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
@CrossOrigin(origins = "http://localhost:4200")

    public interface TitlenameRepository extends JpaRepository<Titlename, Long> {
    //Titlename findByTitleId(long titlenameId);
     Titlename findById(long titlenameId);
     Titlename findByTitlename (String Titlename);
    
}         
 