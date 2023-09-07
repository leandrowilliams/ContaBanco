package com.example.contabanco;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o nome do Cliente: ");
        String nomeCliente = scanner.nextLine();

        String agenciaInput;
        while (true) {
            System.out.println("Por favor, digite o número da Agência: ");
            agenciaInput = scanner.next();
            if (agenciaInput.matches("\\d{3}-\\d") || agenciaInput.matches("\\d{4}")) {
                break;
            } else {
                System.out.println("Agência incorreta, por favor, digite no formato 067-8 ou 0678. Tente novamente.");
            }
        }

        String agencia = agenciaInput.length() == 4 ? agenciaInput.substring(0, 3) + "-" + agenciaInput.substring(3) : agenciaInput;

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
