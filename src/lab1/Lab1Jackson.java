package lab1;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.IOException;
import java.time.LocalDate;
import java.time.Month;

public class Lab1Jackson {

    public static void main(String[] args) throws IOException {
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

        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        String studentJson = mapper.writeValueAsString(student);
        System.out.println(studentJson);
        Student newStudent = mapper.readValue(studentJson, Student.class);
        System.out.println(newStudent.equals(student));
    }
}
