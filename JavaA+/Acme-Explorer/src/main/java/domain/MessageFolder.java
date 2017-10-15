package domain;

import org.hibernate.validator.constraints.NotBlank;


public class MessageFolder extends DomainEntity{
	private String name;

	@NotBlank
	public String getName() {
		return name;
	}

	
	public void setName(String name) {
		this.name = name;
	}
	
	
}
