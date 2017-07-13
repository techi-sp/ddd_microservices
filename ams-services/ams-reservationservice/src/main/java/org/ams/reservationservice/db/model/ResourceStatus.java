package org.ams.reservationservice.db.model;

import java.util.List;

import javax.persistence.Embeddable;

import org.ams.reservationservice.util.Day;

@Embeddable
public class ResourceStatus {
	
	private Day day;
	
	private List<AvailibilityStatus> availibilityList;

}
