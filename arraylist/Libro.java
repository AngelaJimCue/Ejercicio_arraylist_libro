package arraylist;
import java.util.ArrayList;
import java.util.List;

public class Libro implements Comparable<Libro>{
	/*ENUNCIADO: Crea 5 libros distintos, meterlos en ArrayList, sacarlos
	 * ordenados (Autor y título)*/
	private String titulo;
	private String autor;
	private Integer numeroDePaginas;
	
	public Libro(String titulo, String autor, Integer numeroDePaginas) {
		this.titulo = titulo;
		this.autor = autor;
		this.numeroDePaginas = numeroDePaginas;
	}

	@Override
	public String toString() {
		return String.format("Libro [Autor: %s , título: %s y número de página:%d.]", 
				autor, titulo, numeroDePaginas);
	}

	@Override
	public int compareTo(Libro libro) {
		if (this.autor.compareTo(libro.autor)==0) {
			return this.titulo.compareTo(libro.titulo);
		}else if (this.titulo.compareTo(libro.titulo)==0) {
			return this.numeroDePaginas.compareTo(libro.numeroDePaginas);
		}else {
			return this.autor.compareTo(libro.autor);
		}
	}



	public static void main(String[] args) {
		List <Libro> libross = new ArrayList <>();
		libross.add(new Libro ("titulo1", "autor1",12));
		libross.add(new Libro ("titulo3", "autor2",12));
		libross.add(new Libro ("titulo2", "autor1",12));
		libross.add(new Libro ("titulo2", "autor1",13));
		libross.add(new Libro ("titulo3", "autor4",16));

		libross.sort(null);
		
		for (Libro libro : libross) {
			System.out.println(libro);
		}
		
		
	}
}
