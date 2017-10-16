
package domain;

import java.util.Collection;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

public class ProfessionalRecord extends DomainEntity {
	private String companyName;
	private String workPeriod;
	private String role;
	private String link;
	private Collection<String> comments;
	
	@NotNull
	@NotBlank
	public String getCompanyName() {
		return companyName;
	}
	
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	@NotNull
	@NotBlank
	public String getWorkPeriod() {
		return workPeriod;
	}
	
	public void setWorkPeriod(String workPeriod) {
		this.workPeriod = workPeriod;
	}
	
	@NotNull
	@NotBlank
	public String getRole() {
		return role;
	}
	
	public void setRole(String role) {
		this.role = role;
	}
	
	@URL
	public String getLink() {
		return link;
	}
	
	public void setLink(String link) {
		this.link = link;
	}
	
	public Collection<String> getComments() {
		return comments;
	}
	
	public void setComments(Collection<String> comments) {
		this.comments = comments;
	}
	
}
