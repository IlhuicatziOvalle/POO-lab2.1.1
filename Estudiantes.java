public class Estudiantes {
    private String nombre;
    private int edad;
    private double calificacion;

    // Métodos set y get para el atributo 'nombre'
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    // Métodos set y get para el atributo 'edad'
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    // Métodos set y get para el atributo 'calificacion'
    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public static void main(String[] args) {
        // Crear objetos Estudiante
        Estudiantes estudiante1 = new Estudiantes();
        Estudiantes estudiante2 = new Estudiantes();
        Estudiantes estudiante3 = new Estudiantes();

        // Capturar datos mediante el método set
        estudiante1.setNombre("Juan");
        estudiante1.setEdad(20);
        estudiante1.setCalificacion(8.5);

        estudiante2.setNombre("María");
        estudiante2.setEdad(22);
        estudiante2.setCalificacion(9.0);

        estudiante3.setNombre("Pedro");
        estudiante3.setEdad(21);
        estudiante3.setCalificacion(7.8);

        // Desplegar datos con el método println y métodos get correspondientes
        System.out.println("Estudiante 1:");
        System.out.println("Nombre: " + estudiante1.getNombre());
        System.out.println("Edad: " + estudiante1.getEdad());
        System.out.println("Calificación: " + estudiante1.getCalificacion());
        System.out.println();

        System.out.println("Estudiante 2:");
        System.out.println("Nombre: " + estudiante2.getNombre());
        System.out.println("Edad: " + estudiante2.getEdad());
        System.out.println("Calificación: " + estudiante2.getCalificacion());
        System.out.println();

        System.out.println("Estudiante 3:");
        System.out.println("Nombre: " + estudiante3.getNombre());
        System.out.println("Edad: " + estudiante3.getEdad());
        System.out.println("Calificación: " + estudiante3.getCalificacion());
    }
}