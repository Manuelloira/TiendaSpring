package edu.loira.tienda.Tienda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.loira.tienda.Tienda.model.Cliente;
import edu.loira.tienda.Tienda.model.Producto;
import edu.loira.tienda.Tienda.model.enumerated.Categoria;
import edu.loira.tienda.Tienda.repositories.*;

@SpringBootApplication
public class TiendaApplication implements CommandLineRunner {


		@Autowired
		private IClientesRepository clienteRepo;
		@Autowired
		private IProductosRepository productoRepo;


	public static void main(String[] args) {
		SpringApplication.run(TiendaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		productoRepo.findByPrecioBetween(25.00, 50.00);
	}

}
