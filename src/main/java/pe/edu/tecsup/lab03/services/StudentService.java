package pe.edu.tecsup.lab03.services;

import pe.edu.tecsup.lab03.entities.StudentEntity;
import pe.edu.tecsup.lab03.repositories.StudentRepository;

public class StudentService {

    private StudentRepository studentRepository;

    // Constructor
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    // Validar estudiante antes de guardarlo
    public boolean isValidStudent(StudentEntity student) {
        return student.getName() != null && !student.getName().isEmpty()
                && student.getAge() > 0;
    }

    // Guardar estudiante
    public void saveStudent(StudentEntity student) {
        studentRepository.save(student);
    }

    // Actualizar estudiante
    public void updateStudent(StudentEntity student) {
        studentRepository.update(student);
    }
}
