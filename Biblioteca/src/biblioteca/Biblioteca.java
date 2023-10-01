/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package biblioteca;

import biblioteca.model.Livro;
import biblioteca.model.biblioteca;
import java.util.Scanner;
/**
 *
 * @author aaron
 */
public class Biblioteca {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        biblioteca bb = new biblioteca();
        Livro lv = new Livro();
        boolean e = true;
        while (e==true) {
            System.out.println("Menu:");
            System.out.println("1. Adicionar um novo livro");
            System.out.println("2. Listar todos os livros");
            System.out.println("3. Alocar um livro");
            System.out.println("4. Devolver um livro emprestado");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();  // Limpar o buffer de entrada

            switch (opcao) {
                case 1:
                    bb.adicionarLivro(lv);
                    break;
                case 2:
                    bb.listarLivros();
                    break;
                case 3:
                 System.out.print("Digite o título do livro: ");
                 String titulo = scanner.nextLine();
                 bb.alocarLivro(titulo);
                 break;
                case 4:
                 System.out.print("Digite o título do livro: ");
                 titulo = scanner.nextLine();
                 bb.devolverLivro(titulo);
                case 5:
                    e= false;
            }
        }

    }

}
