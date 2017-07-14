package org.ams.reservationservice.db.model;

import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;

import org.ams.reservationservice.util.Day;

@Embeddable
public class ResourceStatus {
	
	@Column(name="RESOURCE_DAY")
	private Day day;
	
	@ElementCollection
	@CollectionTable(name="RESOURCE_AVAILIBILITY", joinColumns=@JoinColumn(name="RESOURCE_ID"))
	private List<AvailibilityStatus> availibilityList;

}
