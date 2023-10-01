/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca.model;

import biblioteca.model.Livro;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author aaron
 */
public class biblioteca {

    private List<Livro> acervo; // Lista de livros na biblioteca
    Scanner scanner = new Scanner(System.in);

    public biblioteca() {
        acervo = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        System.out.print("Digite o título do livro: ");
        livro.setTitulo(scanner.nextLine());
        System.out.print("Digite o autor do livro: ");
        livro.setAutor(scanner.nextLine());
        System.out.print("Digite o ano de publicação do livro: ");
        livro.setAnoPublicacao(scanner.nextLine());
        livro.setDisponibilidade(true);
        scanner.nextLine(); // Limpar o buffer de entrada
        acervo.add(livro);
    }

    public void listarLivros() {
        System.out.println("Lista de Livros:");
        for (Livro livro : acervo) {
            System.out.println("Título: " + livro.getTitulo());
            System.out.println("Autor: " + livro.getAutor());
            System.out.println("Ano de Publicação: " + livro.getAnoPublicacao());
            System.out.println("Disponibilidade: " + (livro.isDisponibilidade() ? "Disponível" : "Indisponível"));
            System.out.println(); // Adicione uma linha em branco para separar os livros
        }
    }

    public void alocarLivro(String titulo) {
        for (Livro livro : acervo) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                if (livro.isDisponibilidade()) {
                    livro.setDisponibilidade(false);
                    System.out.println("Livro alocado com sucesso!");
                } else {
                    System.out.println("Livro indisponível para alocação.");
                }
                return; // Sai do método após encontrar o livro
            }
        }
        System.out.println("Livro não encontrado na biblioteca.");
    }
}
