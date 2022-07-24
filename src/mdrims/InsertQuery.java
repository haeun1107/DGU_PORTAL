package mdrims;
import java.sql.*;

public class InsertQuery {
    public InsertQuery() {}
    public void insert_student(Connection dbConn, StudentsVO studentsVO){
        String sql= "insert into students(id, name, major, avg_grade, email, state, extra) values(?,?,?,?,?,?,?)";
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
            System.out.println(e.toString());
        }
    }

}
