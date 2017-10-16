
package domain;

import java.util.Collection;
import java.util.Date;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.CreditCardNumber;
import org.hibernate.validator.constraints.NotBlank;

public class ApplicationFor extends DomainEntity {

	private Date				moment;
	private String				status;
	private Collection<String>	comments;
	private String				reasonWhy;
	private CreditCard			creditCard;

	@NotNull
	@Past
	public Date getMoment() {
		return this.moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	@NotNull
	@NotBlank
	@Pattern(regexp = "^((PENDING)|(REJECTED)|(DUE)|(ACCEPTED)|(CANCELLED))$")
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Collection<String> getComments() {
		return this.comments;
	}

	public void setComments(Collection<String> comments) {
		this.comments = comments;
	}

	public String getReasonWhy() {
		return this.reasonWhy;
	}
	public void setReasonWhy(String reasonWhy) {
		this.reasonWhy = reasonWhy;
	}

	@NotNull
	@CreditCardNumber
	@Valid
	public CreditCard getCreditCard() {
		return this.creditCard;
	}

	public void setCreditCard(CreditCard creditCard) {
		this.creditCard = creditCard;
	}

}
