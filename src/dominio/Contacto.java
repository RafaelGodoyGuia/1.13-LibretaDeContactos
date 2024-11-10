package dominio;

public class Contacto {
    private String nombre;
    private String apellidos;
    private String telefono;
    private String email;

    public Contacto setNombre (String nombre) {
        this.nombre = nombre;
        return (this);
    }

    public Contacto setApellidos (String apellidos) {
        this.apellidos = apellidos;
        return (this);
    }

    public Contacto setTelefono (String telefono) {
        this.telefono = telefono;
        return (this);
    }

    public Contacto setEmail (String email) {
        this.telefono = telefono;
        return (this);
    }

    public String getNombre () {
        return (this.nombre);
    }

    public String getApellidos () {
        return (this.apellidos);
    }

    public String getTelefono () {
        return (this.telefono);
    }

    public String getEmail () {
        return (this.email);
    }

    @Override
    public String toString () {
        StringBuilder sb = new StringBuilder();
        sb.append(this.nombre).append(" ").append(this.apellidos).append("\n").append(this.telefono).append("\n").append(this.email);
        return (sb.toString());
    }
}
