package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
        System.out.println("Imperative");
        List<Student> listImperative = getStudentsImperative(students);
        for(Student st : listImperative){
            System.out.println(st);
        }
        System.out.println("Declarative");
        List<Student> listDeclarative = getStudentsDeclarative(students);
        /*for(Student st : listDeclarative){
            System.out.println(st);
        }*/
        listDeclarative.forEach(System.out::println); // method reference
    }
    // imperative style
    public static List<Student> getStudentsImperative(List<Student> students){
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

    // declarative style
    public static List<Student> getStudentsDeclarative(List<Student> students) {
        return students.stream() // loop
                .filter(st -> st.getGender()=='F') // if gender == F
                .limit(3) // get only 3 elements
                .collect(Collectors.toList());
    }
}