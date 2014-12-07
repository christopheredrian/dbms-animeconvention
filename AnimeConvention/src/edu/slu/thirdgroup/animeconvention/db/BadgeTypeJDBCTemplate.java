
package edu.slu.thirdgroup.animeconvention.db;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author chris
 */
public class BadgeTypeJDBCTemplate implements BadgeTypeDAO{
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;
    
    @Override
    public void setDataSource(DataSource ds) {
     this.dataSource = ds;
     jdbcTemplateObject = new JdbcTemplate(dataSource);
    }

    @Override
    public void create(BadgeType bean) {
      String sql = "INSERT INTO badgetype VALUES(?,?,?,?,?,?)";
      jdbcTemplateObject.update(sql, bean.getBadgeNumber(), bean.getAmount(), bean.getBadgeName(),
              bean.getBadgeDesc(), bean.getBadgeNumber(), bean.getFreebies());
        System.out.println("Added new record!");
    }

    /**
     * NOT YET WORKING
     */
    @Override
    public BadgeType getBadge(Integer badgeId) {
      String sql = "SELECT * FROM badgetype WHERE badgeNo = ?";
      BadgeType badgeType = jdbcTemplateObject.queryForObject(sql, new Object[]{badgeId},
              new BadgeTypeMapper());
      return badgeType;
    }

    @Override
    public List<BadgeType> listBadgeTypes() {
      String SQL = "select * from badgetype";
      List <BadgeType> badgeTypes = jdbcTemplateObject.query(SQL, 
                                new BadgeTypeMapper());
      return badgeTypes;
     //   return null;
    }

    @Override
    public void delete(Integer id) {
      String SQL = "DELETE FROM badgetype WHERE badgeNo = ?";
      jdbcTemplateObject.update(SQL, id);
       System.out.println("Deleted Record with ID = " + id );
    }

    @Override
    public void update(Integer id, String badgeDesc, double amount, String freebies) {
       String SQL = "UPDATE badgetype set badgeDesc = ?,"
               + "amount = ?,"
               + "freebies = ? WHERE badgeNo = ?";
       jdbcTemplateObject.update(SQL, badgeDesc, amount, freebies, id);
    }
    
}
