package es.dival.sonar;

import java.util.Arrays;
import java.util.List;

public class TestSonar {
	

	public static void main(String[] args) {
		
		
		System.out.println("Practica Sonar Calidad Software");
		System.out.println(ErroresSonar.suma(3,2));
		
		if (ErroresSonar.iguales(5, 2)) {
			System.out.println("Son iguales");
		}else {
			System.out.println("No son iguales");
		}
		
		
		ErroresSonar erroresSonar = new ErroresSonar();
		String cadena = erroresSonar.toString();
		System.out.println(cadena);
		
		List<String> solucionesCCNCERT = null;
		System.out.println(ErroresSonar.imprimeLista(solucionesCCNCERT));
		
		solucionesCCNCERT = Arrays.asList(new String[] {"Amparo", "Maria", "Pilar", "Ines", "Gloria", "Claudia"});
		ErroresSonar.ultimoLista(solucionesCCNCERT);
		
		ErroresSonar.ultimo(solucionesCCNCERT);
		
		ErroresSonar.bucleInfinito(solucionesCCNCERT);
		
		ErroresSonar.bucleInverso(solucionesCCNCERT);
		
		
		ErroresSonar.codigoMuerto(solucionesCCNCERT, "Marta");
		
		System.out.println("Numero aleatorio: "+ErroresSonar.obtenNumeroAleatorio());
		
		ErroresSonar.tryCath(solucionesCCNCERT);
		
		//ErroresSonar.complejidad(9);

	}

}
