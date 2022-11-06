package egovframework.example.reservation.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import egovframework.example.reservation.service.ReservationService;

@Controller
public class ReservationController {
	
	@Resource(name = "reservationService")
	private ReservationService reservationService;
	
	
	@RequestMapping("/main.do")
	public String testdb(Model model) {
		
		model.addAttribute("Date", reservationService.testdb());
		
		return "main";
	}
	
	
}
