
package domain;

import java.util.Collection;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

public class EducationRecord extends DomainEntity {

	// Attributes -------------------------------------------------------------

	private String				diplomaTitle;
	private String				studyingPeriod;
	private String				institution;
	private String				link;
	private Collection<String>	comments;


	@NotBlank
	@NotNull
	public String getDiplomaTitle() {
		return this.diplomaTitle;
	}

	public void setDiplomaTitle(final String diplomaTitle) {
		this.diplomaTitle = diplomaTitle;
	}
	@NotBlank
	@NotNull
	public String getStudyingPeriod() {
		return this.studyingPeriod;
	}

	public void setStudyingPeriod(final String studyingPeriod) {
		this.studyingPeriod = studyingPeriod;
	}
	@NotBlank
	@NotNull
	public String getInstitution() {
		return this.institution;
	}

	public void setInstitution(final String institution) {
		this.institution = institution;
	}
	@NotNull
	@URL
	public String getLink() {
		return this.link;
	}

	public void setLink(final String link) {
		this.link = link;
	}

	public Collection<String> getComments() {
		return this.comments;
	}

	public void setComments(final Collection<String> comments) {
		this.comments = comments;
	}

}
