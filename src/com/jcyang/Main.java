package com.jcyang;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        String repeatSwitch="";
        String searchQuery="";
        Scanner keyboard = new Scanner(System.in);
        String choice;
        ArrayList<Person> addressBook = new ArrayList<Person>();
ArrayList<Student> studentList = new ArrayList<Student>();
        ArrayList<Teacher> teacherList = new ArrayList<Teacher>();

        while(!repeatSwitch.equalsIgnoreCase("Quit")) {
            System.out.println("Enter new (s)tudent details: ");
            System.out.println("Add new (t)eacher details: ");
            System.out.println("Add (c)ourse to student: ");
            System.out.println("Add c(o)urse to teacher: ");
            System.out.println("Find courses taken by st(u)dent: ");
            System.out.println("Find courses taught by te(a)cher: ");
            choice= keyboard.nextLine();

            /***** Enter new (s)tudent details *****/
            if(choice.equalsIgnoreCase("s")) {
                Student person = new Student();
                System.out.println("Enter first name: ");

                person.setFirstName(keyboard.nextLine());
                System.out.println("Enter last name: ");
                person.setLastName(keyboard.nextLine());
                System.out.println("Enter address: ");
               person.setAddress(keyboard.nextLine());
                System.out.println("Enter phone number: ");
                person.setPhoneNumber(keyboard.nextLine());
                System.out.println("Enter email: ");
                person.setEmail(keyboard.nextLine());
                addressBook.add(person);
                studentList.add(person);
            }
            /***** Enter new (s)tudent details *****/

            /***** Enter new (t)eacher details *****/
            if(choice.equalsIgnoreCase("t")) {
                Teacher person = new Teacher();
                System.out.println("Enter first name: ");

               person.setFirstName(keyboard.nextLine());
                System.out.println("Enter last name: ");
                person.setLastName(keyboard.nextLine());
                System.out.println("Enter address: ");
               person.setAddress(keyboard.nextLine());
                System.out.println("Enter phone number: ");
               person.setPhoneNumber(keyboard.nextLine());
                System.out.println("Enter email: ");
                person.setEmail(keyboard.nextLine());
                addressBook.add(person);
                teacherList.add(person);
            }
            /***** Enter new (t)eacher details *****/

            /****"Add (c)ourse to student: "****/

            if (choice.equalsIgnoreCase("c")){
                System.out.println("Enter student's first name  ");
                searchQuery= keyboard.nextLine();
                boolean foundResult=false;


                for (Student entry : studentList) {
                    if (entry.getFirstName().equalsIgnoreCase(searchQuery)) {
                        System.out.print(entry.getFirstName());
                        System.out.print(" ");
                        System.out.print(entry.getLastName());
                        System.out.println();
                        System.out.println("Enter course for student to take: ");
                        String courseName=keyboard.nextLine();
                        Course course = new Course();
                        course.setName(courseName);
                        entry.getCoursesTaken().add(course);
                        System.out.print(entry.getFirstName());
                        System.out.print(" ");
                        System.out.print(entry.getLastName());
                        System.out.println();
                        for (Course c: entry.getCoursesTaken()){
                            System.out.println(c.getName());
                        }
                        foundResult= true;
                    }

                }
                if (foundResult==false){
                    System.out.println("No results matching search");
                }
            }

            /*******"Add (c)ourse to student: "*****/

            /****"Add c(o)urse to teacher: "****/

            if (choice.equalsIgnoreCase("o")){
                System.out.println("Enter teacher's first name  ");
                searchQuery= keyboard.nextLine();
                boolean foundResult=false;


                for (Teacher entry : teacherList) {
                    if (entry.getFirstName().equalsIgnoreCase(searchQuery)) {
                        System.out.print(entry.getFirstName());
                        System.out.print(" ");
                        System.out.print(entry.getLastName());
                        System.out.println();
                        System.out.println("Enter course for teacher to teach: ");
                        String courseName=keyboard.nextLine();
                        Course course = new Course();
                        course.setName(courseName);
                        entry.getCoursesTaught().add(course);
                        System.out.print(entry.getFirstName());
                        System.out.print(" ");
                        System.out.print(entry.getLastName());
                        System.out.println();
                        for (Course c: entry.getCoursesTaught()){
                            System.out.println(c.getName());
                        }
                        foundResult= true;
                    }

                }
                if (foundResult==false){
                    System.out.println("No results matching search");
                }
            }

            /*******"Add c(o)urse to teacher: "*****/


            /****"Find courses taken by student: "****/
if (choice.equalsIgnoreCase("u")) {
    System.out.println("Enter first name to search: ");
    searchQuery = keyboard.nextLine();
    boolean foundResult = false;


    for (Student entry : studentList) {
        if (entry.getFirstName().equalsIgnoreCase(searchQuery)) {
            System.out.print(entry.getFirstName());
            System.out.print(" ");
            System.out.print(entry.getLastName());
            System.out.println();
            for (Course c : entry.getCoursesTaken()) {
                System.out.println(c.getName());
            }
            foundResult = true;
        }

    }
    if (foundResult == false) {
        System.out.println("No results matching search");
    }
}



            /*******"Find courses taken by student "*****/
            System.out.println("Would you like to continue? Enter any key to continue or 'quit' to exit");
            repeatSwitch = keyboard.nextLine();


        }



//        for (Person entry : addressBook) {
//            System.out.println("First Name: " + entry.getFirstName());
//            System.out.println("Last Name: " + entry.getLastName());
//            System.out.println("Address: " + entry.getAddress());
//            System.out.println("Phone number: " + entry.getPhoneNumber());
//            System.out.println("Email: " + entry.getEmail());
//        }


        //search
//        System.out.println("Enter first name to search: ");
//        searchQuery= keyboard.nextLine();
//        boolean foundResult=false;
//
//
//        for (Person entry : addressBook) {
//            if (entry.getFirstName().equalsIgnoreCase(searchQuery)) {
//                System.out.println("First Name: " + entry.getFirstName());
//                System.out.println("Last Name: " + entry.getLastName());
//                foundResult= true;
//            }
//
//        }
//        if (foundResult==false){
//            System.out.println("No results matching search");
//        }
    }
}