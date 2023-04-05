package comunicacion;

public class Alfabeto extends Pictograma {
	
	private static String[] letras;
	private String interpretacion;

	public Alfabeto(String origen, String[] letras, String interpretacion) {
		super(origen);
		Alfabeto.letras = letras;
		this.interpretacion = interpretacion;
	}
	
	public int cantidadLetras() {
		int tamano = letras.length;
		return tamano;
	}
	
	public static void setLetras(String[] letras) {
		Alfabeto.letras = letras;
	}
	
	public static String[] getLetras() {
		return letras;
	}

	@Override
	public String interpretacion() {
		// TODO Auto-generated method stub
		return interpretacion;
	}
	
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.join(", ", letras);
		}
}