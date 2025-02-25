package aulaVirtual;

import org.junit.Test;

import static org.junit.Assert.*;
public class AlumnoTest {

    @Test
    public void testObtenerNotaExistente() {
        Alumno alumno = new Alumno("Juan", "juan@example.com");
        Asignatura asignatura = new Asignatura("Matemáticas");
        alumno.inscribirAsignatura(asignatura);
        asignatura.agreagarAlumno(alumno);
        alumno.asignarNota(asignatura, 80);
        assertEquals(80, alumno.obtenerNota(asignatura));
    }

    @Test
    public void testObtenerNotaNoExistente() {
        Alumno alumno = new Alumno("Juan", "juan@example.com");
        Asignatura asignatura = new Asignatura("Matemáticas");
        assertEquals(-1, alumno.obtenerNota(asignatura));
    }
}