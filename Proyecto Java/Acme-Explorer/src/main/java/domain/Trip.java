
package domain;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;

public class Trip extends DomainEntity {

	private String				ticker;
	private String				title;
	private String				description;
	private double				price;
	private Collection<String>	requirementsExplorers;
	private Date				publicationDate;
	private Date				startDate;
	private Date				finishDate;
	private String				reasonWhy;
	private boolean				cancelado;


	@Column(unique = true)
	@NotBlank
	@Pattern(regexp = "^[0-9]{2}(0[1-9]{1}|1[0-2]{1})((0|1|2)[0-9]{1}|3[0-1]{1})\\-[A-Z]{4}$")
	public String getTicker() {
		return this.ticker;
	}

	public void setTicker(final String ticker) {
		this.ticker = ticker;
	}

	@NotBlank
	public String getTitle() {
		return this.title;
	}

	public void setTitle(final String title) {
		this.title = title;
	}

	@NotBlank
	public String getDescription() {
		return this.description;
	}

	public void setDescription(final String description) {
		this.description = description;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(final double price) {
		this.price = price;
	}

	public Collection<String> getRequirementsExplorers() {
		return this.requirementsExplorers;
	}

	public void setRequirementsExplorers(final Collection<String> requirementsExplorers) {
		this.requirementsExplorers = requirementsExplorers;
	}

	public Date getPublicationDate() {
		return this.publicationDate;
	}

	public void setPublicationDate(final Date publicationDate) {
		if (publicationDate.equals(null))
			this.publicationDate = publicationDate;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(final Date startDate) {
		this.startDate = startDate;
	}

	public Date getFinishDate() {
		return this.finishDate;
	}

	public void setFinishDate(final Date finishDate) {
		this.finishDate = finishDate;
	}
	//TODO: Me ocurre lo mismo que con stage, os dejo el error para que sepais cual es
	public String getReasonWhy() {
		if (this.cancelado==true)
			this.reasonWhy!=null;
		return this.reasonWhy;
	}
	public void setReasonWhy(final String reasonWhy) {
		if (!this.publicationDate.equals(null))
			this.reasonWhy = reasonWhy;
	}

	public boolean isCancelado() {
		return this.cancelado;
	}

}
