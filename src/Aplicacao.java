
public class Aplicacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//instanciando as formas geometricas
		Triangulo t1 = new Triangulo();
		Quadrado q1 = new Quadrado();
		Circunferencia c1 = new Circunferencia();
		Trapezio tr1 = new Trapezio();
		
		//atribuindo valores 
		double triangulo = t1.soma(5, 5);
		double quadrado = q1.soma(3);
		double circ = c1.soma(3);
		double trap = tr1.soma(5, 4, 10);
		
		
		//imprimindo as respostas
		System.out.println("Resposta do triangulo é:" + triangulo);
		System.out.println("Resposta do quadrado é:" + quadrado);
		System.out.println("Resposta da circunf é:" + circ);
		System.out.println("Resposta do trapezio é:" + trap);
		
	}

}
