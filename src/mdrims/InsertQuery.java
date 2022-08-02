package mdrims;
import java.sql.*;

public class InsertQuery {
    //public InsertQuery() {}
    public void insert_student(Connection dbConn, StudentsVO studentsVO) {
        String sql = "insert into students(id, name, major, avg_grade, email, state, extra) values(?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = dbConn.prepareStatement(sql);
            ps.setInt(1, studentsVO.getId());
            ps.setString(2, studentsVO.getName());
            ps.setString(3, studentsVO.getMajor());
            ps.setFloat(4, studentsVO.getAvg_grade());
            ps.setString(5, studentsVO.getEmail());
            ps.setString(6, studentsVO.getState());
            ps.setString(7, studentsVO.getExtra());
            ps.execute();
            ps.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void insert_professor(Connection dbConn, ProfessorsVO professorsVO) {
        String sql = "insert into professors(id, name, major, email, state, extra) values(?,?,?,?,?,?)";
        try {
            PreparedStatement ps = dbConn.prepareStatement(sql);
            ps.setInt(1, professorsVO.getId());
            ps.setString(2, professorsVO.getName());
            ps.setString(3, professorsVO.getMajor());
            ps.setString(4, professorsVO.getEmail());
            ps.setString(5, professorsVO.getState());
            ps.setString(6, professorsVO.getExtra());
            ps.execute();
            ps.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void insert_class(Connection dbConn, ClassVO classVO) {
        String sql = "insert into class(id, name, time, class_to, professor_id, state, extra) values(?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = dbConn.prepareStatement(sql);
            ps.setInt(1, classVO.getId());
            ps.setString(2, classVO.getName());
            ps.setString(3, classVO.getTime());
            ps.setInt(4, classVO.getClass_to());
            ps.setInt(5, classVO.getProfessor_id());
            ps.setString(6, classVO.getState());
            ps.setString(7, classVO.getExtra());
            ps.execute();
            ps.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void insert_sugang (Connection dbConn, SugangVO sugangVO, GradeVO gradeVO) throws  SQLException {
        try {
            String sql = "insert into grade(id, code, professor_id, student_id, grade, extra) values(" + "?, ?, (select professor_id from class where id = ?), ?, 0, '')";
            PreparedStatement ps = dbConn.prepareStatement(sql);
            ps.setInt(1, (gradeVO.getMax_id()+1));
            ps.setInt(2, sugangVO.getCode());
            ps.setInt(3, sugangVO.getCode());
            ps.setInt(4, sugangVO.getStudent_id());
            ps.execute();
            ps.close();

            sql = "insert into sugang(id, code, professor_id, student_id, state, extra) values(" + "?, ?, (select professor_id from class where id = ?), ?, '신청완료', '')";
            ps = dbConn.prepareStatement(sql);
            ps.setInt(1, (sugangVO.getMax_id()+1));
            ps.setInt(2, sugangVO.getCode());
            ps.setInt(3, sugangVO.getCode());
            ps.setInt(4, sugangVO.getStudent_id());
            ps.execute();
            ps.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}