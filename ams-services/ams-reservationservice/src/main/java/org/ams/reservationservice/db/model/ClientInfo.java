package org.ams.reservationservice.db.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false, of = { "flatId" })
public class ClientInfo {

	private String flatId;

	private String name;

	private String contactNumber;

	private String emailId;

}
