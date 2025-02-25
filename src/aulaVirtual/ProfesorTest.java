package aulaVirtual;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProfesorTest {
    @Test
    public void testCalificarAlumnoCorrecto() {
        Profesor profesor = new Profesor("Pedro", "pedro@example.com");
        Alumno alumno = new Alumno("Juan", "juan@example.com");
        Asignatura asignatura = new Asignatura("Matemáticas");
        profesor.inscribirAsignatura(asignatura);
        alumno.inscribirAsignatura(asignatura);
        asignatura.agreagarAlumno(alumno);
        assertTrue(profesor.calificarAlumno(alumno, asignatura, 80));
        assertEquals(80, alumno.obtenerNota(asignatura));
    }

    @Test
    public void testCalificarAlumnoIncorrecto() {
        Profesor profesor = new Profesor("Pedro", "pedro@example.com");
        Alumno alumno = new Alumno("Juan", "juan@example.com");
        Asignatura asignatura = new Asignatura("Matemáticas");
        alumno.inscribirAsignatura(asignatura);
        asignatura.agreagarAlumno(alumno);
        assertFalse(profesor.calificarAlumno(alumno, asignatura, 80));
        assertEquals(-1, alumno.obtenerNota(asignatura));
    }
}
