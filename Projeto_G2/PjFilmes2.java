package Projeto_G2;

import java.util.Arrays;

public class PjFilmes2 extends PjCinema2{
	
	private String emCartaz;
	private String emBreve;
	
	public String getEmCartaz() {
		return emCartaz;
	}
	public void setEmCartaz(String emCartaz) {
		this.emCartaz = emCartaz;
	}
	public String getEmBreve() {
		return emBreve;
	}
	public void setEmBreve(String emBreve) {
		this.emBreve = emBreve;
	} 
	
	public void emCartaz()
	{
		String[] titulosM18 = {"ToyStory 12", "Star Wars Ep X","Deadpool 3"};
		String[] titulosM16 = {"ToyStory 12", "Star Wars Ep X"};
		String[] titulosM12 = {"ToyStory 12"};
		if(super.getIdade() <= 12)
		{
			System.out.println("Filmes em cartaz indicados para idade até 12 anos.\n");
			System.out.println(Arrays.toString(titulosM12));
			System.out.println("---------------------------------------------------------------------");
			
		}
		else if(super.getIdade()>12 && super.getIdade()<18)
		{
			System.out.println("Filmes em cartaz indicados para maiores de 12 anos.\n");
			System.out.println(Arrays.toString(titulosM16));
			System.out.println("---------------------------------------------------------------------");
		}
		else
		{
			System.out.println("Filmes em cartaz indicados para maiores de 18 anos.\n");
			System.out.println(Arrays.toString(titulosM18));
			System.out.println("---------------------------------------------------------------------");
		}
	}
	
	public void emBreve()
	{
		
		String[] titulosEM18 = {"Os Incríveis 3","20 Coisas que Odeios em Você","Sexta-feira 13 Parte 20"};
		String[] titulosEM16 = {"Os Incríveis 3","20 Coisas que Odeio em Você"};
		String[] titulosEM12 = {"Os Incríveis 3"};
		
		if(super.getIdade() <= 12)
		{
			System.out.println("\nFilmes que chegarão em breve indicados para idade até 12 anos.\n");
			System.out.println(Arrays.toString(titulosEM12));
			System.out.println("---------------------------------------------------------------------");
			
		}
		else if(super.getIdade()>12 && super.getIdade()<18)
		{
			System.out.println("\nFilmes que chegarão em breve indicados para maiores de 12 anos.\n");
			System.out.println(Arrays.toString(titulosEM16));
			System.out.println("---------------------------------------------------------------------");
		}
		else
		{
			System.out.println("\nFilmes que chegarão em breve indicados para maiores de 18 anos.\n");
			System.out.println(Arrays.toString(titulosEM18));
			System.out.println("---------------------------------------------------------------------");
		}
	}
	

}
