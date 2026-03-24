package com.prueba.demo;
import java.util.Arrays;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		Producto p1 = new Producto("Aceite", 10);
		Producto p2 = new Producto("Filtro", 5);

		Sucursal s1 = new Sucursal("Sucursal Medellín", Arrays.asList(p1, p2));

		Franquicia f = new Franquicia("Mi Franquicia", Arrays.asList(s1));

		System.out.println(f.getNombre());
	}

}
