

public class Flecha {// nombre de la clase
	
	int longitud;// creacion de variable longitud de tipo int
	String color;// creacion de variable color tipo String
	
	public Flecha() {// clase constructor sin parametros
		longitud = 18;
		color = "negro";
	}
	
	public Flecha(int longitud, String color) {// clase constructor con 2 parametros, longitud y color
		this.longitud=longitud;
		this.color=color;
	}
	
	public void construirFlecha() {// metodo construir flecha, utiliza un for para imprimir - la cantidad de veces 
		for (int i = 0; i < longitud; i++) { // que dice la variable longitud
			imprime("-");
		}
		imprime(">");
	}
	
	public void imprimirEspacio() {// metodo imrimirEspacio que simplemente imprime una nueva linea
		System.out.println();
	}

	private void imprime(String simbolo) {// metodo privado que imprime el color del simbolo especificado como argumento
		if (color.equals("negro")) {
			System.out.print(simbolo);
		}else {
			System.err.print(simbolo);
		}
		
	}
	
}
