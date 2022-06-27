package aula_2020_09_03;
public class ContaTester {
public static void main(String[] args) {
	// TODO Auto-generated method stub
	Conta itau = new Conta("Alex");
	// itau.setNomeTitular("Alex"); Ao comentar, bloqueia o nome. 
	itau.depositar(100f);
	itau.listar();
	System.out.println("Cliente:" + itau.getNomeTitular() + " - Saldo:" + itau.getSaldo());
	itau.sacar(10f);
	itau.listar();
	itau.sacar(1000f);
	itau.listar();
	}
}


