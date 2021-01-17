package com.example.SOAPAPItesting;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.SOAPAPItesting.model.Login;
import com.example.SOAPAPItesting.model.Vnds;

@Controller
public class MyController {


	@PostMapping("/dologin")
	public ResponseEntity<String> doLogin(Login login) {
 
		MyHttpClientForLogin myHttpClientForLogin=new MyHttpClientForLogin();
		
		return new ResponseEntity<String>(myHttpClientForLogin.ok2(login), HttpStatus.OK);
	}
	 @GetMapping("/login")
	    public String showForm(Model model) {
	        Login login = new Login();
	        model.addAttribute("login", login);
	         
	        return "login2";
	    }
	 @GetMapping("/host")
	    public String showHostPage(Model model) {
	       Vnds vnds=new Vnds();
	        model.addAttribute("vnds", vnds);
	        return "host";
	    }
		@PostMapping("/testhostserivce")
		public ResponseEntity<String> testHostService(Vnds vnds) {
	 
		//	MyHttpClientForHostService httpClientForHostService=new MyHttpClientForHostService();
			
			//return new ResponseEntity<String>(httpClientForHostService.ok2(vnds), HttpStatus.OK);
			return new ResponseEntity<String>(vnds.toString(), HttpStatus.OK);
		}
}
