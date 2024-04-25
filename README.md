# Functional Programing Java
## Imperative and Declarative
### Imperative ប្រើប្រាស់ For សម្រាប់ធ្វើការ loop​ of List
### Declarative ប្រើប្រាស់ Stream API សម្រាប់ធ្វើការ loop​ of List
- ✨example✨
```sh
class Student{
  private int id;
  private String name;
  private String gender;
  private int age;
  // Getter and Setter
  // Default Contructor and Constructor Parameter
  // toString()
}
```
```sh
List<Student> students = List.of{
  new Studnet(1,"Dara","M",22),
  new Studnet(1,"Cheata","F",24),
  new Studnet(1,"Pheaktra","F",21),
  new Studnet(1,"Sovath","M",25),
}
```
- ✨Imperative✨
```sh
private List<Student> getStudentFemale(List<Student> students)
{
  List<Student> list = new ArrayList<>();
  int counter = 0;
  int limit = 2;
  for(Student st : students){
    if(st.getGender() == "F")
      {
        list.add(st);
        counter++;
      }
    if(counter == limit)
      {
        break;
      }
  }
   return list; 
}
```
- ✨Declarative✨
```sh
public List<Student> getStudentsMale(List<Student> students) {
        return students.stream() // loop
                .filter(st -> st.getGender()=='M') // if gender == F
                .limit(2) // get only 3 elements
                .collect(Collectors.toList());
    }
```
- ✨Man✨
```sh
System.out.println("Imperative");
List<Student> listImperative = getStudentsImperative(students);
        for(Student st : listImperative){
            System.out.println(st);
        }
System.out.println("Declarative");
List<Student> listDeclarative = getStudentsDeclarative(students);
for(Student st : listDeclarative){
System.out.println(st);


```

