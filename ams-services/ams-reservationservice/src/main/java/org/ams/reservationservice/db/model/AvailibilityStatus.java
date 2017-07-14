package org.ams.reservationservice.db.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.ams.reservationservice.util.Hour;

@Embeddable
public class AvailibilityStatus {
	
	@Column(name="RESOURCE_HOUR")
	private Hour hour;
	
	@Column(name="RESOURCE_ISAVAILABLE")
	private boolean isAvialable;
	

}
