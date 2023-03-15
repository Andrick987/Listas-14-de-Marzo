
package Modelos;

public class Clientes {
    String apellidos;
    String nombres;

    public Clientes(String apellidos, String nombres) {
        this.apellidos = apellidos;
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
}
