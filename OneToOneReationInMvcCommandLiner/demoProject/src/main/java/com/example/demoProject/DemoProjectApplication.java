package com.example.demoProject;


import com.example.demoProject.dao.StudentDAO;
import com.example.demoProject.entity.Address;
import com.example.demoProject.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Iterator;
import java.util.List;

@SpringBootApplication
public class DemoProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoProjectApplication.class, args);

		System.out.println("hiiii");
	}
	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		return  runner->{
			createStudent(studentDAO);
//			recordFind(studentDAO);
//            deleteTableRecord(studentDAO);
//			updateTableRecord(studentDAO);
//			showAllRecordInTable(studentDAO);
		};
	}
public void createStudent(StudentDAO studentDAO){
	System.out.println("Record Inserted Successfully............!!!");
	Address address=new Address("gokuldham","442604");
	Student student=new Student(3,"raju","officer colony","pune",address);
	studentDAO.save(student);
}
//public void recordFind(StudentDAO studentDAO){
//		Student student=studentDAO.find(6);
//	System.out.println(student);
//}
//public void deleteTableRecord(StudentDAO studentDAO){
//	System.out.println("Record deleted successfully.....!!");
//
//		studentDAO.deleteRecords(3);
//}
//
//
//public void updateTableRecord(StudentDAO studentDAO){
//		Student student=studentDAO.find(1);
//       student.setName("Avinash");
//       student.setAddress("Chandrapur");
//       student.setCity("pune");
//       studentDAO.updateRecord(student);
//}
//
//public  void  showAllRecordInTable(StudentDAO studentDAO){
//	List<Student>	studentList=studentDAO.findAll();
////	for (Student studentRecordTable:studentList
////		 ) {
////		System.out.println(studentRecordTable);
////	}
//
//	Iterator iterator= studentList.listIterator();
//	System.out.println("All Record Display Sucessfully......!! ");
//	while (iterator.hasNext()){
//
//		System.out.println(iterator.next());
//
//	}
//
//}

}
