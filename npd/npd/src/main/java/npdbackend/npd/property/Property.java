package npdbackend.npd.property;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="property")
public class Property {

	@Id
	@GeneratedValue
	@Column(name="property_id")
	private long id;
	
	@Column(name="property_address")
	private String address;
	
	@Column(name="property_picture")
	private String picture;
	
	@Column(name="property_price")
	private String price;
	
	@Column(name="property_title")
	private String title;
	
	

	
	public Property() {
		
	}
	
		
	public Property(long id, String title, String picture, String price, String address) {
		super();
		this.id = id;
		this.title = title;
		this.picture = picture;
		this.price = price;
		this.address = address;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}

