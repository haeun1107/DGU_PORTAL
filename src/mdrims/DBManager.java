package mdrims;
import java.sql.*;

public class DBManager {
    InsertQuery insert_query = new InsertQuery();

    public Connection dbConn;

    public void insert_student(StudentsVO studentsVO) {
        dbConn = DBConnector.getConnection();
        insert_query.insert_student(dbConn, studentsVO);
        DBConnector.close();
    }
    public void insert_professor(ProfessorsVO professorsVO) {
        dbConn = DBConnector.getConnection();
        insert_query.insert_professor(dbConn, professorsVO);
        DBConnector.close();
    }
    public void insert_class(ClassVO classVO) {
        dbConn = DBConnector.getConnection();
        insert_query.insert_class(dbConn, classVO);
        DBConnector.close();
    }
    public void insert_grade(GradeVO gradeVO) {
        dbConn = DBConnector.getConnection();
        insert_query.insert_grade(dbConn, gradeVO);
        DBConnector.close();
    }
}
