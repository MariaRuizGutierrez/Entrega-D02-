package domain;

import org.hibernate.validator.constraints.NotBlank;


public class GPS extends DomainEntity{
	private double longitude;
	private double latitude;
	private String name;
	
	@NotBlank
	public double getLongitude() {
		return longitude;
	}
	
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	
	@NotBlank
	public double getLatitude() {
		return latitude;
	}
	
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	
	@NotBlank
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
}
