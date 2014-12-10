package edu.slu.dbms.anicon.db.ticket;

import java.util.Date;
import java.util.List;
import javax.sql.DataSource;

/**
 *
 * @author Chris
 */
public interface TicketDAO {

    /**
     * This is the method to be used to initialize database resources ie.
     * connection.
     *
     * @param ds
     */
    public void setDataSource(DataSource ds);
    
    /**
     * Creates a ticket 
     * @param ticket
     */
    public void create(Ticket ticket);
    
    /**
     * Returns a ticket of the specified ticketNo
     * @param ticketNo
     * @return
     */
    public Ticket getTicket(Integer ticketNo);

    /**
     * Returns all rows inside the ticket table
     * @return
     */
    public List<Ticket> listAllTickets();
    
    /**
     * List all tickets associated with an eventId
     * @param eventId
     * @return
     */
    public List<Ticket> listAllTickets(Integer eventId);
    
    /**
     * Updates a ticket status
     * @param ticketNo ticket number to be updated
     * @param used if it is used 
     */
    public void updateTicketStatus(Integer ticketNo, boolean used);
    
    /**
     * Method for updating payId, badgeId, dateClaimed put null on no values
     * @param ticketNo
     * @param payId
     * @param badgeId
     * @param dateClaimed
     */
    public void updateTicket(Integer ticketNo, Integer payId,
            Integer badgeId, Date dateClaimed);
    
}
