/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livrolivrariaarrayliststitic_;

/**
 *
 * @author Is@@c
 */
public class LivroLivraria {

    //Atributos
    private String titulo;
    private String autor;
    private int isbn;
    private String genero;
    private float preco;

    //contrutores
    public LivroLivraria() {
    }//contrutor default

    //sobrecarregados
    public LivroLivraria(String titulo, String autor, int isbn, String genero, float preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.genero = genero;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    //métodos da clasee
    public String imprimir() {
        return "Título: " + titulo + "\nAutor: " + autor
                + "\nISBN: " + isbn + "\nGenero: " + genero
                + String.format("\nPreço R$ %.2f\n", preco);
    }

}