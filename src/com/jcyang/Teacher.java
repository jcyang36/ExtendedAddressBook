package com.jcyang;

import java.util.ArrayList;

public class Teacher extends Person {

    private ArrayList<Course> coursesTaught;


    public Teacher(){
        coursesTaught= new ArrayList<>();
    }
    public ArrayList<Course> getCoursesTaught() {
        return coursesTaught;
    }

    public void setCoursesTaught(ArrayList<Course> coursesTaught) {
        this.coursesTaught = coursesTaught;
    }

    public void addCourse(Course aCourse)
    {
        coursesTaught.add(aCourse);
    }
}
