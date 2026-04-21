public class Estudiante {
    private String nombre;
    private int edad;
    private int nota;
    // Creamos un constructor
    public Estudiante(String nombre, int edad, int nota) {
        // Si la nota es menor que 0 o que 10, sale un print que la nota debe ser de 0 a 10
        if (nota < 0 || nota > 10){
            System.out.println("La nota debe ser de 0 a 10");
            return;
        }

        this.nombre = nombre;
        this.edad = edad;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNota() {
        return nota;
    }

    // Tambien comprobamos si la nota es correcta
    public void setNota(int nota) {
        if (nota >= 0 && nota <= 10) {
            this.nota = nota;
        }
    }
}
