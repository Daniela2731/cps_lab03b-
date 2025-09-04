package pe.edu.tecsup.lab03.controllers;

import pe.edu.tecsup.lab03.entities.StudentEntity;
import pe.edu.tecsup.lab03.services.StudentService;

public class StudentController {

    private StudentService studentService;

    // Constructor
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    // Método para registrar un estudiante
    public void registerStudent(StudentEntity student) {
        if (studentService.isValidStudent(student)) {
            studentService.saveStudent(student);
            System.out.println("Estudiante registrado correctamente: " + student.getName());
        } else {
            System.out.println("Datos del estudiante no válidos.");
        }
    }

    // Método para mostrar datos de un estudiante
    public void showStudent(StudentEntity student) {
        System.out.println("ID: " + student.getId());
        System.out.println("Nombre: " + student.getName());
        System.out.println("Edad: " + student.getAge());
    }
}
