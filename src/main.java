import mdrims.DBConnector;

import mdrims.DBManager;
import mdrims.StudentsVO;
import java.sql.*;
import java.util.Scanner;


public class main {
    public static void main(String[] args) throws SQLException {
        DBManager dbmanager = new DBManager();
        StudentsVO studentsVO = new StudentsVO();
        Scanner sc = new Scanner(System.in);
        int input_num = 0;

        while(true) {
            System.out.println("~~~~~~~~~~mdrims~~~~~~~~~~");
            System.out.println("0. 프로그램 종료");
            System.out.println("1. 학생 추가");
            System.out.println("2. 교수 추가");
            System.out.println("3. 수업 추가");
            System.out.println("4. 성적 기입");
            System.out.println("5. 휴학/휴직 처리");
            System.out.println("6. 복학/복직 처리");
            System.out.println("7. 강좌 개설/폐설");
            System.out.println("8. 학생별 성적 조회");
            System.out.println("9. 수강신청");
            System.out.println("10. 수강정정");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            input_num = sc.nextInt();
            if (input_num == 0) {
                break;
            }
            switch (input_num) {
                case 1:
                    System.out.print("학번: ");
                    studentsVO.setId(sc.nextInt());
                    System.out.print("이름: ");
                    studentsVO.setName(sc.next());
                    System.out.print("전공: ");
                    studentsVO.setMajor(sc.next());
                    System.out.print("평균학점: ");
                    studentsVO.setAvg_grade(sc.nextFloat());
                    System.out.print("이메일: ");
                    studentsVO.setEmail(sc.next());
                    System.out.print("상태: ");
                    studentsVO.setState(sc.next());
                    System.out.print("비고: ");
                    studentsVO.setExtra(sc.next());

                    dbmanager.insert_student(studentsVO);
                    System.out.println("추가 완료!");
                    break;
                case 2:

                    System.out.println("추가 완료!");
                    break;
                default:
                    break;
            }
        }
    }
}


/*
try {
        Connection conn = DBConnector.getConnection();

        if(conn != null)
        System.out.println("DB 연결 성공!");

        int result = 0;

        // 쿼리문 전송을 위한 Statement 생성
        Statement stmt = conn.createStatement();

        // 데이터 추가 쿼리문
        // String sql = "INSERT INTO test (num, name, tel)"
        //        + " VALUES(1, 'haeun', 01049109394)";
//            String sql = "UPDATE test"
//                    + " SET name = 'eunchan', tel = '01080739394'"
//                    + " WHERE num = 1";
//            String sql = "DELETE FROM test"
//                    + " WHERE num = 1";
        String sql = "SELECT num, name, tel"
        + " FROM test";

        result = stmt.executeUpdate(sql);

        if(result > 0)
        System.out.println("데이터 추가 성공!");
        else
        System.out.println("데이터 추가 실패!");

//            ResultSet rs = stmt.executeQuery(sql);
//
//            System.out.println("번호     이름    전화번호");
//
//            while(rs.next())
//            {
//                System.out.printf("%d	%s	%s\n"
//                        , rs.getInt("num")
//                        , rs.getString("name")
//                        , rs.getString("tel"));
//            }
//
//            rs.close();

        stmt.close();
        DBConnector.close();
        System.out.println("DB 연결 종료");

        } catch(Exception e)
        {
        System.out.println(e.toString());
        }
 */