
package edu.slu.dbms.group3.animeconvention.db.badgetype;

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

//      BadgeTypeJDBCTemplate badgeJDBCTemplate = 
//      (BadgeTypeJDBCTemplate)context.getBean("studentJDBCTemplate");
             BadgeTypeJDBCTemplate badgeJDBCTemplate = 
      (BadgeTypeJDBCTemplate)context.getBean("badgeTypeJDBCTemplate");
      
      System.out.println("------Records Creation--------" );

//      BadgeType badgeType = new BadgeType();
//      badgeType.setAmount(250);
//      badgeType.setBadgeDesc("This is a silver badge");
//      badgeType.setBadgeName("silver");
//      badgeType.setBadgeNumber(2);
//      badgeType.setFreebies("Silver spoon");
//      badgeType.setNoOfDays(1);
//      badgeJDBCTemplate.create(badgeType);

//      BadgeType toDisplay = badgeJDBCTemplate.getBadge(3);
//        System.out.println(toDisplay.toString());
       
      System.out.println("------Listing Multiple Records--------" );
      List<BadgeType> students = badgeJDBCTemplate.listBadgeTypes();
      for (BadgeType record : students) {
          System.out.println(record.toString());
      }

//      System.out.println("----Updating Record with ID = 1 -----" );
//      badgeJDBCTemplate.update(1, "You were hacked",34000, "GOLDEN SPOON");
//
//      System.out.println("----Listing Record with ID = 2 -----" );
//      Student student = studentJDBCTemplate.getStudent(2);
//      System.out.print("ID : " + student.getId() );
//      System.out.print(", Name : " + student.getName() );
//      System.out.println(", Age : " + student.getAge());
      
      
//      badgeJDBCTemplate.delete(1);
    }
}
