package mdrims;
import java.sql.*;

public class DBManager {
    InsertQuery insert_query = new InsertQuery();
    UpdateQuery delete_query = new UpdateQuery();
    SelectQuery select_query = new SelectQuery();
    public Connection dbConn;

    public void insert_student(StudentsVO studentsVO) throws SQLException{
        dbConn = DBConnector.getConnection();
        insert_query.insert_student(dbConn, studentsVO);
        DBConnector.close();
    }
}
