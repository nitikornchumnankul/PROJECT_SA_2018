
package com.sa.group18.repository;
import com.sa.group18.entity.Religion;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource

    public interface ReligionRepository extends JpaRepository<Religion, Long> {
         Religion findById(long religionId);
         Religion findByReligion(String  Religion);
}
