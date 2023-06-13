package org.sdc.spring.domain.crudify.example;

import org.sdc.spring.domain.crudify.spec.AbstractSpringCrudifyEntity;
import org.sdc.spring.domain.crudify.spec.ISpringCrudifyEntityFactory;
import org.sdc.spring.domain.crudify.spec.SpringCrudifyEntity;
import org.sdc.spring.domain.crudify.spec.SpringCrudifyEntityDomain;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SpringCrudifyEntityDomain(name="meetingRooms")
@SpringCrudifyEntity(dto = "org.sdc.spring.domain.crudify.example.MeetingRoomDTO")
public class MeetingRoomEntity extends AbstractSpringCrudifyEntity {

	@JsonProperty
	private String name;
	
	@JsonProperty
	private String location;
	
	@JsonProperty
	private String[] facilities;

	@Override
	public ISpringCrudifyEntityFactory<MeetingRoomEntity> getFactory() {
		ISpringCrudifyEntityFactory<MeetingRoomEntity> factory = new ISpringCrudifyEntityFactory<MeetingRoomEntity>() {

			@Override
			public MeetingRoomEntity newInstance() {
				return new MeetingRoomEntity();
			}

			@Override
			public MeetingRoomEntity newInstance(String uuid) {
				MeetingRoomEntity entity = new MeetingRoomEntity();
				entity.setUuid(uuid);
				return entity;
			}
		};
		return factory ;
	}

}