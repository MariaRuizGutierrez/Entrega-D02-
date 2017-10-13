
package domain;

import org.hibernate.validator.constraints.NotBlank;

public class Stage extends DomainEntity {

	private String		title;
	private String		description;
	private Double		precio;

	static final Double	iva	= 0.21;


	@NotBlank
	public String getTitle() {
		return this.title;
	}

	@NotBlank
	public String getDescription() {
		return this.description;
	}

	public void setTitle(final String title) {
		this.title = title;
	}

	public void setDescription(final String description) {
		this.description = description;
	}

	public Double getPrecio() {
		return this.precio * (Stage.iva + 1.0);
	}

}
