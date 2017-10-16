
package domain;

import org.hibernate.validator.constraints.NotBlank;

public class MessageFolder extends DomainEntity {

	private String	name;
	private boolean	modifiable;


	public boolean isModificable() {
		return this.modifiable;
	}

	public void setModificable(final boolean modifiable) {
		this.modifiable = modifiable;
	}

	@NotBlank
	public String getName() {
		return this.name;
	}

	public void setName(final String name) {
		this.name = name;
	}

}
