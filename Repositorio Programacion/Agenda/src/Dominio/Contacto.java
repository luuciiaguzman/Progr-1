package Dominio;

public class Contacto {
    private String nombre;
    private String apellidos;
    private String telefono;
    private String email;

    // Constructor de la clase
    public Contacto(String nombre, String apellidos, String telefono, String email) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.email = email;
    }

    // Métodos getter y setter
    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public Contacto setTelefono(String telefono) {
        this.telefono = telefono;
        return this;
    }


    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre: ").append(nombre).append(" ").append(apellidos)
                .append("\nTeléfono: ").append(telefono)
                .append("\nEmail: ").append(email);
        return sb.toString();
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contacto contacto = (Contacto) o;
        return nombre.equals(contacto.nombre) && apellidos.equals(contacto.apellidos);
    }
}

