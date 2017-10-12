
package domain;

import java.util.Collection;
import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.NotBlank;

public class AuditRecord extends DomainEntity {

	// Attributes -------------------------------------------------------------

	private Date				realisedMoment;
	private String				title;
	private String				description;
	private Collection<String>	attachments;
	private boolean				draftMode;


	@NotNull
	@Past
	public Date getRealisedMoment() {
		return this.realisedMoment;
	}

	public void setRealisedMoment(final Date realisedMoment) {
		this.realisedMoment = realisedMoment;
	}
	@NotBlank
	@NotNull
	public String getTitle() {
		return this.title;
	}

	public void setTitle(final String title) {
		this.title = title;
	}
	@NotNull
	@NotBlank
	public String getDescription() {
		return this.description;
	}

	public void setDescription(final String description) {
		this.description = description;
	}

	public Collection<String> getAttachments() {
		return this.attachments;
	}

	public void setAttachments(final Collection<String> attachments) {
		this.attachments = attachments;
	}

	public boolean isDraftMode() {
		return this.draftMode;
	}

	public void setDraftMode(final boolean draftMode) {
		this.draftMode = draftMode;
	}

}
