package pe.edu.tecsup.lab03.repositories;

import pe.edu.tecsup.lab03.entities.StudentEntity;
import java.util.HashMap;
import java.util.Map;

public class StudentRepository {

    private Map<Integer, StudentEntity> database = new HashMap<>();

    // Guardar estudiante
    public void save(StudentEntity student) {
        database.put(student.getId(), student);
        System.out.println("Estudiante guardado: " + student.getName());
    }

    // Actualizar estudiante
    public void update(StudentEntity student) {
        if (database.containsKey(student.getId())) {
            database.put(student.getId(), student);
            System.out.println("Estudiante actualizado: " + student.getName());
        } else {
            System.out.println("Estudiante no encontrado: " + student.getId());
        }
    }

    // Buscar estudiante por ID
    public StudentEntity findById(int id) {
        return database.get(id);
    }
}
