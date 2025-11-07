// Clase Main con el metodo main para ejecutar el codigo
public class Main {
    public static void main(String[] args) {
        //Declaramos dos objetos de la clase Estudiante, estudiante usando el constructor con sus atributos
        //y estudiante2 con un constructor vacio
        Estudiante estudiante = new Estudiante("nombre1",18,5);
        Estudiante estudiante2 = new Estudiante();
        //Declaramos los atributos del objeto estudiante2
        //Asegurandonos que funciona la restriccion en setNota()
        estudiante2.setNombre("nombre2");
        estudiante2.setEdad(25);
        estudiante2.setNota(-1);
        estudiante2.setNota(0);
        System.out.println(estudiante.toString());
        System.out.println(estudiante2.toString());
    }
}