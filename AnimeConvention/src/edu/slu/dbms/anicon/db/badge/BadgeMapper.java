
package edu.slu.dbms.anicon.db.badge;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Chris
 */
public class BadgeMapper implements RowMapper<Badge>{

    @Override
    public Badge mapRow(ResultSet rs, int i) throws SQLException {
        Badge badge = new Badge();
        badge.setBadgeId(rs.getInt("badgeId"));
        badge.setBadgeNo(rs.getInt("badgeNo"));
        badge.setDateClaimed(rs.getDate("dateClaimed"));
        badge.setDaysLeft(rs.getInt("daysLeft"));
        badge.setMemberId(rs.getInt("memberId"));
        return badge;
    }
    
}
