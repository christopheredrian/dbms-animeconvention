package edu.slu.dbms.anicon.db.badge;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Chris
 */
public class BadgeJDBCTemplate implements BadgeDAO {

    private DataSource datasource;
    private JdbcTemplate jdbcTemplate;

    @Override
    public void setDataSource(DataSource ds) {
        this.datasource = ds;
        this.jdbcTemplate = new JdbcTemplate(datasource);
    }

    @Override
    public void create(Badge badge) {
        String sql = "INSERT INTO badge (daysLeft, badgeNo, memberId) "
                + "VALUES (?, ?, ?)";
        Object[] args = new Object[]{
            badge.getDaysLeft(),
            badge.getBadgeNo(),
            badge.getMemberId()
        };
        jdbcTemplate.update(sql, args);
    }

    @Override
    public void updateBadge(Integer badgeId, Integer badgeNo, Integer daysLeft,
            Date dateClaimed) {
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String sql = "UPDATE badge SET badgeNo = ?, "
                + "daysLeft = ?, dateClaimed = ? WHERE badgeId = ?";
        Object[] args = new Object[]{
            badgeNo,
            daysLeft,
            (dateClaimed != null ? sdf.format(dateClaimed) : null),
            badgeId
        };
        jdbcTemplate.update(sql, args);
    }

    @Override
    public void deleteRow(Integer badgeId) {
        String sql = "DELETE FROM badge WHERE badgeId = ?";
        jdbcTemplate.update(sql, new Object[]{badgeId});
    }

    @Override
    public List<Badge> listAllBadges() {
        String sql = "SELECT * FROM badge";
        List<Badge> badges = jdbcTemplate.query(sql, new BadgeMapper());
        return badges;
    }

    @Override
    public Badge getRow(Integer badgeId) {
        String sql = "SELECT * FROM badge WHERE badgeId = ?";
        Badge badge = jdbcTemplate.queryForObject(sql, new Object[]{badgeId},
                new BadgeMapper());
        return badge;
    }

}
