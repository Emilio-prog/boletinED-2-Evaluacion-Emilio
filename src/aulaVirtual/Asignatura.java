package aulaVirtual;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa una asignatura en el aula virtual.
 * Una asignatura tiene un nombre y un profesor encargado.
 */
public class Asignatura {
    private String nombre;
    private Profesor profesor;
    private List<Alumno> alumnos;

    public Asignatura(String nombre) {
        this.nombre = nombre;
        this.profesor = null;
        this.alumnos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void agreagarAlumno(Alumno alumno) {
        alumnos.add(alumno);
    }

    public void eliminarAlumno(Alumno alumno) {
        for (Alumno a: this.alumnos) {
            if (a.getNombre().equals(alumno.nombre)) alumnos.remove(a);
        }
    }

    // Nuevo metodo para obtener la lista de alumnos
    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void imprimirDatosAlumnos() {
        if (alumnos.isEmpty()) {
            System.out.println("No hay alumnos inscritos en esta asignatura.");
        } else {
            System.out.println("Alumnos inscritos en " + nombre + ":");
            for (Alumno alumno : alumnos) {
                System.out.println("- " + alumno.getNombre() + " (" + alumno.getEmail() + ")");
            }
        }
    }
}
