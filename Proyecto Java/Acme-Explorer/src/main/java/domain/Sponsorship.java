
package domain;

public class Sponsorship extends DomainEntity {

	private String		bannerURL;
	private String		link;
	private CreditCard	creditCard;


	String getBannerURL() {
		return this.bannerURL;
	}

	String getLink() {
		return this.link;
	}

	CreditCard getCreditCard() {
		return this.creditCard;
	}

	void setBannerURL(final String bannerURL) {
		this.bannerURL = bannerURL;
	}

	void setLink(final String link) {
		this.link = link;
	}

	void setCreditCard(final CreditCard creditCard) {
		this.creditCard = creditCard;
	}

}
