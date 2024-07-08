package org.example;

public class Student {

    private int stuid ;
    private String stuname;
    private String dept;

    public Student(int stuid, String stuname, String dept) {
        this.stuid = stuid;
        this.stuname = stuname;
        this.dept = dept;
    }

    public int getStuid() {
        return stuid;
    }

    public void setStuid(int stuid) {
        this.stuid = stuid;
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuid=" + stuid +
                ", stuname='" + stuname + '\'' +
                ", dept='" + dept + '\'' +
                '}';
    }
}
