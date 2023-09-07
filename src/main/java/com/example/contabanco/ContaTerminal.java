package com.example.contabanco;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o nome do Cliente: ");
        String nomeCliente = scanner.nextLine();

        String agencia;
        while (true) {
            System.out.println("Por favor, digite o número da Agência (formato 000-0): ");
            agencia = scanner.next();
            if (agencia.matches("\\d{3}-\\d")) {
                break;
            } else {
                System.out.println("Agência incorreta, por favor, digite no formato 000-0. Tente novamente.");
            }
        }

        System.out.println("Por favor, digite o número da Conta: ");
        int numero = scanner.nextInt();

        double saldo;
        String saldoInput;
        while (true) {
            System.out.println("Por favor, digite o saldo da conta: ");
            saldoInput = scanner.next();
            if (saldoInput.matches("\\d+(?:[.,]\\d+)?")) {
                saldo = Double.parseDouble(saldoInput.replace(",", "."));
                break;
            } else {
                System.out.println("Saldo incorreto, por favor, utilize '.' ou ',' e tente novamente.");
            }
        }

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
