package org.ams.reservationservice.db.model;

import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false, of = { "resourceId" })
public class ResourceInfo {

	private String resourceId;

	private String resouceName;

	private List<ResourceStatus> resourceStatus;

}
