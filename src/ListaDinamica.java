public class ListaDinamica implements ListaOperacoes {
    No inicio;

    public ListaDinamica() {
        this.inicio = new No(null);
        System.out.println("Lista dinâmica criada com sucesso!");
    }

    public void adicionarElemento(String elemento) {

        if(inicioEstaVazio()) {
            this.inicio.setConteudo(elemento);
        } else {
            No aux = this.inicio;
            No novoNo = new No(elemento);
            while(aux.getProx() != null) {
                aux = aux.getProx();
            }
            aux.setProx(novoNo);
        }
    }

    public void exibir() {
        if(inicioEstaVazio()) {
            System.out.println("Não existem elementos na lista dinâmica.");
        } else {
            No aux = this.inicio;
//            while(aux != null && aux.getConteudo() != null) {
//                System.out.println(aux.getConteudo());
//                aux = aux.getProx();
//            }

            while(aux != null) {
                System.out.println(aux.getConteudo());
                aux = aux.getProx();
            }
            //System.out.println(aux.getConteudo());
        }
    }

    private boolean inicioEstaVazio() {
        if(this.inicio.getConteudo() == null) {
            return true;
        } else {
            return false;
        }
    }

    public void removerElemento(String elemento) {
        if(inicioEstaVazio()) {
            System.out.println("Não há elementos a serem removidos.");
        } else {
            if(procurarElemento(elemento)) {
                //remover primeiro elemento isolado
                if(this.inicio.getProx() == null) {
                    System.out.println("Elemento + " + elemento + " removido!");
                    this.inicio.setConteudo(null);
                }
                //remover qualquer nó conectado
                else if(this.inicio.getProx() != null) {
                    No aux = this.inicio;
                    while(aux != null) {
                        if (this.inicio.getConteudo().equals(elemento)) {
                            System.out.println("Elemento " + elemento + " removido!");
                            this.inicio = this.inicio.getProx();
                            return;
                        } else if(aux.getProx().getConteudo().equals(elemento)) {
                            System.out.println("Elemento + " + elemento + " removido!");
                            aux.setProx(aux.getProx().getProx());
                            return;
                        }
                        aux = aux.getProx();
                    }
                }
            }
        }
    }

    public boolean procurarElemento(String elemento) {
        if(inicioEstaVazio()) {
            System.out.println("Não há elementos a serem procurados.");
        } else {
            No aux = this.inicio;
            while(aux != null) {
                if(aux.getConteudo().equals(elemento)) {
                    System.out.println("Elemento " + elemento + " encontrado!");
                    return true;
                }
                aux = aux.getProx();
            }
            System.out.println("Elemento " + elemento + " não existe na lista.");
        }
        return false;
    }

    @java.lang.Override
    public int removerTodas(String elemento) {
        return 0;
    }

    @java.lang.Override
    public int contar() {
        return 0;
    }

    @java.lang.Override
    public int adicionarVarios(String[] elementos) {
        return 0;
    }

    @java.lang.Override
    public String obter(int indice) {
        return null;
    }

    @java.lang.Override
    public boolean inserir(int indice, String elemento) {
        return false;
    }

    @java.lang.Override
    public String removerPorIndice(int indice) {
        return null;
    }

    @java.lang.Override
    public void limpar() {

    }

    @java.lang.Override
    public int ultimoIndiceDe(String elemento) {
        return 0;
    }

    @java.lang.Override
    public int contarOcorrencias(String elemento) {
        return 0;
    }

    @java.lang.Override
    public int substituir(String antigo, String novo) {
        return 0;
    }
}
