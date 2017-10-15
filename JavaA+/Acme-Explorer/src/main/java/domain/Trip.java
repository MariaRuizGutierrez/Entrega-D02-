
package domain;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;

public class Trip extends DomainEntity {
	private String ticker;
	private String title;
	private String description;
	private double price;
	private Collection<String> requirementsExplorers;
	private Date publicationDate;
	private Date startDate;
	private Date finishDate;
	private String reasonWhy;
	
	@Column(unique=true)
	@NotBlank
	@Pattern(regexp="(^[0-9]{2}([0][1-9]{1}|1[0-2]{1})((0|1|2)[0-9]{1}|3[0-1]{1})-[A-Z]{4})$")
	public String getTicker() {
		return ticker;
	}
	
	
	public void setTicker(String ticker) {
		this.ticker = ticker;
	}
	
	@NotBlank
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	@NotBlank
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public Collection<String> getRequirementsExplorers() {
		return requirementsExplorers;
	}
	
	public void setRequirementsExplorers(Collection<String> requirementsExplorers) {
		this.requirementsExplorers = requirementsExplorers;
	}
	
	public Date getPublicationDate() {
		return publicationDate;
	}
	
	public void setPublicationDate(Date publicationDate) {
		if(publicationDate.equals(null)){
			this.publicationDate = publicationDate;
		}
	}
	
	public Date getStartDate() {
		return startDate;
	}
	
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	
	public Date getFinishDate() {
		return finishDate;
	}
	
	public void setFinishDate(Date finishDate) {
		this.finishDate = finishDate;
	}
	
	public String getReasonWhy() {
		return reasonWhy;
	}
	
	public void setReasonWhy(String reasonWhy) {
		if(!publicationDate.equals(null)){
		this.reasonWhy = reasonWhy;
		}
	}
	
}
