package lab1;

import com.google.gson.Gson;

import java.time.LocalDate;
import java.time.Month;

public class Lab1 {

    public static void main(String[] args) {
        Student student = new Student();
        student.setBirthDate(LocalDate.of(1989, Month.MAY, 3));
        Department department = new Department();
        department.setDepartmentName("ИСПИ");
        student.setDepartment(department);
        student.setFirstName("Джон");
        student.setLastName("Смит");
        student.setPatronymicName("Иванович");
        Group group = new Group();
        group.setGroupName("ИСТм-117");
        group.setStudentsCount(18);
        student.setGroup(group);

        Gson gson = new Gson();
        String studentJson = gson.toJson(student);
        System.out.println(studentJson);
        Student newStudent = gson.fromJson(studentJson, Student.class);
        System.out.println(newStudent.equals(student));
    }
}
