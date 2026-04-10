import java.util.Scanner;

public class ValidadorAcesso{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		String usuarioCorreto = "admin";
		String senhaCorreta = "java123";

		System.out.println("=== SISTEMA DE SEGURANCA ALPHA ===");

		System.out.print("Usuario: ");
		String usuarioDigitado = teclado.nextLine();

		System.out.print("Senha: ");
		String senhaDigitada = teclado.nextLine();

		boolean usuarioValido = usuarioDigitado.equals(usuarioCorreto);
		boolean senhaValida = senhaDigitada.equals(senhaCorreta);

		System.out.println("\nVerificando credenciais...");

		if (usuarioValido && senhaValida) {
			System.out.println("ACESSO PERMITIDO! Bem-vindo ao servidor.");
			System.out.println("Status: Conectando como SuperUser.");
		} else {
			System.out.println("ACESSO NEGADO!");
			System.out.println("Erro: Usuario ou senha invalidos.");
		}

		System.out.println("==================================");

		teclado.close();
	}
}