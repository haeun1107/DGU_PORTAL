package mdrims;
import java.sql.*;

public class DBManager {
    InsertQuery insert_query = new InsertQuery();
    UpdateQuery update_query = new UpdateQuery();
    SelectQuery select_query = new SelectQuery();
    DeleteQuery delete_query = new DeleteQuery();
    public static Connection dbConn;

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
//    public void insert_grade(GradeVO gradeVO) {
//        dbConn = DBConnector.getConnection();
//        insert_query.insert_grade(dbConn, gradeVO);
//        DBConnector.close();
//    }

    public void insert_sugang(SugangVO sugangVO, GradeVO gradeVO) throws SQLException {
        dbConn = DBConnector.getConnection();
        insert_query.insert_sugang(dbConn, sugangVO, gradeVO);
        DBConnector.close();
    }
    public void update_student_state(StudentsVO studentsVO) {
        dbConn = DBConnector.getConnection();
        update_query.update_student_state(dbConn, studentsVO);
    }
    public void update_professor_state(ProfessorsVO professorsVO) {
        dbConn = DBConnector.getConnection();
        update_query.update_professor_state(dbConn, professorsVO);
    }
    public void update_grade(GradeVO gradeVO) {
        dbConn = DBConnector.getConnection();
        update_query.update_grade(dbConn, gradeVO);
    }
    public ResultSet select_class() throws SQLException {
        dbConn = DBConnector.getConnection();
        return select_query.select_class(dbConn);
    }
    public ResultSet check_to(int code) throws SQLException {
        dbConn = DBConnector.getConnection();
        return select_query.check_to(dbConn, code);
    }
    public ResultSet select_professor(int professor_id) throws SQLException {
        dbConn = DBConnector.getConnection();
        return select_query.select_professor(dbConn, professor_id);
    }
    public ResultSet select_grade(int input_id) throws SQLException {
        dbConn = DBConnector.getConnection();
        return select_query.select_grade(dbConn, input_id);
    }
    public ResultSet select_student(int student_id) throws SQLException {
        dbConn = DBConnector.getConnection();
        return select_query.select_student(dbConn, student_id);
    }
    public ResultSet select_name(int code) throws SQLException {
        dbConn = DBConnector.getConnection();
        return select_query.select_name(dbConn, code);
    }
    public ResultSet select_class_to(int code) throws SQLException {
        dbConn = DBConnector.getConnection();
        return select_query.select_class_to(dbConn, code);
    }
    public void select_id(SugangVO sugangVO, GradeVO gradeVO) throws SQLException {
        dbConn = DBConnector.getConnection();
        select_query.select_id(dbConn, sugangVO, gradeVO);
        DBConnector.close();
    }

    public void delete_sugang(SugangVO sugangVO) throws SQLException {
        dbConn = DBConnector.getConnection();
        delete_query.delete_sugang(dbConn, sugangVO);
        DBConnector.close();
    }
}
