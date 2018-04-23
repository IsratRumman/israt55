package data.model;

public class Student {
    private String studentFirstName;
    private String studentLastName;
    private Integer studentAge;
    private String viewStudentInfo;

    public Student() {
    }

    public String getStudentFirstName() {
        return studentFirstName;
    }

    public void setStudentFirstName(String studentFirstName) {
        this.studentFirstName = studentFirstName;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }

    public Integer getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(Integer studentAge) {
        this.studentAge = studentAge;
    }

    public String getViewStudentInfo() {
        return viewStudentInfo;
    }

    public Student(String viewStudentInfo) {
        this.viewStudentInfo = viewStudentInfo;
    }
}