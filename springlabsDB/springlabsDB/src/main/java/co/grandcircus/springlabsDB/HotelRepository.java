package co.grandcircus.springlabsDB;

import java.util.List;

public interface HotelRepository {

	List<Hotel> sortByCity(String city);

}
