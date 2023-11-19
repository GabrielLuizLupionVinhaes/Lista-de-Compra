package br.com.Alura.Principal;

import br.com.Alura.Classes.Compra;
import br.com.Alura.Classes.Informacoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Principal {

    public static double totalCompras(Informacoes info){
        double valor = 0;
        for (Compra compra : info.getLista()) {
            valor += compra.getValorProduto();
        }
        return valor;
    }
    public static void verificaLimite(Informacoes info, Compra compra){
        double limite = info.getLimiteCartao();
        if(limite >= compra.getValorProduto()){
            info.setLista(compra);
        }else{
            System.out.println("Valor insuficiente!");
            System.out.println("Valor Disponivel: "+ "* " + (limite-totalCompras(info)) + " *");
        }
    }
    public static void main(String[] args) {
        int verifica = 1;



        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o limite do seu cartao: ");
        Informacoes info = new Informacoes(scan.nextDouble());


        while(verifica == 1){
            Compra compra = new Compra();
            System.out.println("\nDigite a descrição do produto: ");
            compra.setProduto(scan.next());
            System.out.println("Digite o valor do produto: ");
            compra.setValorProduto(scan.nextDouble());
            verificaLimite(info, compra);
            System.out.println("\nDeseja realizar mais compras? \n1 - Continuar / 0 - Finalizar");
            verifica = scan.nextInt();

        }
        System.out.println("*******************************");
        System.out.println("LISTA DE COMPRAS");
        System.out.println(info.getLista());
        System.out.println("*******************************");

        System.out.println("Total gasto: " + totalCompras(info));



    }
}