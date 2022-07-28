import mdrims.*;
import java.sql.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws SQLException {
        DBManager dbmanager = new DBManager();
        Scanner sc = new Scanner(System.in);

        StudentsVO studentsVO = new StudentsVO();
        ProfessorsVO professorsVO = new ProfessorsVO();
        ClassVO classVO = new ClassVO();
        GradeVO gradeVO = new GradeVO();
        SugangVO sugangVO = new SugangVO();

        int input_num = 0;

        while(true) {
            System.out.println("~~~~~~~~~mdrims~~~~~~~~~");
            System.out.println("0. 프로그램 종료");
            System.out.println("1. 학생 추가");
            System.out.println("2. 교수 추가");
            System.out.println("3. 성적 기입");
            System.out.println("4. 휴학/복학 신청");
            System.out.println("5. 휴직/복직 신청");
            System.out.println("6. 강좌 개설/폐설");
            System.out.println("7. 수강신청");
            System.out.println("8. 수강정정");
            System.out.println("9. 학생별 성적 조회");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.print("원하는 기능의 숫자를 선택하세요 : ");
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
                    System.out.println("SUCCESS!!!");
                    break;
                case 2:
                    System.out.print("교번: ");
                    professorsVO.setId(sc.nextInt());
                    System.out.print("이름: ");
                    professorsVO.setName(sc.next());
                    System.out.print("전공: ");
                    professorsVO.setMajor(sc.next());
                    System.out.print("이메일: ");
                    professorsVO.setEmail(sc.next());
                    System.out.print("상태: ");
                    professorsVO.setState(sc.next());
                    System.out.print("비고: ");
                    professorsVO.setExtra(sc.nextLine());

                    dbmanager.insert_professor(professorsVO);
                    System.out.println("SUCCESS!!!");
                    break;
                case 3:
                    System.out.print("학번: ");
                    gradeVO.setStudent_id(sc.nextInt());
                    System.out.print("강좌 번호: ");
                    gradeVO.setCode(sc.nextInt());
                    System.out.print("성적: ");
                    gradeVO.setGrade(sc.nextFloat());

                    dbmanager.update_grade(gradeVO);
                    System.out.println("SUCCESS!!!");
                    break;
                case 4:
                    System.out.print("학번: ");
                    studentsVO.setId(sc.nextInt());
                    System.out.print("변경할 학적 상태: ");
                    studentsVO.setState(sc.next());

                    dbmanager.update_student_state(studentsVO);
                    System.out.println("SUCCESS!!!");
                    break;
                case 5:
                    System.out.print("교번: ");
                    professorsVO.setId(sc.nextInt());
                    System.out.print("변경할 학적 상태: ");
                    professorsVO.setState(sc.next());

                    dbmanager.update_professor_state(professorsVO);
                    System.out.println("SUCCESS!!!");
                    break;
                case 6:
                    System.out.print("강좌 번호: ");
                    classVO.setId(sc.nextInt());
                    System.out.print("강좌명: ");
                    classVO.setName(sc.next());
                    System.out.print("강의 시간: ");
                    classVO.setTime(sc.next());
                    System.out.print("수강 정원: ");
                    classVO.setClass_to(sc.nextInt());
                    System.out.print("담당 교수 교번: ");
                    classVO.setProfessor_id(sc.nextInt());
                    System.out.print("강좌 개설/폐설: ");
                    classVO.setState(sc.next());
                    System.out.print("비고: ");
                    classVO.setExtra(sc.nextLine());

                    dbmanager.insert_class(classVO);
                    System.out.println("SUCCESS!!!");
                    break;
                case 7:
                    System.out.println("~~~~~~~~~~~~~~~~~~~~강좌 목록~~~~~~~~~~~~~~~~~~~~");
                    dbmanager.select_class(classVO);

//                    System.out.println("수강 신청할 강좌 번호: ");
//                    sugangVO.setCode(sc.nextInt());

//                    System.out.println("학번: ");
//                    sugangVO.setStudent_id(sc.nextInt());
//                    System.out.println("강좌 번호: ");
//                    sugangVO.setCode(sc.next());
//
//                    dbmanager.apply_class(sugangVO);
                case 8:
                    break;
                case 9:
                    System.out.print("학번: ");
                    dbmanager.select_grade(sc.nextInt(), gradeVO);
                    break;
                default:
                    break;
            }
        }
    }
}


