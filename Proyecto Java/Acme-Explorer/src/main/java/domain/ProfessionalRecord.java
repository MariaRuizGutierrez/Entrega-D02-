
package domain;

import java.util.Collection;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

public class ProfessionalRecord extends DomainEntity {

	private String				companyName;
	private String				workPeriod;
	private String				role;
	private String				link;
	private Collection<String>	comments;


	@NotBlank
	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	//TODO:CUIDADO CON EL PATRON QUE EN EL UML NO ESTA
	@Pattern(regexp = "^(1|2){1}([0-9]){1}([0-9]{1})([0-9]{1})([/])((1|2){1}([0-9]){1}([0-9]{1})([0-9]{1})|([-]))$")
	public String getWorkPeriod() {
		return this.workPeriod;
	}

	public void setWorkPeriod(String workPeriod) {
		this.workPeriod = workPeriod;
	}

	@NotBlank
	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@URL
	public String getLink() {
		return this.link;
	}

	public void setLink(String link) {
		this.link = link;
	}
	@NotNull
	public Collection<String> getComments() {
		return this.comments;
	}
	
	
	public void setComments(Collection<String> comments) {
		this.comments = comments;
	}

}
