package aulaVirtual;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa un usuario genérico en el aula virtual.
 * Puede ser un Alumno o un Profesor.
 *
 * @author Javier Barceló
 * @version 0.1
 */
public class Usuario {
    protected String nombre;
    protected String email;
    private List<Asignatura> asignaturas;

    /**
     * Constructor de la clase Usuario.
     *
     * @param nombre El nombre del usuario.
     * @param email  El correo electrónico del usuario.
     */
    public Usuario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
        this.asignaturas = new ArrayList<>();
    }

    /**
     * Obtiene las asignaturas en las que está inscrito el usuario.
     *
     * @return Las asignaturas del usuario.
     */
    public List<Asignatura> getAsignaturas() {
        return new ArrayList<>(asignaturas);
    }

    /**
     * Inscribe al usuario en una asignatura.
     *
     * @param asignatura La asignatura.
     */
    public void inscribirAsignatura(Asignatura asignatura) {
        asignaturas.add(asignatura);
    }

    /**
     * Obtiene el nombre del usuario.
     *
     * @return El nombre del usuario.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el correo electrónico del usuario.
     *
     * @return El correo electrónico del usuario.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Simula el inicio de sesión del usuario.
     *
     * @param password La contraseña.
     * @return true si la contraseña es correcta, false en caso contrario.
     */
    public boolean iniciarSesión(String password) {
        // simula la consulta a la base de datos de las credenciales del usuario
        int hash = password.hashCode();
        return true;
    }
}