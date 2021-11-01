package day01;

public class School {
    public static void main(String[] args) {
        Students students = new Students();
        for (int i = 150; i < 160; i++){
            students.addHeight(i);
        }
        System.out.println(students.isHeightsIncreasing());

        Students studentsTwo = new Students();
        for (int i = 160; i > 150; i--){
            studentsTwo.addHeight(i);
        }
        System.out.println(studentsTwo.isHeightsIncreasing());
    }
}
