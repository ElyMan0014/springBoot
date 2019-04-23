package springmain.Controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import springmain.Entity.Student;
import springmain.Serivce.StudentService;


@RestController
@RequestMapping("/students")
public class StudentController {

	@Autowired
	StudentService studentService;
	
	@RequestMapping(method = RequestMethod.GET)
	public Collection <Student>getAllStudents(){
		return studentService.getAllStudents();
	}


}
