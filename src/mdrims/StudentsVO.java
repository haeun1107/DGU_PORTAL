package mdrims;

public class StudentsVO {
    private int id;
    private String name;
    private String major;
    private float avg_grade;
    private String email;
    private String state;
    private String extra;

    public int getId() {
        return this.id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major;
    }
    public float getAvg_grade() {
        return avg_grade;
    }
    public void setAvg_grade(float avg_grade) {
        this.avg_grade = avg_grade;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getExtra() {
        return extra;
    }
    public void setExtra(String extra) {
        this.extra = extra;
    }

    @Override
    public String toString() {
        return "StudentsVO {id=" + id +
                ", name='" + name + '\'' +
                ", major='" + major + '\'' +
                ", avg_grade=" + avg_grade +
                ", email='" + email + '\'' +
                ", state='" + state + '\'' +
                ", extra='" + extra + '\'' +
                '}';
    }
}
