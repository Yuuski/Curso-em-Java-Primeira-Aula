import java.util.Scanner;
public class CadastroProduto {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("=== SISTEMA DE INVENTARIO - CADASTRO ===");

		System.out.print("Nome do produto: ");
		String nome = entrada.nextLine();

		System.out.print("Quantidade em estoque: ");
		int quantidade = entrada.nextInt();

		System.out.print("Preco unitario: ");
		double preco = entrada.nextDouble();

		double valorTotalEstoque = quantidade * preco;

		System.out.println("\n-- Resumo do Cadastro ---");
		System.out.println("Produto: " + nome);
		System.out.println("Estoque Atual: " + quantidade + " unidades");
		System.out.println("Preco de Venda: R$ " + preco);
		System.out.println("Valor Total Investido: R$ " + valorTotalEstoque);

		if (quantidade < 10) {
			System.out.println("ALERTA: Estoque baixo! Necessario reposicao.");		
		} else {
			System.out.println("Status? Estoque em nivel seguro.");
		}

		System.out.println("------------------------");

		entrada.close();
	}

}