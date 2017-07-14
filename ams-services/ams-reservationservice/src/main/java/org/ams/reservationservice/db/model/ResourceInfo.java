package org.ams.reservationservice.db.model;

import java.util.List;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false, of = { "resourceId" })
@Entity(name="RESOURCE_INFO")
public class ResourceInfo {

	@Id
	@Column(name="RESOURCE_ID")
	private String resourceId;

	@Column(name="RESOURCE_NAME")
	private String resouceName;

	@ElementCollection
	@CollectionTable(name="RESOURCE_STATUS", joinColumns=@JoinColumn(name="RESOURCE_ID"))
	private List<ResourceStatus> resourceStatus;

}
