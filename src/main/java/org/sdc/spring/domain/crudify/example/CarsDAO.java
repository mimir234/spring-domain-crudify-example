package org.sdc.spring.domain.crudify.example;

import org.sdc.spring.domain.crudify.repository.dao.mongodb.SpringCrudifyMongoRepository;
import org.sdc.spring.domain.crudify.spec.ISpringCrudifyDomain;
import org.springframework.stereotype.Repository;

@Repository
public class CarsDAO extends SpringCrudifyMongoRepository<CarEntity, CarDTO>{

	public CarsDAO(ISpringCrudifyDomain<CarEntity, CarDTO> domain) {
		super(domain);
	}

}
