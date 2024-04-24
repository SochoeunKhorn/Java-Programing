package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    // imperative vs declarative
    private static List<Student> students = List.of(
            new Student(1L,"Dara",'M',23),
            new Student(2L,"Thida",'M',23),
            new Student(3L,"Seyha",'F',23),
            new Student(4L,"Tola",'M',23),
            new Student(5L,"Cheata",'F',23),
            new Student(6L,"Pheak",'F',23),
            new Student(7L,"Van",'M',23),
            new Student(8L,"Dalin",'F',23),
            new Student(9L,"Mada",'M',23)
    );
    public static void main(String[] args) {
        List<Student> studentList = getStudents(students);
        for(Student st : studentList){
            System.out.println(st);
        }
    }
    public static List<Student> getStudents(List<Student> students){
        List<Student> list = new ArrayList<>();
        int counter = 0;
        int limit = 3;
        for(Student st : students){
            if(st.getGender() == 'F'){
                list.add(st);
                counter++;
            }
            if(counter == limit){
                break;
            }
        }
        return list;
    }
}