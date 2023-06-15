package org.sdc.spring.domain.crudify.example;

import org.sdc.spring.domain.crudify.controller.SpringCrudifyController;
import org.sdc.spring.domain.crudify.spec.ISpringCrudifyDomain;
import org.springframework.stereotype.Controller;

@Controller
public class CarsController extends SpringCrudifyController<CarEntity, CarDTO>{

	public CarsController(ISpringCrudifyDomain<CarEntity, CarDTO> domain) {
		super(domain);
	}

}
