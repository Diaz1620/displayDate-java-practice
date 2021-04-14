package com.yadiel.displaydate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.text.SimpleDateFormat;

@Controller

public class DisplayController {
	Date date = new Date();
	SimpleDateFormat currentDate = new SimpleDateFormat("EEEE, 'the ' dd 'of ' MMMM, YYYY ");
	SimpleDateFormat currentTime = new SimpleDateFormat("hh:mm a");

	@RequestMapping("/date")
	public String date(Model model) {
		model.addAttribute("date", String.format("Current Date is %s", currentDate.format(date)));
		
		return "index.jsp";
		
	}
	
	@RequestMapping("/time")
	public String time(Model model) {
		model.addAttribute("time", String.format("Current Time is %s", currentTime.format(date)));
		
		return "time.jsp";
	}
	
}
