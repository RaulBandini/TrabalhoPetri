public class No {
    String conteudo;
    No prox;

    public No(String conteudo) {
        this.conteudo = conteudo;
        this.prox = null;
    }
    public No getProx() {
        return prox;
    }

    public void setProx(No prox) {
        this.prox = prox;
    }

    public String getConteudo() {
        return this.conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
}
