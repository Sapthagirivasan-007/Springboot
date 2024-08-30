package com.springex1.controller.DTO;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class User2 {
@PostMapping("/save")
public String saveuserData(@RequestBody Users users) {
if(users.getUsername().equals("tony")) {
	return "valid username";
}
return "invalid username";
}
}
