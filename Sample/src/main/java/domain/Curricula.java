
package domain;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

public class Curricula extends DomainEntity {

	// Attributes -------------------------------------------------------------

	private String	ticker;


	@NotBlank
	@NotNull
	//TODO
	public String getTicker() {
		return this.ticker;
	}

	public void setTicker(final String ticker) {
		this.ticker = ticker;
	}

}
