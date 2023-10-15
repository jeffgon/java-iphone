interface ReprodutorMusical {
    void tocarMusica();
    void pausarMusica();
}

interface AparelhoTelefonico {
    void fazerChamada(String numero);
    void receberChamada(String numero);
}

interface NavegadorInternet {
    void abrirPaginaWeb(String url);
    void fecharPaginaWeb();
}

class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void abrirPaginaWeb(String url) {
        System.out.println("Abrindo página: " + url);
    }

    @Override
    public void fecharPaginaWeb() {
        System.out.println("Fechando página web.");
    }

    @Override
    public void fazerChamada(String numero) {
        System.out.println("Fazendo chamada para: " + numero);
    }

    @Override
    public void receberChamada(String numero) {
        System.out.println("Recebendo chamada de: " + numero);
    }

    @Override
    public void tocarMusica() {
        System.out.println("Tocando música.");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Pausando música.");
    }
}
