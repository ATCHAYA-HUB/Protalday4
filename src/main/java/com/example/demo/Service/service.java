package com.example.demo.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Repository.repository;
import com.example.demo.model.Student;
@Service
public class service {
@Autowired
 repository r;
public Student updateDetails(Student e1) {
	return r.saveAndFlush(e1);
}
public void deleteDetails(int id) {
	r.deleteById(id	);
}
}