package com.example.demo.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Service.service;
import com.example.demo.model.Student;
@RestController
public class ApiController {
         @Autowired
         service s;    
         @PutMapping("/putfam")
     	public Student updateInfo(@RequestBody Student st1) {
     		return s.updateDetails(st1);
     	}
     	@DeleteMapping("/delfam/{name}")
     	public String deleteInfo(@PathVariable("age")int age) {
     		s.deleteDetails(age);
     		return "Deleted details";
     	}  
}