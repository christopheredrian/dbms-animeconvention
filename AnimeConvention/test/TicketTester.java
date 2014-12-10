/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import edu.slu.dbms.anicon.db.ticket.Ticket;
import edu.slu.dbms.anicon.db.ticket.TicketJDBCTemplate;
import java.util.List;
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Chris
 */
public class TicketTester {
    
    private ApplicationContext context= new ClassPathXmlApplicationContext("Beans.xml");
    private TicketJDBCTemplate jdbcTemplate = (TicketJDBCTemplate) context.getBean("ticketJDBCTemplate");
    
    @BeforeClass
    public static void setUpClass() {
    }
        
    @Before
    public void setUp() {
             
    }
    
    //@Test
    public void testListAllTickets(){
        System.out.println("Listing all tickets");
        List<Ticket> tickets = jdbcTemplate.listAllTickets();
        for (Ticket ticket : tickets) {
            System.out.println(ticket.toString()); 
        }
    }

    //@Test 
    public void testListAllTicketsGivenEventNumber(){
        System.out.println("Listing all tickets with eventId 2");
        List<Ticket> tickets = jdbcTemplate.listAllTickets(2);
        for (Ticket ticket : tickets) {
            System.out.println(ticket.toString()); 
        }
    }
    
    //@Test
    public void testCreateTicket(){
        System.out.println("Creating ticket");
        Ticket ticket = new Ticket(51, 3455, "unused", 3);
        jdbcTemplate.create(ticket);
    }
    
    //@Test
    public void testGetTicket(){
         System.out.println("Getting ticket #50");
        Ticket ticket = jdbcTemplate.getTicket(50);
         System.out.println(ticket.toString());
    }
    
    //@Test
    public void testUpdateTicketStatus(){
        boolean used = true;
        System.out.println("Updating ticket #50 to " + used);
        jdbcTemplate.updateTicketStatus(50, used);
        Ticket ticket = jdbcTemplate.getTicket(50);
        System.out.println("Ticket Status is: " + ticket.getStatus());
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
