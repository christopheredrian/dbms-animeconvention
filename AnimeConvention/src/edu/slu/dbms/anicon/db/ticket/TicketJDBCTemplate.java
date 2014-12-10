package edu.slu.dbms.anicon.db.ticket;

import java.util.Date;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Chris
 */
public class TicketJDBCTemplate implements TicketDAO {

    private DataSource datasource;
    private JdbcTemplate jdbcTemplate;

    @Override
    public void setDataSource(DataSource ds) {
        this.datasource = ds;
        this.jdbcTemplate = new JdbcTemplate(datasource);
    }

    @Override
    public void create(Ticket ticket) {
        String SQL = "INSERT INTO ticket (ticketNo, price, status, eventId) "
                + "VALUES(?,?,?,?)";
        Object[] args = new Object[]{
            ticket.getTicketNo(),
            ticket.getPrice(),
            ticket.getStatus(),
            ticket.getEventId()
        };
        jdbcTemplate.update(SQL, args);
    }

    @Override
    public Ticket getTicket(Integer ticketNo) {
        String sql = "SELECT * FROM ticket WHERE ticketNO = ?";
        Ticket ticket = jdbcTemplate.queryForObject(sql, new Object[]{ticketNo},
                new TicketMapper());
        return ticket;
    }

    @Override
    public List<Ticket> listAllTickets() {
        String sql = "SELECT * FROM ticket";
        List<Ticket> tickets = jdbcTemplate.query(sql, new TicketMapper());
        return tickets;
    }

    @Override
    public List<Ticket> listAllTickets(Integer eventId) {
        String sql = "SELECT * FROM ticket WHERE eventId = ?";
        Object[] args = new Object[]{eventId};
        List<Ticket> tickets = jdbcTemplate.query(sql, args, new TicketMapper());
        return tickets;
    }

    @Override
    public void updateTicketStatus(Integer ticketNo, boolean used) {
        String sql = "UPDATE ticket SET status = ? WHERE ticketNo = ?";
        Object[] args = new Object[]{
            updateTicketStatus(used),
            ticketNo
        };
        jdbcTemplate.update(sql, args);
    }

    /* Helper method for updateTicketStatus(Integer ticketNo, boolean used) */
    private String updateTicketStatus(boolean used) {
        return used ? "used" : "unused";
    }

    @Override
    public void updateTicket(Integer ticketNo, Integer payId, Integer badgeId, Date dateClaimed) {
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String sql = "UPDATE ticket SET payId = ?,"
                + "badgeId = ?,"
                + "dateClaimed = ? "
                + "WHERE ticketNo = ?";
        Object[] args = new Object[]{
            payId,
            badgeId,
            (dateClaimed != null ? sdf.format(dateClaimed) : null),
            ticketNo
        };
        jdbcTemplate.update(sql, args);
    }

}
