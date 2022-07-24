package mdrims;

public class ClassVO {
    private String code;
    private String time;
    private int class_to;
    private int professor_id;
    private String extra;

    public String getCode(){
        return this.code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getTime(){
        return this.time;
    }
    public void setTime(String time) {
        this.code = time;
    }
    public int getClass_to() {
        return class_to;
    }
    public void setClass_to(int class_to) {
        this.class_to = class_to;
    }
    public int getProfessor_id() {
        return professor_id;
    }
    public void setProfessor_id(int professor_id) {
        this.professor_id = professor_id;
    }
    public String getExtra() {
        return extra;
    }
    public void setExtra(String extra) {
        this.extra = extra;
    }

    @Override
    public String toString() {
        return "StudentsVO {code='" + code + '\'' +
                ", time='" + time + '\'' +
                ", class_to=" + class_to +
                ", professor_id=" + professor_id +
                ", extra='" + extra + '\'' +
                '}';
    }
}
