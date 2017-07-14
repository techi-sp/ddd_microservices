package org.ams.reservationservice.repositories;

import org.ams.reservationservice.db.model.ResourceInfo;
import org.springframework.data.repository.CrudRepository;

public interface ResourceRepository extends CrudRepository<ResourceInfo, Long>{

}
