
package domain;

import java.util.Collection;
import java.util.Date;

import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.CreditCardNumber;
import org.hibernate.validator.constraints.NotBlank;

public class ApplicationFor extends DomainEntity {

	private Date				moment;
	private Status				status;
	private Collection<String>	comments;
	private String				reasonWhy;
	private CreditCard			creditCard;


	@Past
	public Date getMoment() {
		return this.moment;
	}

	public void setMoment(final Date moment) {
		this.moment = moment;
	}

	@NotBlank
	public Status getStatus() {
		return this.status;
	}

	public void setStatus(final Status status) {
		this.status = status;
	}

	public Collection<String> getComments() {
		return this.comments;
	}

	public void setComments(final Collection<String> comments) {
		this.comments = comments;
	}

	public String getReasonWhy() {
		return this.reasonWhy;
	}
	public void setReasonWhy(final String reasonWhy) {
		this.reasonWhy = reasonWhy;
	}

	@CreditCardNumber
	public CreditCard getCreditCard() {
		return this.creditCard;
	}

	public void setCreditCard(final CreditCard creditCard) {
		this.creditCard = creditCard;
	}

}
