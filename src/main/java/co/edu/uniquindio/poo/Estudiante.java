package co.edu.uniquindio.poo;

public class Estudiante {

    /***
    *String numero de identificacion
    *String nombre 
    *String apellidos
    *int telefono validar double
    *int edad
    *String correo
     */
    public static String identificacion;
    public static String nombre;
    public static String apellidos;
    public static String telefono;
    public static int edad;
    public static String correo;

    /**
     * @param identificacion
     * @param nombre
     * @param apellidos
     * @param telefono
     * @param edad
     * @param correo
     */
    public Estudiante(String identificacion, String nombre, String apellidos, String telefono, int edad, String correo){

        this.identificacion = identificacion;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.telefono = telefono;
        this.edad = edad;

    }


    public static String getIdentificacion() {
        return identificacion;
    }



    public static void setIdentificacion(String identificacion) {
        Estudiante.identificacion = identificacion;
    }



    public static String getNombre() {
        return nombre;
    }



    public static void setNombre(String nombre) {
        Estudiante.nombre = nombre;
    }



    public static String getApellidos() {
        return apellidos;
    }



    public static void setApellidos(String apellidos) {
        Estudiante.apellidos = apellidos;
    }



    public static String getTelefono() {
        return telefono;
    }



    public static void setTelefono(String telefono) {
        Estudiante.telefono = telefono;
    }



    public static int getEdad() {
        return edad;
    }



    public static void setEdad(int edad) {
        Estudiante.edad = edad;
    }



    public static String getCorreo() {
        return correo;
    }



    public static void setCorreo(String correo) {
        Estudiante.correo = correo;
    }



    @Override
    public String toString() {
        return "Los datos del Estudiante" + " identificacion: "+identificacion+" Nombre y apellido: "+nombre+" "+apellidos;
    }

    
}
