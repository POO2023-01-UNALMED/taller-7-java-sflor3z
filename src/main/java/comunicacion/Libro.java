package comunicacion;

public class Libro extends Escrito {
	
	private String co_autor;
	private String editorial;
	private String edicion;
	private String interpretacion;

	public Libro(String origen, String titulo, String autor, int paginas, String co_autor, String editorial, String edicion, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.co_autor = co_autor;
		this.editorial = editorial;
		this.edicion = edicion;
		this.interpretacion = interpretacion;
	}
	
	public void setCo_autor(String co_autor) {
		this.co_autor = co_autor;
	}
	
	public String getCo_autor() {
		return co_autor;
	}
	
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	
	public String getEditorial() {
		return editorial;
	}
	
	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}
	
	public String getEdicion() {
		return edicion;
	}
	
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}

	@Override
	public int palabrasTotales(int palabrasPagina) {
		
		return super.getPaginas()*palabrasPagina*2;
	}

	@Override
	public String interpretacion() {
		return interpretacion;
	}

	@Override
	public String toString() {
		String formato = String.format("%s\n %s\n %s\n %d\n %s\n %s\n %s\n %s", super.getOrigen(), super.getTitulo(), super.getAutor(), super.getPaginas(), getCo_autor(), getEditorial(), getEdicion());
		return formato;
	}

}
