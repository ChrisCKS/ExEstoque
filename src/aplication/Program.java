package aplication;

import java.util.Locale;

import java.util.Scanner;

import entities.Produto;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Produto produto = new Produto();
		
		System.out.println("Qual produto está procurando?");
		
		System.out.print("Nome: ");
		produto.nome = sc.nextLine();
		
		System.out.print("Preco: ");
		produto.preco = sc.nextDouble();
		
		System.out.print("Quantidade: ");
		produto.quantidade = sc.nextInt();
		
		System.out.println("Dados do prduto: " + produto);
		
		System.out.print("Quantos produtos foram adcionados ao estoque: ");
		int quantidade = sc.nextInt();
		produto.addProduto(quantidade);
		
		System.out.println("Dados atualizados:" + produto);
		
		System.out.println("Quantos produtos foram removidos: ");
		quantidade = sc.nextInt();
		produto.removerProduto(quantidade);
		
		System.out.println("Dados atualizados: " + produto);
		
		
		sc.close();
	}
}
