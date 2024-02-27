public class Estudiantes2 {
    private String nombre;
    private int edad;
    private double calificacion;

    // Método setGet para recibir y desplegar el valor de un atributo
    public <T> T setGet(String atributo, T valor) {
        switch (atributo) {
            case "nombre":
                System.out.println("Cambiando y desplegando nombre: " + valor);
                this.nombre = (String) valor;
                return (T) this.nombre;
            case "edad":
                System.out.println("Cambiando y desplegando edad: " + valor);
                this.edad = (int) valor;
                return (T) Integer.valueOf(this.edad);
            case "calificacion":
                System.out.println("Cambiando y desplegando calificación: " + valor);
                this.calificacion = (double) valor;
                return (T) Double.valueOf(this.calificacion);
            default:
                return null;
        }
    }

    public static void main(String[] args) {
        // Crear objeto Estudiante
        Estudiantes2 estudiante = new Estudiantes2();

        // Utilizar setGet para cambiar y desplegar el nombre
        String nuevoNombre = estudiante.setGet("nombre", "Juan");
        System.out.println("Nuevo Nombre: " + nuevoNombre);

        // Utilizar setGet para cambiar y desplegar la edad
        int nuevaEdad = estudiante.setGet("edad", 25);
        System.out.println("Nueva Edad: " + nuevaEdad);

        // Utilizar setGet para cambiar y desplegar la calificación
        double nuevaCalificacion = estudiante.setGet("calificacion", 8.5);
        System.out.println("Nueva Calificación: " + nuevaCalificacion);
    }
}