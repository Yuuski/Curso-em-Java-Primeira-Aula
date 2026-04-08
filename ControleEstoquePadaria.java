public class ControleEstoquePadaria {
	public static void main(String[] args) {
		int quantidadeFarinha = 10;
		int quantidadeAcucar = 5;
		int quantidadeDinheiro = 20;

	System.out.println("O preço da Farinha é deu: " + quantidadeFarinha );
	System.out.println("e o preço do Acuçar é: " + quantidadeAcucar );
	System.out.println("Deu um valor de 15.00 R$ Senhor. Qual é a forma de pagamento?");
	System.out.println("Vai ser dinheiro, então pega meus R$" + quantidadeDinheiro);
	System.out.println("Aqui seu troco senhor : $" + (quantidadeDinheiro - (quantidadeFarinha + quantidadeAcucar)) + " Volte sempre!");
	System.out.println("Obrigado, até mais e um otimo dia para você!");
	}
}