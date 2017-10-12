package domain;

import java.util.Collection;
import javax.validation.constraints.Pattern;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;


public class EndorserRecord extends DomainEntity{
	private String fullName;
	private String email;
	private String linkedProfile;
	private Collection<String> comments;
	private String phone;
	
	@NotBlank
	public String getFullName() {
		return fullName;
	}
	
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	@Email
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	@NotBlank
	@URL
	public String getLinkedProfile() {
		return linkedProfile;
	}
	
	public void setLinkedProfile(String linkedProfile) {
		this.linkedProfile = linkedProfile;
	}
	
	public Collection<String> getComments() {
		return comments;
	}
	
	public void setComments(Collection<String> comments) {
		this.comments = comments;
	}
	
	//@Pattern(regexp="(\+([0-9]{1}|[0-9]{2}|[0-9]{3})\(([0-9]{1}|[0-9]{2}|[0-9]{3})\)([0-9]{4,100}))|(\+([0-9]{1}|[0-9]{2}|[0-9]{3})\s([0-9]{4,100}))|(([0-9]")
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
}