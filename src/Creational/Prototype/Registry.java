package Creational.Prototype;

import java.util.HashMap;

public class Registry {
    HashMap<String,Student> studentRegistry = new HashMap<>();

    Student getStudent(String type){
        return this.studentRegistry.get(type);
    }

    void addStudentType(String type, Student student){
        studentRegistry.put(type, student);
    }
}
