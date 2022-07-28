package mdrims;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateQuery {
    public void update_student_state(Connection dbConn, StudentsVO studentsVO){
        String sql= "update students set state=? where id=?";
        try {
            PreparedStatement ps = dbConn.prepareStatement(sql);
            ps.setString(1, studentsVO.getState());
            ps.setInt(2, studentsVO.getId());
            int result = ps.executeUpdate();
            ps.close();
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void update_professor_state(Connection dbConn, ProfessorsVO professorsVO) {
        String sql= "update professors set state=? where id=?";
        try {
            PreparedStatement ps = dbConn.prepareStatement(sql);
            ps.setString(1, professorsVO.getState());
            ps.setInt(2, professorsVO.getId());
            int result = ps.executeUpdate();
            ps.close();
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void update_grade(Connection dbConn, GradeVO gradeVO) {
        String sql= "update grade set grade=? where student_id=? and code=?";
        try {
            PreparedStatement ps = dbConn.prepareStatement(sql);
            ps.setFloat(1, gradeVO.getGrade());
            ps.setInt(2, gradeVO.getStudent_id());
            ps.setInt(3, gradeVO.getCode());
            int result = ps.executeUpdate();
            ps.close();
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
