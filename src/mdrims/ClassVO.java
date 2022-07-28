package mdrims;

public class ClassVO {
    private int id;
    private String name;
    private String time;
    private int class_to;
    private int professor_id;
    private String state;
    private String extra;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getTime(){
        return this.time;
    }
    public void setTime(String time) { this.time = time; }
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
    public String getState() { return state; }
    public void setState(String state) { this.state = state; }
    public String getExtra() {
        return extra;
    }
    public void setExtra(String extra) {
        this.extra = extra;
    }

    @Override
    public String toString() {
        return "ClassVO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", time='" + time + '\'' +
                ", class_to=" + class_to +
                ", professor_id=" + professor_id +
                ", state='" + state + '\'' +
                ", extra='" + extra + '\'' +
                '}';
    }
}
