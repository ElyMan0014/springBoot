package springmain.Serivce;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springmain.Dao.StudentDao;
import springmain.Entity.Student;

@Service
public class StudentService {
	
	@Autowired
	StudentDao studentDao;
	
	public Collection <Student>getAllStudents(){
		return this.studentDao.getAllStudents();
	}
	
	public Student getStudentById(int id) {
		return this.studentDao.getStudentById(id);
	}

	public void removeStudentById(int id) {
		this.studentDao.removeStudentById(id);
	}
	
	public void updateStudent(Student student) {
		this.studentDao.updateStudentById(student);
	}

	public void insertStudent(Student student) {
		this.studentDao.insertStudent(student);
		
	}

}
