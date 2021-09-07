package bnr;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		No raiz = null ;
		No aux;
		Pilha topo = null, pilha_aux = null;
		
		int op , find = 0 , idade;
		
		do {
			System.out.println("MENU");
			System.out.println("1° insira na arvore");
			System.out.println("2° buscar uma idade");
			System.out.println("3° 3buscar em ordem");
			System.out.println("digite uma opçao");
			op = entrada.nextInt();
			
			switch(op) {
			
			case 1:
				System.out.println("informe a idade que sere inserida na arvore");
				No novo = new No();
				novo.idade = entrada.nextInt();
				novo.dir = null;
				novo.esq = null;
				if(raiz == null) {
					raiz = novo;
				}else {
					aux = raiz;
					find = 0;
					while(find == 0 ) {
						if(novo.idade < aux.idade) {
							if(aux.esq == null) {
								aux.esq = novo;
								find = 1;
							}else {
								aux = aux.esq;
							}
						}else if (novo.idade >= aux.idade) {
							if(aux.dir == null) {
								aux.dir = novo;
								find = 1;
							}else {
								aux = aux.dir;
							}
						}
					}
				}
				break;
			case 2:
				if(raiz == null) {
					System.out.println("Arvore vazia");
				}else {
					System.out.println("digite o elementto a ser consultado:   ");
					idade = entrada.nextInt();
					aux = raiz;
					find = 0;
					while(aux != null && find == 0) {
						if(aux.idade == idade) {
							System.out.println("Elemento: " + idade + ", encontrado");
							find = 1;
						}else if(idade < aux.idade) {
							aux = aux.esq;
						}else {
							aux = aux.dir;
						}
					}	
					if(find == 0) {
						System.out.println("A idade nao foi encontrada !!!");
					}
				}
				break;
			case 3:
				if(raiz == null) {
					System.out.println("Arvore vazia");;
				}else {
					aux = raiz;
					topo = null;
					do {
						while(aux != null) {
							pilha_aux = new Pilha();
							pilha_aux.no = aux;
							pilha_aux.prox = topo;
							topo = pilha_aux;
							aux = aux.esq;
						}
						if(topo != null) {
							pilha_aux = topo;
							System.out.println(pilha_aux.no.idade+"");
							aux = topo.no.dir;
							topo = topo.prox;
						}
						}while(topo != null || aux != null);
				    }
					break;
				default:
					System.out.println("Informe uma opçao valida");
					break;
				}
			}while(op != 8);
			}
		}
	

	
