package fp.dam.java;

import java.util.ArrayList;
/*
 * Método m1
	Acepta una cadena para extraer de ella todas las subcadenas formadas por dos 
	o más caracteres repetidos y almacenarlas en un ArrayList.
	Retorna el ArrayList.
	
	Método m2
	 Hace lo mismo que el anterior con la ayuda de la 
	 siguiente expresión regular: (.)\1+
	 
	Metodo m3a
	 Acepta una matriz y retorna el valor máximo de los resultados obtenidos 
	 al sumar los elementos de cada matriz interna de 3x3.
	 La matriz no puede tener un número de filas o un número de columnas inferior a 3.
	 En caso contrario retorna null.
*/

static ArrayList<String> m1(String s)  {
	ArrayList<String> list = new ArrayList<>();
	int inicio = 0;
	for(int i = 1; i < s.length(); i++) {
		if (s.charAt(i) != s.charAt(i - 1)) {
			if (i - inicio >= 2)
				list.add(s.substring(inicio, i));
			inicio = i;
		}
	}
	if (i - inicio >= 2)
		list.add(s.substring(inicio,i));
	return list;

	static ArrayList<String> m2(String s) {
		ArrayList<String> list = new ArrayList<>();
		Matcher m = Pattern.compile("(.)\\1+").matcher(s);
		while (m.find())
			list.add(m.group());
		return list;
}

static void m3a(int [] matriz) {
	
}

static void m3b(int [] minas) {
	int columna,fila,minas;
	
}

public class Main {
	
	public static void main(String[] args) {
	 System.out.println();
	}
}
