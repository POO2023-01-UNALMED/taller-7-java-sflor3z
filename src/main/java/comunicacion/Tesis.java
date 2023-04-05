package comunicacion;

public class Tesis extends Escrito {
	
	private String idea;
	private static String[] argumentos;
	private String conclusion;
	private String referencias;
	private String interpretacion;

	public Tesis(String origen, String titulo, String autor, int paginas, String idea, String[] argumentos, String conclusion, String referencias, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.idea = idea;
		Tesis.argumentos = argumentos;
		this.conclusion = conclusion;
		this.referencias = referencias;
		this.interpretacion = interpretacion;
	}
	
	public void setIdea(String idea) {
		this.idea = idea;
	}
	
	public String getIdea() {
		return idea;
	}
	
	public static void setArgumentos(String[] argumentos) {
		Tesis.argumentos = argumentos;
	}
	
	public static String[] getArgumentos() {
		return argumentos;
	}
	
	public static int cantArgumentos() {
		return argumentos.length;
	}
	
	public void setConclusion(String conclusion) {
		this.conclusion = conclusion;
	}
	
	public String getConclusion() {
		return conclusion;
	}
	
	public void setReferencias(String referencias) {
		this.referencias = referencias;
	}
	
	public String getReferencias() {
		return referencias;
	}
	
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	@Override
	int palabrasTotales(int palabrasPagina) {
		// TODO Auto-generated method stub
		return super.getPaginas()*palabrasPagina*5;
	}

	@Override
	String interpretacion() {
		// TODO Auto-generated method stub
		return interpretacion;
	}

	@Override
	public String toString() {
		String formato = String.format("%s\n %s\n %s\n %d\n %s\n %s\n %s\n %s", super.getOrigen(), super.getTitulo(), super.getAutor(), super.getPaginas(), getIdea(), Tesis.cantArgumentos(), getConclusion(), getReferencias());
		return formato;
	}

}
