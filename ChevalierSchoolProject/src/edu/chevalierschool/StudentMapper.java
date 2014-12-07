
package edu.chevalierschool;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Chris
 */
public class StudentMapper implements RowMapper<Student>{

    @Override
    public Student mapRow(ResultSet rs, int i) throws SQLException {
        Student student = new Student();
        student.setStudentId(rs.getInt("studentId"));
        student.setLastName(rs.getString("lastName"));
        student.setFirstName(rs.getString("firstName"));
        java.util.Date newDate = new Date(rs.getDate("birthDay").getTime());
        student.setBirthDay(newDate);
        return student;
    }
    
    
}
