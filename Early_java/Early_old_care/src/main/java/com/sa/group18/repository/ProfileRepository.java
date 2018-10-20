
package com.sa.group18.repository;
import com.sa.group18.entity.Profile;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource

    public interface ProfileRepository extends JpaRepository<Profile, Long> {
       
}
