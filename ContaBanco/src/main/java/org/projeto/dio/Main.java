package org.projeto.dio;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(in);

        out.print("POR FAVOR , DIGITE O NUMERO DA AGENCIA: ");
        String agencia = entrada.nextLine();

        out.print("NUMERO: ");
        int numero = entrada.nextInt();

        out.print("NOME: ");
        String nome = entrada.next();

        out.print("SALDO: ");
        double saldo = entrada.nextDouble();

        ContTerminal terminal = new ContTerminal(numero, agencia, nome, saldo);

        out.print("Olá " + terminal.getNomeCliente() +
                ", obrigado por criar uma conta em nosso banco, sua agência é " +
                terminal.getAgencia() + ", conta " + terminal.getNumero() +
                " e seu saldo " + terminal.getSaldo()
                + " já está disponível para saque" + "\n");
    }

}