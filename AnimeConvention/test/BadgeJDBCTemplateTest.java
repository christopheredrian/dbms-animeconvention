/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import edu.slu.dbms.anicon.db.badge.Badge;
import edu.slu.dbms.anicon.db.badge.BadgeJDBCTemplate;
import edu.slu.dbms.anicon.db.ticket.TicketJDBCTemplate;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Chris
 */
public class BadgeJDBCTemplateTest {

    private ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
    private BadgeJDBCTemplate jdbcTemplate = (BadgeJDBCTemplate) context.getBean("badgeJDBCTemplate");

    public BadgeJDBCTemplateTest() {
    }

    // @Test
    public void testListAllBadges() {
        System.out.println("Listing all badges");
        List<Badge> badges = jdbcTemplate.listAllBadges();
        for (Badge badge : badges) {
            System.out.println(badge.toString());
        }
    }

    //@Test
    public void testDeleteRow() {
        System.out.println("Deleting id#6");
        jdbcTemplate.deleteRow(6);
    }

    //@Test
    public void testCreateBadge() {
        System.out.println("Creating badge");
        Badge badge = new Badge(3, 3, 2);
        jdbcTemplate.create(badge);

    }

    @Test
    public void testUpdateBadgeType() {
        System.out.println("Updating badgeId 8");
        Badge badge = jdbcTemplate.getRow(8);
        jdbcTemplate.updateBadge(8, badge.getBadgeNo(), badge.getDaysLeft() - 1, null);
        jdbcTemplate.updateBadge(8, badge.getBadgeNo(), badge.getDaysLeft() + 1, null);
        jdbcTemplate.updateBadge(8, badge.getBadgeNo(), badge.getDaysLeft() + 1,
                new Date(Calendar.getInstance().getTimeInMillis()));
    }

    // @Test
    public void testGetRow() {
        System.out.println("getting reqid 8");
        Badge badge = jdbcTemplate.getRow(8);
        System.out.println(badge.toString());
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
