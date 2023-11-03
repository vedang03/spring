package com.aurionpro;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.aurionpro.dao.StudentDao;
import com.aurionpro.entity.Student;

@SpringBootApplication
public class Application implements CommandLineRunner{
	
	private StudentDao studentDao;

	public Application(StudentDao studentDao) {
		super();
		this.studentDao = studentDao;
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		addNewStudent();
//		findStudentById(25);
//		findAllStudents();
//		deleteStudentsById();
//		findStudentByFirstName();
//		findStudentByFirstAndLastName();
//		findStudentByEmail();
//		updateStudent();
		updateStudentById();
	}


	private void updateStudentById() {
             studentDao.updateStudentById(25);
            
	}

	private void updateStudent() {
		Student student = new Student(26,"Anushka","Sharma","anushka@gmail.com");		
		studentDao.updateStudent(student);
	}

	private void findStudentByEmail() {
        String email = "ved@gmail.com";
        Student student = studentDao.findStudentByEmail(email);   
        System.out.println(student);
	}

	private void findStudentByFirstAndLastName() {
          String firstName = "Virat";
          String lastName = "Kohli";
          List<Student>students = studentDao.findStudentByFirstNameAndLastName(firstName,lastName);
          System.out.println(students);
	}

	private void findStudentByFirstName() {
		String firstName = "Virat";
		List<Student>students = studentDao.findStudentByFirstName(firstName);		
		System.out.println(students);
	}

	private void deleteStudentsById() {
		studentDao.deleteStudentById(3);
		
	}

	private void findAllStudents() {
		List<Student>students = studentDao.findAllStudents();
		System.out.println(students);
	}

	private void findStudentById(int id) {
		Student student = studentDao.findStudentById(id);
		System.out.println(student);
		
		
	}

	private void addNewStudent() {
		Student student = new Student("Ishant","Sharma","ishant@gmail.com");
		studentDao.saveStudent(student);
		System.out.println("Student saved successfully!!");
		
	}

}
