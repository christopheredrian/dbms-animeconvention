
package edu.chevalierschool;

import java.util.Date;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Chris
 */
public class StudentJDBCTemplate implements StudentDAO{

    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;
    
    @Override
    public void setDataSource(DataSource ds) {
        this.dataSource = ds;
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
    }

    @Override
    public void create(String lastName, String firstName, Date birthDate) {
      String SQL = "insert into student (lastName, firstName, birthDay) values (?, ?, ?)";
      jdbcTemplateObject.update( SQL, lastName, firstName, birthDate);
      System.out.println("Created Record Name = " + lastName + " birthDay = " + birthDate.toString());
    }

    @Override
    public Student getStudent(Integer id) {
      String SQL = "select * from student where studentId = ?";
      Student student = jdbcTemplateObject.queryForObject(SQL, 
                        new Object[]{id}, new StudentMapper());
      return student;
    }

    @Override
    public List<Student> listStudents() {
      String SQL = "select * from Student";
      List <Student> students = jdbcTemplateObject.query(SQL, 
                                new StudentMapper());
      return students;
    }

    @Override
    public void delete(Integer id) {
       String SQL = "delete from student WHERE studentId = ?";
       jdbcTemplateObject.update(SQL, id);
       System.out.println("Deleted Record with ID = " + id );
    }

    @Override
    public void update(Integer id, String lastName) {
     String SQL = "update Student set lastName = ? where studentId = ?";
      jdbcTemplateObject.update(SQL, lastName, id);
      System.out.println("Updated Record with ID = " + id );
    }
    
}
