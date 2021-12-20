package Projeto_G2;

import java.util.Set;
import java.util.TreeSet;

public class PjSessao2 extends PjCinema2{
	private String cadeira;

	public String getCadeira() {
		return cadeira;
	}

	public void setCadeira(String cadeira) {
		this.cadeira = cadeira;
	}
	
	public void sessao2()
	{
		int op,imP;
			
		Set<String> fileira1 = new TreeSet<String>();
		
		fileira1.add("1-A");
		fileira1.add("2-A");
		fileira1.add("3-A");
			
		Set<String> fileira2 = new TreeSet<String>();
		
		fileira2.add("1-B");
		fileira2.add("2-B");
		fileira2.add("3-B");
			
		Set<String> fileira3 = new TreeSet<String>();
		
		fileira3.add("1-C");
		fileira3.add("2-C");
		fileira3.add("3-C");
		
		do
		{
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
			System.out.println("\n(1) Poltronas disponíveis.");
			System.out.println("(2) Comprar ingresso.");
			System.out.println("(0) Voltar ao Menu Inicial.");
			System.out.println("\nSelecione uma opção!");
			System.out.println("---------------------------------------------------------------------");
			op=leia.nextInt();
			
			switch(op)
			{
			case 1:
				leia.nextLine();
				System.out.println("\n\t\s\s\s\s\s\sTELA");
				System.out.println("\t"+fileira1);
				System.out.println("\t"+fileira2);
				System.out.println("\t"+fileira3+"\n");
				break;
				
			case 2:
				
				leia.nextLine();
				System.out.println("\n\t\s\s\s\s\s\sTELA");
				System.out.println("\t"+fileira1);
				System.out.println("\t"+fileira2);
				System.out.println("\t"+fileira3);
				System.out.println("\nEscolha o assento desejado: ");
				String verifica = leia.nextLine();
				System.out.println("\nDigite o novo status do assento "+verifica+": ");
				String novo = leia.nextLine();
				if(fileira1.contains(verifica))
				{
					fileira1.remove(verifica);
					fileira1.add(novo);
				}
				else if(fileira2.contains(verifica))
				{
					fileira2.remove(verifica);
					fileira2.add(novo);		
				}
				else if(fileira3.contains(verifica))
				{
					fileira3.remove(verifica);
					fileira3.add(novo);	
				}
				else
				{
					System.out.println("\nAssento não existe!!\n");
					break;
				}
				System.out.println("\t\s\s\s\s\s\sTELA");
				System.out.println("\t"+fileira1);
				System.out.println("\t"+fileira2);
				System.out.println("\t"+fileira3);
				System.out.println("\nDigite (1) para imprimir o ingresso.");
				imP=leia.nextInt();
				if(imP == 1)
				{
					System.out.println("------------------------SEU INGRESSO CINE GEN------------------------");
                    System.out.println("\nIngresso Adquirido para o filme Star Wars Ep X. \nPoltrona: "+novo+". Divirta-se!");
				}
				else
				{
					System.out.println("\nComando inválido!!\n");
				}
				break;
				default:
								
			}			
		}while(op!=0);
		
	}
}
