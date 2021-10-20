package es.dival.sonar;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class ErroresSonar {
	
	private List<String> pc;
	
	ErroresSonar() {
		pc = new ArrayList<>();
		pc.add("pantalla");
		pc.add("raton");
		pc.add("cpu");
		
	}

		
	public static int suma(int x, int y) {	
		return x-y;	
	}
	
	public String toString() {
		if (pc.isEmpty()) {
			return "";
		}else {
			return pc.toString();
		}
	}
	
	public static boolean iguales(Integer x, Integer y) {
		boolean result=false;
		if (x.equals(y))
			result=true;
		else
			result=false;
		return result;
	}
	
	
	
	public static String imprimeLista(List<String> lista) {
		String elem="";
		if (!lista.isEmpty()) {
			for (String s : lista) {
				elem=s+",";
			}
		}
		return elem;
	}

	public static String ultimoLista(List<String> lista) {
		String ultimo="";
		if (lista!=null && !lista.isEmpty())
			ultimo = lista.get(lista.size()-1);
		return ultimo;
	}
	
	//metodo repetido
	public static String ultimo(List<String> lista) {
		String ultimo="";
		if (lista!=null && !lista.isEmpty())
			ultimo = lista.get(lista.size()-1);
		return ultimo;
	}


	public static int bucleInfinito(List<String> lista) {
		int total=0;
		if (lista!=null && !lista.isEmpty()) {
			for (int i=0; i<lista.size(); i++) {
				total++;
				i--;
			}
		}
		return total;
		
	}
	

	public static boolean codigoMuerto(List<String> lista, String busqueda) {

		boolean ejecuta = false;
		if (lista!=null && ejecuta) {
			//Este codigo nunca se ejecuta
			if (!lista.isEmpty()) {
				for (int i=0; i<lista.size(); i++) {
					if (busqueda.equals(lista.get(i))) {
						return true;
					}
				}
			}
		}
		return false;
	}

	
	public static int bucleInverso(List<String> lista) {

		boolean ejecuta = false;
		int total=0;
		if (lista!=null && ejecuta) {
			//Este codigo nunca se ejecuta
			if (!lista.isEmpty()) {
				for (int i=0; i<lista.size(); i++) {
					total++;
				}
			}
		}
		return total;
	}
	
	public static int obtenNumeroAleatorio() {
		SecureRandom sr = new SecureRandom();
		sr.setSeed(1558); 
		return sr.nextInt(32);
	}

	public static void tryCath(List<String> lista) {
		try {
			for (int i=0; i<=lista.size(); i++)
				System.out.println(lista.get(i));
		}catch(Exception e) {
			//Habra que hacer algo no??
			//TODO: Esto lo hago mañana...
		}
		
	}

	/*
	 * 
	 * Metodo comentado
	 * 
	 * public static void complejidad(int i) {
		if ( i <= 5 ) {
	         if ( i <= 2 ) {
	            if ( i == 1 ) {
	              System.out.println("Hacemos algo con el 1");
	            } else {
	            	System.out.println("Sino es 1 hacemos otra cosa");
	            }
	         } else {   
	            if ( i > 3 ) {
	            	System.out.println("Vaya es mayor que 3 lo enviamos a otra funci�n");  
	            } else {
	               System.out.println("No hacemos nada....");
	            }
	         }
	      } else {
	         if ( i <= 7 ) {
	            if ( i == 6 ) {
	            	System.out.println("mmm no se que hacer con el 6");
	            } else if ( i == 7 ) {
	            	System.out.println("autodestrucci�n...");
	            } else {
	               // Never reached
	               System.out.println("Aqui no llega nunca");
	            } 
	         } else {
	            if ( i == 8 ) {
	            	System.out.println("Ejecuto el jenkins...");
	            } else if ( i == 9 ) {
	            	System.out.println("Esto se complica...");
	            } else if ( i == 10 ) {
	            	System.out.println("Ejecuto el dockers");
	            } else {
	            	System.out.println("Docker swarm?");
	            }
	         }
	      }
		
	}*/

	
	
	
	
	
}