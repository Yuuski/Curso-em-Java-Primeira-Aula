public class Automaticas {
	public static void main(String[] args) {
		int a = 10;
		float b = 1.5f;
		float c = a * b; // a é promovido para float antes do cálculo

		System.out.println("Valor de c =" + c);
	}
}