
package domain;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

public class PersonalRecord extends DomainEntity {

	// Attributes -------------------------------------------------------------

	private String	fullName;
	private String	photo;
	private String	email;
	private String	phone;
	private String	linkedProfile;


	@NotBlank
	@NotNull
	public String getFullName() {
		return this.fullName;
	}

	public void setFullName(final String fullName) {
		this.fullName = fullName;
	}
	@NotBlank
	@NotNull
	@URL
	public String getPhoto() {
		return this.photo;
	}

	public void setPhoto(final String photo) {
		this.photo = photo;
	}
	@NotBlank
	@NotNull
	@Email
	public String getEmail() {
		return this.email;
	}

	public void setEmail(final String email) {
		this.email = email;
	}
	//TODO
	public String getPhone() {
		return this.phone;
	}

	public void setPhone(final String phone) {
		this.phone = phone;
	}
	@NotBlank
	@NotNull
	@URL
	public String getLinkedProfile() {
		return this.linkedProfile;
	}

	public void setLinkedProfile(final String linkedProfile) {
		this.linkedProfile = linkedProfile;
	}

}
