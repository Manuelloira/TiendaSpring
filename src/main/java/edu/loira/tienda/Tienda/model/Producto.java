package edu.loira.tienda.Tienda.model;

import java.util.List;

import edu.loira.tienda.Tienda.model.enumerated.Categoria;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "productos")
public class Producto {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id_Producto;

    @Column(name = "nombre", nullable = false, length = 150)
    private String nombre;

    @Enumerated(EnumType.STRING)
    @Column(name = "categoria", nullable = false, columnDefinition = "ENUM('HOMBRE', 'MUJER', 'INFANTIL')")
    private Categoria categoria;

    @Column(name = "descripcion", nullable = false, length = 250)
    private String descripcion;

    @Column(name = "precio", nullable = false)
    private double precio;
        @OneToMany(mappedBy = "producto", cascade = jakarta.persistence.CascadeType.ALL, fetch = jakarta.persistence.FetchType.EAGER) 
    // Relación uno a muchos con la entidad Factura
    private List<Factura> lista_facturas;

    @Override
    public String toString() {
        return "Producto [id_Producto=" + id_Producto + ", nombre=" + nombre + ", categoria=" + categoria
                + ", descripcion=" + descripcion + ", precio=" + precio + "]";
    }

    public Long getId_Producto() {
        return id_Producto;
    }

    public void setId_Producto(Long id_Producto) {
        this.id_Producto = id_Producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Producto() {
    }
    public Producto(String nombre, Categoria categoria, String descripcion, double precio) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.descripcion = descripcion;
        this.precio = precio;
    }



}
