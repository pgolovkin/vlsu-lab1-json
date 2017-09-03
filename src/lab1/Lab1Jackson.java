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
        student.setDepartmentName("ИСПИ");
        student.setFirstName("Джон");
        student.setLastName("Смит");
        student.setPatronymicName("Иванович");
        student.setGroupName("ИСТм-117");

        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        String studentJson = mapper.writeValueAsString(student);
        System.out.println(studentJson);
        Student newStudent = mapper.readValue(studentJson, Student.class);
        System.out.println(newStudent.equals(student));
    }
}
