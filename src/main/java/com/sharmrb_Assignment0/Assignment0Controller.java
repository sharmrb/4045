package com.sharmrb_Assignment0;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.servlet.ModelAndView;

/** Handle the /start endpoint
 * @return
 *
 */



@Controller
public class Assignment0Controller {

	/**Handle the /index endpoint
	 * @return
	 */

		
		@RequestMapping("/Index")
			public String Index() {    //Requestmapping for THe home page
				return "Index";
			}
		
		@RequestMapping(value="/start",method=RequestMethod.GET,headers= {"content-types=text/json"})
		public String readJson() {
			return "start";
		}
		
		
}
