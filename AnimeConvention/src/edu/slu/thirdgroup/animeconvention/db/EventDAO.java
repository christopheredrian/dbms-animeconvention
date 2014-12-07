package edu.slu.thirdgroup.animeconvention.db;

import java.util.List;
import javax.sql.DataSource;

/**
 *
 * @author chris
 */
public interface EventDAO {

    /**
     * This is the method to be used to initialize database resources ie.
     * connection.
     *
     * @param ds
     */
    public void setDataSource(DataSource ds);

    /**
     * This is the method to be used to create a record in the Event table.
     *
     * @param bean
     */
    public void create(Event bean);
    
    /**
     * This is the method to be used to list down a record from the Event
     * table corresponding to a passed eventId.
     *
     * @param eventId
     * @return
     */
    public BadgeType getEvent(Integer eventId);
    /**
     * This is the method to be used to list down all the records from the
     * Event table.
     *
     * 
     * @return 
     */
    public List<BadgeType> listAllEvents();
    
    /**
     * This is the method to be used to delete a record from the BadgeType table
     * corresponding to a passed Event id.
     *
     * @param id
     */
    public void delete(Integer id);

    /**
     * This is the method to be used to update a record into the Event
     * table.
     *
     * @param id
     * @param eventDesc
     * @param eventType
     * @param location
     * @param slots
     * @param status

     */

    public void update(Integer id, String eventDesc,String eventType,
            String location,int slots,boolean status);
}
