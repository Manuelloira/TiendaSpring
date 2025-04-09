package edu.loira.tienda.Tienda.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.loira.tienda.Tienda.model.Factura;

public interface IFacturasRepository extends JpaRepository <Factura, Long> {
    // Aquí usamos JPA para realizar operaciones con la base de datos
    //No es necesario implementar los metodos, ya que JPA lo hace por nosotros
    // Los métodos que se pueden usar son los que vienen por defecto en la interfaz JpaRepository
    // por ejemplo, métodos para guardar, buscar, eliminar clientes, etc.

}
