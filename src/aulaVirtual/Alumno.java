package aulaVirtual;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Representa a un alumno del aula virtual.
 * Un alumno puede estar inscrito en varias asignaturas.
 */
public class Alumno extends Usuario {

    private Map<Asignatura, Integer> notas;

    /**
     * Constructor de la clase Alumno.
     *
     * @param nombre El nombre del alumno.
     * @param email  El correo electrónico del alumno.
     */
    public Alumno(String nombre, String email) {
        super(nombre, email);
        this.notas = new HashMap<>();
    }

    /**
     * Obtiene las notas del alumno.
     *
     * @return Las notas del alumno.
     */
    public Map<Asignatura, Integer> getNotas() {
        return new HashMap<>(notas);
    }

    /**
     * Asigna una nota al alumno en una asignatura.
     *
     * @param asignatura La asignatura.
     * @param nota       La nota.
     */
    protected void asignarNota(Asignatura asignatura, int nota) {
        if (getAsignaturas().contains(asignatura)) {
            notas.put(asignatura, nota);
        } else {
            System.out.println("El alumno no está inscrito en esta asignatura.");
        }
    }

    /**
     * Muestra las notas del alumno.
     */
    public void mostrarNotas() {
        System.out.println("Notas del alumno " + nombre + ":");
        for (Map.Entry<Asignatura, Integer> entry : notas.entrySet()) {
            System.out.println(entry.getKey().getNombre() + ": " + entry.getValue());
        }
    }

    /**
     * Obtiene la nota del alumno en una asignatura.
     *
     * @param asignatura La asignatura.
     * @return La nota del alumno en la asignatura, o -1 si el alumno no está inscrito en la asignatura.
     */
    public int obtenerNota(Asignatura asignatura) {
        return notas.getOrDefault(asignatura, -1);
    }
}