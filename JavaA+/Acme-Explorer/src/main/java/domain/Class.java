
package domain;

import java.util.Date;

import org.hibernate.validator.constraints.NotBlank;

public class Class extends DomainEntity {

	private String	title;
	private String	description;
	private Date	organisedMoment;
	private GPS		location;
	
	@NotBlank
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	@NotBlank
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Date getOrganisedMoment() {
		return organisedMoment;
	}
	
	public void setOrganisedMoment(Date organisedMoment) {
		this.organisedMoment = organisedMoment;
	}
	
	@NotBlank
	public GPS getLocation() {
		return location;
	}
	
	public void setLocation(GPS location) {
		this.location = location;
	}
	
	
}
