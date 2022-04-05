package company.Service.Student;

import company.Model.Student;

import java.util.Comparator;

public class CompareStudent implements Comparator<Student> {


    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
