package edu.slu.thirdgroup.animeconvention.db;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author chris
 */
public class EventMapper implements RowMapper<Event>{

    @Override
    public Event mapRow(ResultSet rs, int i) throws SQLException {
        Event event = new Event();
        event.setEventDesc(rs.getString("eventDesc"));
        event.setEventId(rs.getInt("eventId"));
        event.setEventName(rs.getString("eventName"));
        event.setEventType(rs.getString("eventType"));
        event.setLocation(rs.getString("location"));
        event.setOngoing(rs.getBoolean("ongoing"));
        event.setSlots(rs.getInt("slots"));
        return event;
    }
    
}
