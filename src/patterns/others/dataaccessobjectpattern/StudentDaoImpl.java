package patterns.others.dataaccessobjectpattern;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {

    List<Student> students;

    public StudentDaoImpl() {
        students = new ArrayList<>();
        students.add(new Student(0, "Robert"));
        students.add(new Student(1, "John"));
    }

    @Override
    public List<Student> getAllStudents() {
        return students;
    }

    @Override
    public Student getStudent(int rollNo) {
        return students.get(rollNo);
    }

    @Override
    public void updateStudent(Student student) {
        students.get(student.getRollNo()).setName(student.getName());
        System.out.println("Student Roll No " + student.getRollNo() + ", updated in the database.");
    }

    @Override
    public void deleteStudent(Student student) {
        students.remove(student.getRollNo());
        System.out.println("Student Roll No " + student.getRollNo() + ", deleted from he database.");
    }
}
