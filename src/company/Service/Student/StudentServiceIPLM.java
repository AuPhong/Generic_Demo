package company.Service.Student;

import company.Model.Student;

import java.util.ArrayList;
import java.util.List;


public class StudentServiceIPLM implements StudentService {
    public static List<Student> studentList = new ArrayList<>();
//    static {
//        studentList.add(new Student(0,"student0"));
//    }
    @Override
    public void save(Student student) {
        studentList.add(student);
    }

    @Override
    public void deleteById(int id) {
        studentList.remove(id);
    }

    @Override
    public List<Student> show() {
        return studentList;
    }


}
