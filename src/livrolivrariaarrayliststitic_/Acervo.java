package livrolivrariaarrayliststitic_;

import java.util.ArrayList;

/**
 *
 * @author Is@@c
 */
public class Acervo {

    private static ArrayList<LivroLivraria> listaLivros = new ArrayList<>();

    //método GET
    public static ArrayList<LivroLivraria> getListaLivro() {
        return listaLivros;
    }

    //Adicionar um objeto na listra
    static public void adicionar(LivroLivraria l) {
        listaLivros.add(l);
    }//----------------------------------------------
    //Lista de dados de todos os objetos da lista

    static public String listar() {//-------------------------
        String saida = "";//acumulador de String
        int i = 1;
        for (LivroLivraria l : listaLivros) {
            saida += "\n========== LIVRO Nº " + (i++) + " ==========\n";
            saida += l.imprimir() + "\n";
        }

        return saida;
    }//------------------------ fim metodo listar
//sobrecarga de metodos pesquisar

    static public int pesquisar(String genero) {//---------------------
        int qtd = 0;

        for (LivroLivraria l : listaLivros) {
            if (l.getGenero().equalsIgnoreCase(genero)) {
                qtd++;
            }
        }

        return qtd;
    }//---------------------- fim metodo pesquisar por genero

    static public int pesquisar(double vInicial, double vFinal) {//-------------
        int qtd = 0;
        for (LivroLivraria l : listaLivros) {
            if (l.getPreco() >= vInicial && l.getPreco() <= vFinal) {
                qtd++;
            }
        }

        return 0;
    }// ----------------------- fim metodo pesquisar por valor

    static public boolean remover(String titulo) {//-----------------------------
        for (LivroLivraria l : listaLivros) {
            if (l.getTitulo().equalsIgnoreCase(titulo)) {
                listaLivros.remove(l);
                return true;
            }
        }

        return false;
    }//------- fim metodo remover

//total acervo
    static double calcularTotalAcervo() {//----------
        double total = 0;
        for (LivroLivraria l : listaLivros) {
            total += l.getPreco();
        }

        return total;
    }//fim metodo calc total acervo

}//fim classe
