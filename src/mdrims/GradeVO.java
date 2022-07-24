package mdrims;

public class GradeVO {
    private int num;
    private String code;
    private int professor_id;
    private int student_id;
    private double grade;
    private String extra;

    public int getNum() {
        return this.num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getProfessor_id() {
        return professor_id;
    }

    public void setProfessor_id(int professor_id) {
        this.professor_id = professor_id;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    @Override
    public String toString() {
        return "StudentsVO {num=" + num +
                ", code='" + code + '\'' +
                ", professor_id=" + professor_id +
                ", student_id=" + student_id +
                ", state=" + grade +
                ", extra='" + extra + '\'' +
                '}';
    }
}
