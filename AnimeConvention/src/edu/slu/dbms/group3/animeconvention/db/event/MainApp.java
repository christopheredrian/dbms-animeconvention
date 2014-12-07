
package edu.slu.dbms.group3.animeconvention.db.event;

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
             EventJDBCTemplate eventJDBCTemplate = 
      (EventJDBCTemplate)context.getBean("eventJDBCTemplate");
      
//      System.out.println("------Records Creation--------" );
//      
//      Event event = new Event(); //event.setEventId(null); This is automatically generated
//      event.setEventDesc("This is the event description");
//      event.setEventName("Event010101");
//      event.setEventType("Drawing Competition");
//      event.setLocation("Room3A");
//      event.setStatus("Ongoing");
//      event.setSlots(50);
//      eventJDBCTemplate.create(event);
       
 

      System.out.println("----Updating Record with ID = 2 -----" );
      Event event2 = eventJDBCTemplate.getEvent(2);
      eventJDBCTemplate.update(2, event2.getEventDesc(), event2.getEventType(), "Silang", 
              event2.getSlots(), event2.getStatus());
      
           System.out.println("------Listing Multiple Records--------" );
        for (Event row : eventJDBCTemplate.listAllEvents()) {
            System.out.println(row.toString());
        }
      
//      System.out.println("----Listing Record with ID = 2 -----" );
//        System.out.println(eventJDBCTemplate.getEvent(2));
      
      // Record deletion
//      eventJDBCTemplate.delete(3);
//        System.out.println("Deleted eventId 3");
    }
}
