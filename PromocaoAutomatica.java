public class PromocaoAutomatica {
	public static void main(String[] args){

		byte coca = 15;
		short pipoca = 2026;
		char avista = 'S';
		int dinheiro = 50000;
		long banco = 1000000000l;
		float bala = 1.55f;
		double sorvete = 2.50;

		int cinema = pipoca + coca;
		double trocado = sorvete + bala;
		int troco = dinheiro + cinema;
		double trocoFinal = trocado + troco;	

		System.out.println("O preço da coca é: " + coca);
		System.out.println("E o preço da pipoca com mandeiga ficou: " + pipoca);
		System.out.println("valor do preço da pipoca com coca no cinema: " + cinema);

		System.out.println("Após a saida do cinema a gentou também comprou: " + bala);
		System.out.println("E também compramos: " + sorvete);
		System.out.println("e com isso deu o valor de: " + trocado);
		System.out.println("e nós ficamos com esse valor aqui:" + trocoFinal);


	}
}