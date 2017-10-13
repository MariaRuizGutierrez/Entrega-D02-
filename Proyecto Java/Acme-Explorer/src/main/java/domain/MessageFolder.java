
package domain;

import org.hibernate.validator.constraints.NotBlank;

public class MessageFolder extends DomainEntity {

	private String	name;
	private boolean	modificable;


	public boolean isModificable() {
		return this.modificable;
	}

	public void setModificable(final boolean modificable) {
		this.modificable = modificable;
	}

	@NotBlank
	public String getName() {
		return this.name;
	}

	public void setName(final String name) {
		this.name = name;
	}

}
