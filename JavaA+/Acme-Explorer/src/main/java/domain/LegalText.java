
package domain;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.NotBlank;

public class LegalText extends DomainEntity {

	// Attributes -------------------------------------------------------------

	private String	title;
	private String	body;
	private int		lawsNumber;
	private Date	moment;
	private boolean	draftMode;


	@NotBlank
	@NotNull
	public String getTitle() {
		return this.title;
	}

	public void setTitle(final String title) {
		this.title = title;
	}

	@NotBlank
	@NotNull
	public String getBody() {
		return this.body;
	}

	public void setBody(final String body) {
		this.body = body;
	}

	public int getLawsNumber() {
		return this.lawsNumber;
	}

	public void setLawsNumber(final int lawsNumber) {
		this.lawsNumber = lawsNumber;
	}
	@NotNull
	@Past
	public Date getMoment() {
		return this.moment;
	}

	public void setMoment(final Date moment) {
		this.moment = moment;
	}

	public boolean isDraftMode() {
		return this.draftMode;
	}

	public void setDraftMode(final boolean draftMode) {
		this.draftMode = draftMode;
	}
}