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
		return studentDao.getAllStudents();
	}
	
	public Student getStudentById(int id) {
		return studentDao.getStudentById(id);
	}

}
