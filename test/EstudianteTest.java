import static org.junit.jupiter.api.Assertions.*;

class EstudianteTest {

    @org.junit.jupiter.api.Test
    void getNota() {
        Estudiante estudiante = new Estudiante("Estudiante", 15, 9);
        estudiante.getNota();
        assertEquals(9, estudiante.getNota());
    }

    @org.junit.jupiter.api.Test
    void setNota() {
        Estudiante estudiante = new Estudiante("Estudiante", 15, 9);
        estudiante.setNota(7);
        assertEquals(7, estudiante.getNota());
    }
}