
package domain;

import org.hibernate.validator.constraints.NotBlank;

public class Stage extends DomainEntity {

	private String	title;
	private String	description;

	@NotBlank
	public String getTitle() {
		return this.title;
	}

	@NotBlank
	public String getDescription() {
		return this.description;
	}
	
	public void setTitle(String title){
		this.title=title;
	}
	
	public void setDescription(String description){
		this.description=description;
	}

}
