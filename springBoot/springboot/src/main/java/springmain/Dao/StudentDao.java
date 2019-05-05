package springmain.Dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import springmain.Entity.Student;


@Repository
public class StudentDao {
	private static Map<Integer, Student> students;
	
	// create our students as value on the map.
	static {
		students = new HashMap<Integer, Student>(){
			{
			put(1,new Student(1,"Said","Computer science"));
			put(2,new Student(2,"Aziz","Physiques"));
			put(3,new Student(3,"Elias","Sport"));
			}
		};
	}
	// return the value of the map that i will be our students.
	public Collection <Student>getAllStudents(){
		return this.students.values();
	}
	
	//return the student who have the id entered.
	public Student getStudentById(int id) {
		return this.students.get(id);
	}

	public void removeStudentById(int id) {
	this.students.remove(id);
	}
	
	public void updateStudentById(Student student) {
		Student s = students.get(student.getId());
		s.setCourse(student.getCourse());
		s.setName(student.getName());
		students.put(student.getId(), student);
	}

	public void insertStudent(Student student) {
		this.students.put(student.getId(), student);
	}

}
