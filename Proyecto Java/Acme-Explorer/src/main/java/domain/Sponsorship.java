
package domain;

import org.hibernate.validator.constraints.CreditCardNumber;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

public class Sponsorship extends DomainEntity {

	private String	bannerURL;
	private String	link;
	private CreditCard	creditCard;
	
	@NotBlank
	@URL
	public String getBannerURL() {
		return this.bannerURL;
	}
	
	public void setBannerURL(String bannerURL) {
		this.bannerURL = bannerURL;
	}

	@NotBlank
	@URL
	public String getLink() {
		return this.link;
	}
	
	public void setLink(String link) {
		this.link = link;
	}

	@CreditCardNumber
	public CreditCard getCreditCard() {
		return this.creditCard;
	}
	
	public void setCreditCard(CreditCard creditCard) {
		this.creditCard = creditCard;
	}
	
	

	

	

}
