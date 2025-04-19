package viernes;

public class Caculador {

	private int resultado;
	public Caculador() {
	resultado = 0;
	}
	public int sumar(int valor) {
	resultado = resultado + valor;
	return resultado;
	}
	public int restar(int valor) {
	resultado = resultado - valor;
	return resultado;
	}
	public int sumarNumeros(int operando1, int operando2) {
	resultado = operando1 + operando2;
	return resultado;
	}
	public int restarNumeros(int operando1, int operando2) {
	resultado = operando1 - operando2;
	return resultado;
	}
	public int multiplicarNumeros(int operando1, int operando2) {
	resultado = operando1 * operando2;
	return resultado;
	}
	// ArithmeticException
	public int dividirNumeros(int operando1, int operando2) throws Exception {
	if (operando2 == 0) {
	throw new Exception("No se puede dividir por cero");
	}
	resultado = operando1 / operando2;
	return resultado;
	}
	public int getResultado() {
	return resultado;
	}
}
