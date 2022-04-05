package company;

import company.Model.Language;
import company.Model.Student;
import company.Service.Language.LanguageServiceIPLM;
import company.Service.Student.CompareStudent;
import company.Service.Student.StudentServiceIPLM;

import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        StudentServiceIPLM serviceIPLM = new StudentServiceIPLM();
//        Student student1 = new Student(1, "student1");
//        Student student2 = new Student(2, "student2");
//        Student student3 = new Student(3, "student3");
        serviceIPLM.save(new Student(1, "bfwef"));
        serviceIPLM.save(new Student(2, "aervre"));
        serviceIPLM.save(new Student(3, "cgerg"));
        System.out.println(serviceIPLM.show());
        //CompareStudent compareStudent = new CompareStudent();
        Comparator comparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        Collections.sort(serviceIPLM.show(),comparator);
        System.out.println(serviceIPLM.show());
        //System.out.println(StudentServiceIPLM.studentList);

        LanguageServiceIPLM languageServiceIPLM = new LanguageServiceIPLM();
        languageServiceIPLM.save(new Language(1,"Java"));
        languageServiceIPLM.save(new Language(2,"PHP"));
        //System.out.println(languageServiceIPLM.show());
        //System.out.println(LanguageServiceIPLM.languageList);

    }



}
