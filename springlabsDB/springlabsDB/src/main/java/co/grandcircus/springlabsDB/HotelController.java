package co.grandcircus.springlabsDB;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HotelController {

	@Autowired
	protected HotelRepository repo;
	
	
	@PostMapping("/resultsBy")
	public String showResults(Model model, @RequestParam String city) {
		List<Hotel> hotels = repo.sortByCity(city);
		
		model.addAttribute("hotels", hotels);
			return "results";
	}
}
