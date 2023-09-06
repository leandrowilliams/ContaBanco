package com.example.contabanco;

import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o nome do Cliente: ");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o número da Conta: ");
        int numero = scanner.nextInt();

        // Pedindo a altura até que uma entrada válida seja fornecida
        double saldo;
        String saldoInput;
        while (true) {
            System.out.println("Por favor, digite o saldo da conta: ");
            saldoInput = scanner.next();
            if (saldoInput.matches("\\d+(?:[.,]\\d+)?")) {
                saldo = Double.parseDouble(saldoInput.replace(",", "."));
                break;
            } else {
                System.out.println("Altura inválida. Tente novamente.");
            }
        }

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
