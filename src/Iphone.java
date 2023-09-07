public class Iphone implements Internet, Música, Telefone{
    @Override
    public void exibirPagina() {
        Internet.super.exibirPagina();
    }

    @Override
    public void adicionarNovaAba() {
        Internet.super.adicionarNovaAba();
    }

    @Override
    public void atualizarNovaPagina() {
        Internet.super.atualizarNovaPagina();
    }

    @Override
    public void tocar() {
        Música.super.tocar();
    }

    @Override
    public void pausar() {
        Música.super.pausar();
    }

    @Override
    public void reproduzirMusica() {
        Música.super.reproduzirMusica();
    }

    @Override
    public void ligar() {
        Telefone.super.ligar();
    }

    @Override
    public void atender() {
        Telefone.super.atender();
    }

    @Override
    public void iniciarCorreioDeVoz() {
        Telefone.super.iniciarCorreioDeVoz();
    }
}
