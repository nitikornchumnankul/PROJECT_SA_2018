
package com.sa.group18.repository;
import com.sa.group18.entity.Position;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource

    public interface PositionRepository extends JpaRepository<Position, Long> {
         Position findById(long positionId);
         Position findByPosition(String position);
}
