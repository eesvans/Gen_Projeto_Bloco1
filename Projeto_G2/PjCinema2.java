package Projeto_G2;

import java.util.Scanner;

public abstract class PjCinema2 {
	Scanner leia = new Scanner(System.in);
	
	private int idade;
	
	public PjCinema2(int idade)
	{
		this.idade=idade;
	}
	
	public PjCinema2()
	{
		
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}
