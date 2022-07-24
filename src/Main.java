import mdrims.*;
import java.sql.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
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
            System.out.println("3. 수업 추가");
            System.out.println("4. 성적 기입");
            System.out.println("5. 휴학/휴직 처리");
            System.out.println("6. 복학/복직 처리");
            System.out.println("7. 강좌 개설/폐설");
            System.out.println("8. 학생별 성적 조회");
            System.out.println("9. 수강신청");
            System.out.println("10. 수강정정");
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
                    professorsVO.setExtra(sc.next());

                    dbmanager.insert_professor(professorsVO);
                    System.out.println("SUCCESS!!!");
                    break;
                case 3:
                    System.out.print("강좌 번호: ");
                    classVO.setCode(sc.next());
                    System.out.print("교과목명: ");
                    classVO.setName(sc.next());
                    System.out.print("강의 시간: ");
                    classVO.setTime(sc.next());
                    System.out.print("수강 정원: ");
                    classVO.setClass_to(sc.nextInt());
                    System.out.print("담당 교수 교번: ");
                    classVO.setProfessor_id(sc.nextInt());
                    System.out.print("비고: ");
                    classVO.setExtra(sc.next());

                    dbmanager.insert_class(classVO);
                    System.out.println("SUCCESS!!!");
                    break;
                case 4:
                    System.out.print("강좌 번호: ");
                    gradeVO.setCode(sc.next());
                    System.out.print("담당 교수 교번: ");
                    gradeVO.setProfessor_id(sc.nextInt());
                    System.out.print("학번: ");
                    gradeVO.setStudent_id(sc.nextInt());
                    System.out.print("성적: ");
                    gradeVO.setGrade(sc.nextDouble());
                    System.out.print("비고: ");
                    gradeVO.setExtra(sc.next());

                    dbmanager.insert_grade(gradeVO);
                    System.out.println("SUCCESS!!!");
                    break;
                default:
                    break;
            }
        }
    }
}


