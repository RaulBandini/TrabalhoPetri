public class Main {
    public static void main(String[] args) {
        ListaSimples listaSimples = new ListaSimples(5);

        listaSimples.adicionarElemento("Arroz");
        listaSimples.adicionarElemento("Feijão");
        listaSimples.adicionarElemento("Sabão em Pó");
        listaSimples.adicionarElemento("Papel Higiênico");
        listaSimples.adicionarElemento("Óleo");
        listaSimples.buscarElemento("Óleo");
        listaSimples.removerElemento("Óleo");
        listaSimples.buscarElemento("Óleo");
        listaSimples.exibirElementos();
    }
}
