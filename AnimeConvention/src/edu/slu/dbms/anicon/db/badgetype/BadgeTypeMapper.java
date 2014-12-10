
package edu.slu.dbms.anicon.db.badgetype;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author chris
 */
public class BadgeTypeMapper implements RowMapper<BadgeType>{

    @Override
    public BadgeType mapRow(ResultSet rs, int i) throws SQLException {
        BadgeType badgeType = new BadgeType();
        badgeType.setAmount(rs.getDouble("amount"));
        badgeType.setBadgeDesc(rs.getString("badgeDesc"));
        badgeType.setBadgeName(rs.getString("badgeName"));
        badgeType.setBadgeNumber(rs.getInt("badgeNo"));
        badgeType.setFreebies(rs.getString("freebies"));
        badgeType.setNoOfDays(rs.getInt("noOfDays"));
        return badgeType;
    }
    
}
