package edu.slu.thirdgroup.animeconvention.db;

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
        String SQL = "INSERT INTO Event VALUES (?, ?, ?, ?, ?,?)";
        // (auto)eventId, eventName, eventDesc, eventType, location, slots, status
        jdbcTemplate.update(SQL, bean.getEventName(), bean.getEventDesc(),
                bean.getEventType(), bean.getLocation(), bean.getSlots(),
                bean.getSlots());
        
    }

    @Override
    public BadgeType getEvent(Integer eventId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<BadgeType> listAllEvents() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Integer id, String eventDesc, String eventType, String location, int slots, boolean status) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
