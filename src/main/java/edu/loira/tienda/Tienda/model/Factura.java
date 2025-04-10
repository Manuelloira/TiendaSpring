package edu.loira.tienda.Tienda.model;

import java.time.LocalDate;

import edu.loira.tienda.Tienda.model.enumerated.ModoPago;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "facturas")
public class Factura {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id_Factura;
    @ManyToOne
    // Relación muchos a uno con la entidad Cliente
    // Se utiliza el atributo "mappedBy" para indicar que la relación es bidireccional
    @JoinColumn(name = "id_cliente", referencedColumnName = "id_cliente")
    // Se utiliza la anotación JoinColumn para especificar la columna de unión
    private Cliente cliente;
   @ManyToOne
    // Relación muchos a uno con la entidad Producto
    @JoinColumn(name = "id_producto", referencedColumnName = "id_producto")
    private Producto producto;
    @Column(name = "cantidad", nullable = false)
    private int cantidad;
    @Column(name = "fecha", nullable = false)
    private LocalDate fecha;
    @Enumerated(EnumType.STRING)
    @Column(name = "modo_pago", nullable = false, columnDefinition = "ENUM('EFECTIVO', 'TARJETA', 'TRANSFERENCIA', 'BIZUM')")
    private ModoPago modoPago;
    public Long getId_Factura() {
        return id_Factura;
    }
    public void setId_Factura(Long id_Factura) {
        this.id_Factura = id_Factura;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Producto getProducto() {
        return producto;
    }
    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    public ModoPago getModoPago() {
        return modoPago;
    }
    public void setModoPago(ModoPago modoPago) {
        this.modoPago = modoPago;
    }
    @Override
    public String toString() {
        return "Factura [id_Factura=" + id_Factura + ", cliente=" + cliente + ", producto=" + producto + ", cantidad="
                + cantidad + ", fecha=" + fecha + ", modoPago=" + modoPago + "]";
    }
}
