package aula_2020_09_03;
//////////
//QUEM TEM QUE SABER DO SALDO É A CLASSE CONTA
		//////////
public class Conta {
	public Conta() {}
	private float saldo;
	private String nomeTitular; 
	public Conta(String nome)
	{
		setNomeTitular(nome);;
	}
	private void setNomeTitular(String nomeTitular) {
	this.nomeTitular = nomeTitular;
	}
	public void depositar(float valor)
	{
		this.saldo = this.saldo + valor;
	}
	//////////
	// RETORNA O SALDO PARA O USUÁRIO 
	//////////
	public float getSaldo()
	{
		return this.saldo;
	}
	public float sacar(float valor)
	{
		if (getSaldo() >= valor) // getSaldo = função reutilizada. 
		{
			this.saldo = this.saldo - valor; // x = x - y
			System.out.println("Saque efetuado com sucesso!");
			return valor; // retorna o valor atualizado 
		}
		else
		{
			System.out.println("Saldo insuficiente!!!");
			return -1;
		}
	}
	public void listar() { // LISTAR AINDA SERÁ FEITO NA PRÓXIMA AULA. 
}
}

