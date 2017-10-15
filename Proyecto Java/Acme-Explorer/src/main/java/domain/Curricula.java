
package domain;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;

public class Curricula extends DomainEntity {

	// Attributes -------------------------------------------------------------

	private String	ticker;


	@NotBlank
	@NotNull
	@Pattern(regexp = "^[0-9]{2}(0[1-9]{1}|1[0-2]{1})((0|1|2)[0-9]{1}|3[0-1]{1})\\-[A-Z]{4}$")
	public String getTicker() {
		return this.ticker;
	}

	public void setTicker(String ticker) {
		this.ticker = ticker;
	}

}
