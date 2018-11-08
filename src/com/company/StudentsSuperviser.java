package com.company;

public class StudentsSuperviser {


    //Create a class StudentsSuperviser which has a static list of students and a static
    // variable studentsLength which is increased each time a new student is added in StudentsSuperviser's students list.

    //In main method (`starting point of the Java application`) start creating a list of students of 3 elements

    // and after that assign that list to StudentsSuperviser's students state (attribute / property).

    //Add two new Students to that list and then print StudentsSuperviser's studentsLength
    // in order to see if it prints correctly the length of students list. (Which should be 5).

    //Student class has name and age (of String and int data types)


    static Student[]students;
    static int studentsLength;

    static void addstudent(Student student){
        students[studentsLength]=student;
        studentsLength++;

    }

}








