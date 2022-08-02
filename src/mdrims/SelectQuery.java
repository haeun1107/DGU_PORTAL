package mdrims;
import java.sql.*;
import java.util.ArrayList;

public class SelectQuery {
    public ResultSet select_class(Connection dbConn) throws SQLException {
        String sql = "SELECT id, name, time, class_to, professor_id, extra FROM class";
        try {
            Statement stmt = dbConn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            return rs;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public ResultSet check_to(Connection dbConn, int code) throws SQLException {
        String sql = "SELECT id FROM grade where code =" + code;
        try {
            Statement stmt = dbConn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            return rs;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public ResultSet select_professor(Connection dbConn, int professor_id) throws SQLException {
        String sql = "SELECT name FROM professors where id =" + professor_id;
        try {
            Statement stmt = dbConn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            return rs;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public ResultSet select_grade(Connection dbConn, int input_id) throws SQLException {
        String sql = "SELECT code, professor_id, student_id, grade FROM grade WHERE student_id=" + input_id;
        try {
            Statement stmt = dbConn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            return rs;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public ResultSet select_student(Connection dbConn, int student_id) throws SQLException {
        String sql = "SELECT name FROM students where id =" + student_id;
        try {
            Statement stmt = dbConn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            return rs;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public ResultSet select_name(Connection dbConn, int code) throws SQLException {
        String sql = "SELECT name FROM class WHERE id=" + code;
        try {
            Statement stmt = dbConn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            return rs;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public ResultSet select_class_to(Connection dbConn, int code) throws SQLException {
        String sql = "SELECT class_to FROM class WHERE id=" + code;
        try {
            Statement stmt = dbConn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            return rs;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void select_id(Connection dbConn, SugangVO sugangVO, GradeVO gradeVO) throws SQLException {
        try {
            String sql = "SELECT id FROM sugang";
            Statement stmt = dbConn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            sugangVO.setMax_id(1);
            while(rs.next()) {
                sugangVO.setId(rs.getInt("id"));
                if (sugangVO.getId() >= sugangVO.getMax_id())
                    sugangVO.setMax_id(sugangVO.getId());
            }

            sql = "SELECT id FROM grade";
            stmt = dbConn.createStatement();
            rs = stmt.executeQuery(sql);
            gradeVO.setMax_id(1);
            while(rs.next()) {
                gradeVO.setId(rs.getInt("id"));
                if (gradeVO.getId() >= gradeVO.getMax_id())
                    gradeVO.setMax_id(gradeVO.getId());
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}