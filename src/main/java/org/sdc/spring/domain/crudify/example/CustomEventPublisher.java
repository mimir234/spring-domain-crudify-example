package org.sdc.spring.domain.crudify.example;

import org.sdc.spring.domain.crudify.events.ISpringCrudifyEventPublisher;
import org.sdc.spring.domain.crudify.events.SpringCrudifyEntityEvent;
import org.sdc.spring.domain.crudify.spec.ISpringCrudifyEntity;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CustomEventPublisher implements ISpringCrudifyEventPublisher {

	@Override
	public void publishEntityEvent(SpringCrudifyEntityEvent event, ISpringCrudifyEntity entity) {
		log.info("Event [{}], [{}]", event, entity);
	}

}
