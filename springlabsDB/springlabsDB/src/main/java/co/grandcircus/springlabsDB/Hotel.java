package co.grandcircus.springlabsDB;

public class Hotel {
protected String id;
protected String city;
protected int pricePerNight;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public int getPricePerNight() {
	return pricePerNight;
}
public void setPricePerNight(int pricePerNight) {
	this.pricePerNight = pricePerNight;
}
public Hotel(String id, String city, int pricePerNight) {
	super();
	this.id = id;
	this.city = city;
	this.pricePerNight = pricePerNight;
}


}
