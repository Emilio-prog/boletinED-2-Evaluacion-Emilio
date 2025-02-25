package aulaVirtual;

/**
 * Representa a un profesor del aula virtual.
 * Un profesor puede impartir varias asignaturas.
 */
public class Profesor extends Usuario {
    /**
     * Constructor de la clase Profesor.
     *
     * @param nombre El nombre del profesor.
     * @param email  El correo electrónico del profesor.
     */
    public Profesor(String nombre, String email) {
        super(nombre, email);
    }

    /**
     * Califica a un alumno en una asignatura.
     *
     * @param alumno     El alumno.
     * @param asignatura La asignatura.
     * @param nota       La nota.
     * @return true si el profesor imparte la asignatura, false en caso contrario.
     */
    public boolean calificarAlumno(Alumno alumno, Asignatura asignatura, int nota) {
        if (getAsignaturas().contains(asignatura)) {
            alumno.asignarNota(asignatura, nota);
            System.out.println("Nota asignada a " + alumno.getNombre() + " en " + asignatura.getNombre() + ": " + nota);
            return true;
        } else {
            System.out.println("El profesor no imparte esta asignatura.");
            return false;
        }
    }
}
