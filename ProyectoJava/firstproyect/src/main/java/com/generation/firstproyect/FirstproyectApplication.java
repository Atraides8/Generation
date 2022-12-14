package com.generation.firstproyect;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.generation.firstproyect.models.Crema_corporal;
import com.generation.firstproyect.models.Persona;
import com.generation.firstproyect.models.Shampoo;

import java.io.Console;
import java.util.ArrayList;

@SpringBootApplication
public class FirstproyectApplication {

	public static void main(String[] args) {

		Console console = System.console();

		/* Persona persona1 = new Persona();
		persona1.setNombre("Claudio");
		persona1.setApellido("Miklan");

		Persona persona2 = new Persona("Michael", "Jackson");
		persona2.setNombre("Cristobal");
		persona2.setApellido("Mclufy");

		int numero = Integer.parseInt(console.readLine("Ingrese un numero: "));

		ArrayList<Persona> lista = new ArrayList<>();

		for(int i = 0; i < numero ; i++){
			Persona persona_x = new Persona();
			persona_x.setNombre(console.readLine("Ingrese el nombre: "));
			persona_x.setApellido(console.readLine("Ingrese el apellido: "));
			lista.add(persona_x); 
		}

		System.out.println(lista); */



/* 		String nombre_1 = persona1.getNombre();
		String apellido_1 = persona1.getApellido();
		String nombre_2 = persona2.getNombre();

		System.out.println("El nombre de la primera persona es "+ nombre_1+ " "+apellido_1);

		System.out.println("El nombre de la segunda persona es "+ nombre_2+" "+ persona2.getApellido()); */

		Shampoo nivea = new Shampoo("verde", 350, "viscoso", "agua", 2, "caca", true, "ondulado");

		System.out.println(nivea);

		System.out.println("************************************************************************************************");

		Crema_corporal caca = new Crema_corporal("azul", 250, "suava", "aloe vera", 4, "shit", "mano", "natura");

		System.out.println(caca);








	}

}
