
package edu.chevalierschool;

import java.text.DateFormat;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Chris
 */
public class MainApp {
    
    public static void main(String[] args) {
       ApplicationContext context = 
             new ClassPathXmlApplicationContext("Beans.xml");

      StudentJDBCTemplate studentJDBCTemplate = 
      (StudentJDBCTemplate)context.getBean("studentJDBCTemplate");
      
//      System.out.println("------Records Creation--------" );
//      Calendar calendarInstance = Calendar.getInstance();
//      calendarInstance.set(2007, Calendar.DECEMBER, 13);
//      studentJDBCTemplate.create("Espiritu", "James", calendarInstance.getTime());


      System.out.println("------Listing Multiple Records--------" );
      List<Student> students = studentJDBCTemplate.listStudents();
      for (Student record : students) {
         System.out.print("StudentId : " + record.getStudentId());
         System.out.print(", Name : " + record.getLastName() + ", " + record.getFirstName());
         System.out.println(", birthDay : " + DateFormat.getDateInstance(DateFormat.MEDIUM).format(record.getBirthDay()));
      }

      System.out.println("----Updating Record with ID = 2 -----" );
      studentJDBCTemplate.update(5, "Dean");
//
//      System.out.println("----Listing Record with ID = 2 -----" );
//      Student student = studentJDBCTemplate.getStudent(2);
//      System.out.print("ID : " + student.getId() );
//      System.out.print(", Name : " + student.getName() );
//      System.out.println(", Age : " + student.getAge());
    }
}
