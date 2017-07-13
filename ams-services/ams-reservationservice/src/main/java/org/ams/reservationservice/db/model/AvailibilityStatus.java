package org.ams.reservationservice.db.model;

import javax.persistence.Embeddable;

import org.ams.reservationservice.util.Hour;

@Embeddable
public class AvailibilityStatus {
	
	private Hour hour;
	
	private boolean isAvialable;
	

}
