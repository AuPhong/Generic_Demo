package company;

import company.Model.Language;
import company.Model.Student;
import company.Service.Language.LanguageServiceIPLM;
import company.Service.Student.StudentServiceIPLM;

public class Main {
    public static void main(String[] args) {
        StudentServiceIPLM serviceIPLM = new StudentServiceIPLM();
//        Student student1 = new Student(1, "student1");
//        Student student2 = new Student(2, "student2");
//        Student student3 = new Student(3, "student3");
        serviceIPLM.save(new Student(1, "student1"));
        serviceIPLM.save(new Student(2, "student2"));
        serviceIPLM.save(new Student(3, "student3"));
        System.out.println(serviceIPLM.show());
        //System.out.println(StudentServiceIPLM.studentList);

        LanguageServiceIPLM languageServiceIPLM = new LanguageServiceIPLM();
        languageServiceIPLM.save(new Language(1,"Java"));
        languageServiceIPLM.save(new Language(2,"PHP"));
        System.out.println(languageServiceIPLM.show());
        //System.out.println(LanguageServiceIPLM.languageList);
    }
}
