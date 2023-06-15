package org.sdc.spring.domain.crudify.example;

import org.sdc.spring.domain.crudify.repository.SpringCrudifyRepository;
import org.sdc.spring.domain.crudify.spec.ISpringCrudifyDomain;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Repository;

@Repository("CarsRepository")
@ComponentScan("org.sdc")
@EnableMongoRepositories
public class CarsRepository extends SpringCrudifyRepository<CarEntity, CarDTO> {

	public CarsRepository(ISpringCrudifyDomain<CarEntity, CarDTO> domain) {
		super(domain);
	}

}
