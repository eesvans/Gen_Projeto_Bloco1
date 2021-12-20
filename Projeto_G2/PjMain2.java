package Projeto_G2;

import java.util.Scanner;

public class PjMain2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		PjFilmes2 filmes = new PjFilmes2();
		PjSessao1 se1 = new PjSessao1();
		PjSessao2 se2 = new PjSessao2();
		PjSessao3 se3 = new PjSessao3();
		
		int esc, op,id,sess;
		
		System.out.println("---------------------------------------------------------------------");
		String art = """                                                                                                                                                   
  ..|'''.| '||' '|.   '|' '||''''|      ..|'''.|  '||''''|  '|.   '|' 
.|'     '   ||   |'|   |   ||  .       .|'     '   ||  .     |'|   |  
||          ||   | '|. |   ||''|       ||    ....  ||''|     | '|. |  
'|.      .  ||   |   |||   ||          '|.    ||   ||        |   |||  
 ''|....'  .||. .|.   '|  .||.....|     ''|...'|  .||.....| .|.   '|  
                                                                      
                                                                      """;
		for(int i=0; i<art.length();i++)
		{
			System.out.print(art.charAt(i));
		}
		System.out.println("---------------------------------------------------------------------");

		System.out.println("\n\t\tBem vindo ao CINE GEN!");
		System.out.println("\nInforme sua idade: ");
		id=ler.nextInt();
		filmes.setIdade(id);
		do {
		System.out.println("\t\tCINE GEN Menu Inicial\n");
		System.out.println("(1) Filmes em cartaz.");
		System.out.println("(2) Filmes em breve.");
		System.out.println("(3) Comprar ingresso.");
		System.out.println("(0) Sair do sistema.");
		op=ler.nextInt();
		
		if(op ==1)
		{
			filmes.emCartaz();
		}
		else if(op == 2)
		{
			filmes.emBreve();
		}
		else if(op == 3)
		{
			if (id >=18)
			{
				System.out.println("\nEscolha sua sessão: ");
				System.out.println("(1) ToyStory 12");
				System.out.println("(2) Star Wars Ep X");
				System.out.println("(3) Deadpool 3");
				System.out.println("(0) Sair do Menu");
				sess=ler.nextInt();
				if(sess==1) 
				{
					se1.sessao1();
					
				}
				if(sess==2)
				{
					se2.sessao2();
					
				}
				if(sess==3)
				{
					se3.sessao3();	
				}
				
			}
				else if (id >12)
				{
					System.out.println("\nEscolha sua sessão: ");
					System.out.println("(1) ToyStory 12");
					System.out.println("(2) Star Wars Ep X");
					sess=ler.nextInt();
					if(sess==1) 
					{
						se1.sessao1();
						
					}
					if(sess==2)
					{
						se2.sessao2();
						
					}
					
				}
			else if(id <= 12)
			{
				System.out.println("\nEscolha sua sessão: ");
				System.out.println("(1) ToyStory 12");
				
				sess=ler.nextInt();
				if(sess == 1)
				{
					se1.sessao1();
					
				}
				
			}
		}
		}while(op!=0);
		if(op == 0)
		{
			System.out.println("\n Obrigado pela sua visita ao CINE GEN!");
		}
	}
}
