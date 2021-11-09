package com.company.TeachersAndStudents;

public class TeacherStudent {
    public static void main(String[] args) {
    /*Create Student and Teacher classes
    Student
    learn() -> prints: the student is actually learning
    question(teacher) -> calls the teacher's giveAnswer() method
    Teacher
    teach(student) -> calls the student's learn() method
    giveAnswer() -> prints: the teacher is answering a question
    Instantiate a Student and Teacher object
    Call the student's question() method and the teacher's teach() method*/

        Student student1 = new Student("Jane");

        Teacher teacher1 = new Teacher ("Mr. Smith");

        student1.question(teacher1);

        teacher1.teach(student1);
    }
}
