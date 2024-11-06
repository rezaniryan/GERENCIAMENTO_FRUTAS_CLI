package ExemploTestInterativo;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class ExemploTestInterativo {
	
	public static void main(String[] args) { 
		
	        // cria o scanner para o objeto
	     Scanner scanner = new Scanner(System.in);
	        
	        // conjunto set para amazenar as frutas
	     Set<String> frutas = new HashSet<>();
	        
	        // faz o loop do programa
	     while (true) { 
	        try {
	            	
            // cria o menu para o usuario escolher
	        System.out.println("\nEscolha uma opção: ");
	        System.out.println("1. Adicionar uma fruta");
	        System.out.println("2. Listar todas as frutas");
	        System.out.println("3. Remover uma fruta");
	        System.out.println("4. Verificar se uma fruta está presente");
	        System.out.println("5. Sair");
	        System.out.print("Opção: ");
	                
	        // le a opçao escolhida 
	       int opcao = scanner.nextInt();
	        // limpa o buffer do scanner
	                   scanner.nextLine();

	       // analisa a opçao escolida pelo usuario, e executa corretamente
	       switch (opcao) {
	               case 1:
	                    	
	       // adiciona a fruta
	        System.out.print("Digite o nome da fruta para adicionar: "); 
	           String novaFruta = scanner.nextLine();
	                        
	       // adiciona a fruta ao conjunto, se ela ja estiver o usuario sera notificado
	                if (frutas.add(novaFruta)) {
	                            System.out.println(novaFruta + " foi adicionada.");
	                    } else {
	                            System.out.println(novaFruta + " já está presente no conjunto.");
	                        }
	                break; 
	                    case 2:
	                    	
	      // cria a lista das frutas
	        System.out.println("Frutas: " + frutas);
	                break;
	                    case 3:
	                    	
	      // remove a fruta
	        System.out.print("Digite o nome da fruta que deseja remover: "); 
	        String frutaRemover = scanner.nextLine();
	                        
	      // remove a fruta, se ela nao tiver o usuario sera notificado
	               if (frutas.remove(frutaRemover)) {
	        System.out.println(frutaRemover + " foi removida.");
	                        } else {
	        System.out.println(frutaRemover + " não foi encontrada.");
	                        }
	                break;
	                    case 4:
	                    	
	      // vrifica a fruta na lista
	        System.out.print("Digite o nome da fruta para verificar: ");
	        String frutaVerificar = scanner.nextLine();
	                        
	     // informa se a fruta esta na lista
	               if (frutas.contains(frutaVerificar)) {
	        System.out.println(frutaVerificar + " está presente no conjunto.");
	                        } else {
	        System.out.println(frutaVerificar + " não foi encontrada no conjunto.");
	                        }
	                break;
	                    case 5:
	                    	
	     // opçao de saida do programa
	        System.out.println("Saindo...");
	                        
	                        // Fecha o scanner e encerra o programa
	               scanner.close();
	                 return;
	                    default:
	                    	
	     // se o usurio escolher uma fruta invalida, sera emitido um mensagem de erro
	        System.out.println("Opção inválida. Tente novamente.");
	                }
	            } catch (InputMismatchException e) {
	            	
	     // caso insira uma letra, sera emitido uma imagem de erro
	        System.out.println("Entrada inválida. Por favor, digite um número.");
	                
	     // limpa o scanner e permanece no looping
	                scanner.nextLine();
	            }
	        }
	    }
	}


