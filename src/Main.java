//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Estudiante e = new Estudiante("Estudiante", 0, 15);
        Estudiante e2 = new Estudiante("Unai", 18, 9);

        System.out.println(e2.getNombre() + " " + e2.getEdad() + " " + e2.getNota());
    }
}