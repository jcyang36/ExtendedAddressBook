package com.jcyang;

import java.util.ArrayList;

public class Student extends Person {
    private ArrayList<Course> coursesTaken;

    public ArrayList<Course> getCoursesTaken() {
        return coursesTaken;
    }

    public void setCoursesTaken(ArrayList<Course> coursesTaken) {
        this.coursesTaken = coursesTaken;
    }


    public Student(){
        coursesTaken=new ArrayList<Course>();
    }


    public void addCourse(Course aCourse)
    {
        coursesTaken.add(aCourse);
    }
}
