package edu.loira.tienda.Tienda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.loira.tienda.Tienda.model.Cliente;
import repositories.IClientesRepository;

@SpringBootApplication
public class TiendaApplication implements CommandLineRunner {

		@Autowired
		private IClientesRepository clienteRepo;

	public static void main(String[] args) {
		SpringApplication.run(TiendaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		clienteRepo.save(new Cliente( "Fermin", "Trujillo", "654321987", "trujillo@gmail.com", "admin"));
	}

}
