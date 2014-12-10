package edu.slu.dbms.anicon.db.ticket;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Chris
 */
public class TicketMapper implements RowMapper<Ticket>{

    @Override
    public Ticket mapRow(ResultSet rs, int i) throws SQLException {
        Ticket ticket = new Ticket();
        ticket.setBadgeId(rs.getInt("badgeId"));
        ticket.setDateClaimed(rs.getDate("dateClaimed"));
        ticket.setEventId(rs.getInt("eventId"));
        ticket.setPayId(rs.getInt("payId"));
        ticket.setPrice(rs.getDouble("price"));
        ticket.setStatus(rs.getString("status"));
        ticket.setTicketNo(rs.getInt("ticketNo"));
        return ticket;
    }
    
}
