import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);	
		ArrayList<Funcionario> lista = new ArrayList<>();
		System.out.print("Informe a quantidade de Funcionario: ");
		int qnt = sc.nextInt();
		for(int i=0; i<qnt; i++) {
			System.out.print("O funcionario é terceirizado? ");
			sc.nextLine();
			String n = sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Horas: ");
			int horas = sc.nextInt();
			System.out.print("Valor por horas: ");
			double valor = sc.nextDouble();
			if (n.equals("sim")) {
				System.out.print("Adcional: ");
				double ad = sc.nextDouble();
				Funcionario f = new FuncionarioTercerizado(nome, horas, valor, ad);
				lista.add(f);
			}else {
				lista.add(new Funcionario(nome,horas,valor));
			}
			
		}
		System.out.println();
		System.out.println("Pagamentos");
		for (Funcionario f : lista) {
			System.out.println(f.getNome()+"- R$ "+ f.pagamento());
		}
	}
}
