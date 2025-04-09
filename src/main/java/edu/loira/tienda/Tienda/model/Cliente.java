package edu.loira.tienda.Tienda.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "clientes")

public class Cliente {
    @Id
@GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    
    private Long id_Cliente;
    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;
    @Column(name = "apellidos", nullable = false, length = 50)
    private String apellidos;
    
    @Column(name = "email", nullable = false, length = 250, unique = true)
    private String email;
    @Column(name = "telefono", nullable = false, length = 9)
    private String telefono;
    @Column(name = "password", nullable = false, length = 50)
    private String password;
    @OneToMany(mappedBy = "cliente", cascade = jakarta.persistence.CascadeType.ALL, fetch = jakarta.persistence.FetchType.EAGER) 
    // Relación uno a muchos con la entidad Factura
    private List<Factura> lista_facturas;

    public Cliente() {
    }

    public Cliente(String nombre, String apellidos, String telefono, String email, String password) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.email = email;
        this.password = password;
    }
    public Long getId_Cliente() {
        return id_Cliente;
    }
    public void setId_Cliente(Long id_Cliente) {
        this.id_Cliente = id_Cliente;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    @Override
    public String toString() {
        return "Cliente [id_Cliente=" + id_Cliente + ", nombre=" + nombre + ", apellidos=" + apellidos + ", telefono="
                + telefono + ", email=" + email + ", password=" + password + "]";
    }

    
}
