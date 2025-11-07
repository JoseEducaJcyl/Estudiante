//Clase Estudiante con los atributos nombre, edad y nota
public class Estudiante {
    private String nombre;
    private int edad;
    private int nota;

    //Declaramos los constructores
    public Estudiante() {}

    public Estudiante(String nombre, int edad, int nota) {
        this.nombre = nombre;
        this.edad = edad;
        this.nota = nota;
    }

    //Declaracion de setters y getters
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

    //En setNota() se hace una restriccion para que la nota sea mayoro igual que 0
    //y menor o igual a 10
    public void setNota(int nota) {
        if(nota >= 0 && nota <= 10){
            this.nota = nota;
        }else {
            System.out.println("El nota debe ser mayor o igual a 10");
        }
    }

    //Metodo toString para mostrar los atributos
    @Override
    public String toString() {
        return "Estudiante{" +
                "Nombre='" + nombre + '\'' +
                ", Edad=" + edad +
                ", Nota=" + nota +
                '}';
    }
}
