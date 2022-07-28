package mdrims;
import java.sql.*;
import java.util.ArrayList;

public class SelectQuery {
    public void select_class(Connection dbConn, ClassVO classVO) throws SQLException {
        String sql = "SELECT id, name, time, class_to, professor_id, extra FROM class";
        Statement stmt = dbConn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        while(rs.next()) {
            classVO.setId(rs.getInt("id"));
            classVO.setName(rs.getString("name"));
            classVO.setTime(rs.getString("time"));
            classVO.setClass_to(rs.getInt("class_to"));
            classVO.setProfessor_id(rs.getInt("professor_id"));
            classVO.setExtra(rs.getString("extra"));
            DBManager.return_class(classVO);
            System.out.println(classVO);
        }
    }

    public void select_grade(Connection dbConn, int input_id, GradeVO gradeVO) throws SQLException {
        String sql = "SELECT code, grade FROM grade WHERE student_id="+input_id;
        Statement stmt = dbConn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        while(rs.next()) {
            String code = rs.getString("code");
            String grade = rs.getString("grade");
            System.out.print("강좌 코드: " + code);
            System.out.println(", 성적: " + grade);
        }
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
