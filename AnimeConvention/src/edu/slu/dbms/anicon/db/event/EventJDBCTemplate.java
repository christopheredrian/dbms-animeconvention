package edu.slu.dbms.anicon.db.event;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author chris
 */
public class EventJDBCTemplate implements EventDAO{

    private DataSource datasource;
    private JdbcTemplate jdbcTemplate;
    
    @Override
    public void setDataSource(DataSource ds) {
       this.datasource = ds;
       this.jdbcTemplate = new JdbcTemplate(datasource);
    }

    @Override
    public void create(Event bean) {
        String SQL = "INSERT INTO event (eventName, eventDesc, eventType,"
                + "location, slots, status) VALUES(?,?,?,?,?,?)";
        // (auto)eventId, eventName, eventDesc, eventType, location, slots, status
        jdbcTemplate.update(SQL, bean.getEventName(), bean.getEventDesc(),
                bean.getEventType(), bean.getLocation(), bean.getSlots(),
                bean.getStatus());
        
    }

    @Override
    public Event getEvent(Integer eventId) {
        String SQL = "SELECT * FROM event WHERE eventId = ?";
        Event event = jdbcTemplate.queryForObject(SQL, new Object[]{eventId}, new EventMapper());
        return event;
    }

    @Override
    public List<Event> listAllEvents() {
        String SQL = "SELECT * FROM event";
        List<Event> events = jdbcTemplate.query(SQL, new EventMapper());
        return events;
    }

    @Override
    public void delete(Integer id) {
        String SQL = "DELETE FROM event WHERE eventId = ?";
        jdbcTemplate.update(SQL, id);
        System.out.println("Deleted Record with ID = " + id );
    }

    @Override
    public void update(Integer id, String eventDesc, String eventType, 
            String location, int slots, String status) {
        String SQL = "UPDATE event SET eventDesc = ?,"
                 + "eventType = ?,"
                 + "location = ?,"
                 + "slots = ?,"
                 + "status = ?"
                 + "WHERE eventId = ?";
        jdbcTemplate.update(SQL, eventDesc, eventType, location, slots, status,
                id);
    }   
    
}
