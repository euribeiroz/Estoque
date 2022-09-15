package controleEstoque;

import java.util.Scanner;
public class Main {
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         Produto produto = new Produto();

         System.out.println("Entre com os dados do produto");
         System.out.println("Nome: ");
         produto.nome = sc.nextLine();
         System.out.println("Preços: ");
         produto.preço = sc.nextDouble();
         System.out.println("Quantidade em Estoque: ");
         produto.quantidade = sc.nextInt();

         System.out.println("Informe a quantidade de produtos"
                 +"para ADICIONAR no estoque");

         int quantidade = sc.nextInt();
         produto.addProduto(quantidade);

         System.out.println(produto);

         System.out.println("Informe a quantidade de produtos"
                 +"para REMOVER no estoque");

         quantidade = sc.nextInt();
         produto.deleteProduto(quantidade);

         System.out.println(produto);

         sc.close();
     }
}

