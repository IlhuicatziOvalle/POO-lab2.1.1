class Estudiantes {
    private String nombre;
    private int edad;
    private double calificacion;

    public String setGetNombre(String nom) {
        nombre = nom;
        return nombre;
    }

    // Método setGet para el atributo 'edad'
    public int setGetEdad(int ed) {
        edad = ed;
        return edad;
    }

    // Método setGet para el atributo 'calificacion'
    public double setGetCalificacion(double calif) {
        calificacion = calif;
        return calificacion;
    }
}

public class Estudiantes2 {
    public static void main(String[] args) {
        // Crear objetos Estudiante
        Estudiantes est1 = new Estudiantes();
        Estudiantes est2 = new Estudiantes();
        Estudiantes est3 = new Estudiantes();

        // Desplegar datos utilizando setGet
        System.out.println("Estudiante 1:");
        System.out.println(est1.setGetNombre("Juan"));
        System.out.println(est1.setGetEdad(20));
        System.out.println(est1.setGetCalificacion(8.5));
        System.out.println();

        System.out.println("Estudiante 2:");
        System.out.println(est2.setGetNombre("Maria"));
        System.out.println(est2.setGetEdad(22));
        System.out.println(est2.setGetCalificacion(9.0));
        System.out.println();

        System.out.println("Estudiante 3:");
        System.out.println(est3.setGetNombre("Pedro"));
        System.out.println(est3.setGetEdad(21));
        System.out.println(est3.setGetCalificacion(7.8));
    }
}
