package springmain.Controller;

import java.awt.PageAttributes.MediaType;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import springmain.Entity.Student;
import springmain.Serivce.StudentService;

// rest configuration of our project.
@RestController
@RequestMapping("/students")
public class StudentController {

	@Autowired
	StudentService studentService;
	
	@RequestMapping(method = RequestMethod.GET)
	public Collection <Student>getAllStudents(){
		return studentService.getAllStudents();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Student getStudentById(@PathVariable("id") int id) {
		return studentService.getStudentById(id);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteStudent(@PathVariable("id") int id) {
		studentService.removeStudentById(id);
	}
	
	@RequestMapping(method = RequestMethod.PUT,consumes = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	
	public void updateStudent(@RequestBody Student student) {
		studentService.updateStudent(student);
	}
	
@RequestMapping(method = RequestMethod.POST,consumes = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	
	public void insertStudent(@RequestBody Student student) {
		studentService.insertStudent(student);
	}
	
}
