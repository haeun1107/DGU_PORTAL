package mdrims;
import java.sql.*;
import java.util.ArrayList;

public class SelectQuery {
    public ResultSet select_class(Connection dbConn) throws SQLException {
        String sql = "SELECT id, name, time, class_to, professor_id, extra FROM class";
        Statement stmt = dbConn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        return rs;
    }
    public ResultSet select_professor(Connection dbConn, int professor_id) throws SQLException {
        String sql = "SELECT name FROM professors where id ="+professor_id;
        Statement stmt = dbConn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        return rs;
    }

    public ResultSet select_grade(Connection dbConn, int input_id) throws SQLException {
        String sql = "SELECT code, professor_id, student_id, grade FROM grade WHERE student_id="+input_id;
        Statement stmt = dbConn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        return rs;
    }
    public ResultSet select_student(Connection dbConn, int student_id) throws SQLException {
        String sql = "SELECT name FROM students where id ="+student_id;
        Statement stmt = dbConn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        return rs;
    }
    public ResultSet select_name(Connection dbConn, int code) throws SQLException {
        String sql = "SELECT name FROM class WHERE id="+code;
        Statement stmt = dbConn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        return rs;
    }
    //    public void select_student(Connection dbConn, StudentsVO studentsVO){
//        String sql= "SELECT ";
//        try {
//
//
//        } catch (SQLException e) {
//            System.out.println(e.toString());
//        }


}
