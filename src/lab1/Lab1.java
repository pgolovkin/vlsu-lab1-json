package lab1;

import com.google.gson.Gson;

import java.time.LocalDate;
import java.time.Month;

public class Lab1 {

    public static void main(String[] args) {
        Student student = new Student();
        student.setBirthDate(LocalDate.of(1989, Month.MAY, 3));
        student.setDepartmentName("ИСПИ");
        student.setFirstName("Джон");
        student.setLastName("Смит");
        student.setPatronymicName("Иванович");
        student.setGroupName("ИСТм-117");

        Gson gson = new Gson();
        String studentJson = gson.toJson(student);
        System.out.println(studentJson);
    }
}
