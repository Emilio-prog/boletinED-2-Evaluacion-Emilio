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

    /**
     * Constructor de la clase Asignatura.
     *
     * @param nombre El nombre de la asignatura.
     */
    public Asignatura(String nombre) {
        this.nombre = nombre;
        this.profesor = null;
        this.alumnos = new ArrayList<>();
    }

    /**
     * Obtiene el nombre de la asignatura.
     *
     * @return El nombre de la asignatura.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el profesor de la asignatura.
     *
     * @return El profesor de la asignatura.
     */
    public Profesor getProfesor() {
        return profesor;
    }

    /**
     * Agrega un alumno a la asignatura.
     *
     * @param alumno El alumno.
     */
    public void agreagarAlumno(Alumno alumno) {
        alumnos.add(alumno);
    }

    /**
     * Elimina un alumno de la asignatura.
     *
     * @param alumno El alumno.
     */
    public void eliminarAlumno(Alumno alumno) {
        for (Alumno a : this.alumnos) {
            if (a.getNombre().equals(alumno.nombre)) alumnos.remove(a);
        }
    }

    /**
     * Imprime los datos de los alumnos inscritos en la asignatura.
     */
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

    /**
     * Obtiene la lista de alumnos inscritos en la asignatura.
     *
     * @return La lista de alumnos.
     */
    public List<Alumno> getAlumnos() {
        return alumnos;
    }
}
