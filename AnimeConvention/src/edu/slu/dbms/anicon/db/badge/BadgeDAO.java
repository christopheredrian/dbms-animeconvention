package edu.slu.dbms.anicon.db.badge;

import java.util.Date;
import java.util.List;
import javax.sql.DataSource;

/**
 *
 * @author Chris
 */
public interface BadgeDAO {
    /**
     * This is the method to be used to initialize database resources ie.
     * connection.
     *
     * @param ds
     */
    public void setDataSource(DataSource ds);

    /**
     * Inserts a row given a badge
     * @param badge
     */
    public void create(Badge badge);
    
    /**
     * Method used when a badge member upgrades badge type
     * @param badgeId
     * @param badgeNo BADGETYPE primary key (1,2,3)
     * @param daysLeft 
     * @param dateClaimed 
     */
    public void updateBadge(Integer badgeId, Integer badgeNo, Integer daysLeft,
            Date dateClaimed);
    
    public void deleteRow(Integer badgeId);
    
    /**
     * Returns all rows inside the badge table
     * @return
     */
    public List<Badge> listAllBadges();
 
    /**
     * Fetches a row from badge table given the badgeId 
     * @param badgeId
     * @return
     */
    public Badge getRow(Integer badgeId);
}
