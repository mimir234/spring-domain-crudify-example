package org.sdc.spring.domain.crudify.example;

import java.util.Date;

import org.sdc.spring.domain.crudify.spec.AbstractSpringCrudifyEntity;
import org.sdc.spring.domain.crudify.spec.ISpringCrudifyEntityFactory;
import org.sdc.spring.domain.crudify.spec.SpringCrudifyEntity;
import org.sdc.spring.domain.crudify.spec.SpringCrudifyEntityDomain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@SpringCrudifyEntityDomain(name="bookings")
@SpringCrudifyEntity(dto = "org.sdc.spring.domain.crudify.example.BookingDTO", eventPublisher = "class:org.sdc.spring.domain.crudify.example.CustomEventPublisher")
public class BookingEntity extends AbstractSpringCrudifyEntity {
	
	private Date from;
	
	private Date to;
	
	private String meetingRoomUuid; 
	
	private String ownerName;
	 
	private String ownerMail;

	@Override
	public ISpringCrudifyEntityFactory<BookingEntity> getFactory() {
		return new ISpringCrudifyEntityFactory<BookingEntity>() {
			
			@Override
			public BookingEntity newInstance(String uuid) {
				BookingEntity entity = new BookingEntity();
				entity.setUuid(uuid);
				return entity;
			}
			
			@Override
			public BookingEntity newInstance() {
				return new BookingEntity();
			}
		};
	}

}
