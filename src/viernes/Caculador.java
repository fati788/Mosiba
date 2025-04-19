package viernes;

public class Caculador {

	private int resultado;
	/**
	 * Un contructor vacio que inicializa el resultado a 0.
	 */
	
	public Caculador() {
	resultado = 0;
	}
	
	/**
	 * El metodo sumar que reciba un numero entero y le suma al resultado
	 * y que devuelve el valos del resultado mas el valor pasado por parametro
	 * @param valor es el valor entera que recibe el metodo
	 * @return duvelve el resultado de la suma del resultado y el valor
	 */
	
	public int sumar(int valor) {
	resultado = resultado + valor;
	return resultado;
	}
	
	/**
	 * El metodo restar que reciba un numero entero y le resta al resultado
	 * y que devuelve el valos del resultado mas el valor pasado por parametro
	 * @param valor es el valor entera que recibe el metodo
	 * @return duvelve el resultado de la resta del resultado y el valor
	 */
	
	public int restar(int valor) {
	resultado = resultado - valor;
	return resultado;
	}
	/**
	 * El metodo sumarNumeros que reciba por parametros dos numeros enteros
	 * y hacer la suma de estos dos numeros
	 * @param operando1 es el primer numero que reciba el metodo para hacer la sulm
	 * @param operando2 es el segundo numero que reciba el metodo para hacer la suma
	 * @return duvelve el resultado de suma de dos numero
	 */
	public int sumarNumeros(int operando1, int operando2) {
	resultado = operando1 + operando2;
	return resultado;
	}
	/**
	 * El metodo restarNumeros que reciba por parametros dos numeros enteros
	 * y hacer la resta de estos dos numeros
	 * @param operando1 es el primer numero que reciba el metodo para hacer la resta
	 * @param operando2 es el segundo numero que reciba el metodo para hacer la resta
	 * @return duvelve el resultado de resta de dos numero
	 */
	public int restarNumeros(int operando1, int operando2) {
	resultado = operando1 - operando2;
	return resultado;
	}
	/**
	 * El metodo multiplicarNumeros que reciba por parametros dos numeros enteros
	 * y hacer la multiplicacion de estos dos numeros
	 * @param operando1 es el primer numero que reciba el metodo para hacer la multi
	 * @param operando2 es el segundo numero que reciba el metodo para hacer la multi
	 * @return duvelve el resultado de multiplicacion de dos numero
	 */
	public int multiplicarNumeros(int operando1, int operando2) {
	resultado = operando1 * operando2;
	return resultado;
	}
	
	/**
	 * El metodo dividirNumeros que reciba por parametros dos numeros enteros
	 * y hacer la division de estos dos numeros
	 * @param operando1 es el primer numero que reciba el metodo para hacer la division
	 * @param operando2 es el segundo numero que reciba el metodo para hacer la division
	 * @return duvelve el resultado de multiplicacion de dos numero
	 * @throws Exception salater un exepcion si el segundo operador sea cero porque
	 *  no se puede ahacer la division entre 0.
	 */
	// ArithmeticException
	public int dividirNumeros(int operando1, int operando2) throws Exception {
	if (operando2 == 0) {
	throw new Exception("No se puede dividir por cero");
	}
	resultado = operando1 / operando2;
	return resultado;
	}
	/**
	 * el metodo getResultado nos da el valor actual del resultado
	 * @return duvelve el valor del resultado 
	 */
	public int getResultado() {
	return resultado;
	}
}
