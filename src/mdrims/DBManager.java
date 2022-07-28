package mdrims;
import java.sql.*;

public class DBManager {
    InsertQuery insert_query = new InsertQuery();
    UpdateQuery update_query = new UpdateQuery();
    SelectQuery select_query = new SelectQuery();
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
    public void insert_grade(GradeVO gradeVO) {
        dbConn = DBConnector.getConnection();
        insert_query.insert_grade(dbConn, gradeVO);
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
    public void select_class(ClassVO classVO) throws SQLException {
        dbConn = DBConnector.getConnection();
        select_query.select_class(dbConn, classVO);
    }
    public static void return_class(ClassVO classVO) throws SQLException {
        DBManager.dbConn = DBConnector.getConnection();
        System.out.print("강좌 번호: " + classVO.getId());
        System.out.print(", 강좌명: "+ classVO.getName());
        System.out.print(", 시간: : " + classVO.getTime());
        System.out.print(", 수강 인원: " );
        System.out.print(", 수강 정원: " + classVO.getClass_to());
        System.out.print(", 교번: " + classVO.getProfessor_id());
        System.out.print(", 비고: " + classVO.getExtra());
        System.out.println();
    }
    public void apply_class(SugangVO sugangVO) {

    }
    public void select_grade(int input_id, GradeVO gradeVO) throws SQLException {
        dbConn = DBConnector.getConnection();
        select_query.select_grade(dbConn, input_id, gradeVO);
    }
}
