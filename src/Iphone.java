public class Iphone implements ReprodutoMusical, AparelhoTelefonico, NavegadorInternet{
    @Override
    public void ligar(String numero) {
        System.out.println("LIGANDO");
    }

    @Override
    public void atender(String numero) {
        System.out.println("ATENDENDO");
    }

    @Override
    public void iniciarCorreioVoz(String mensagem, String destinatario) {

    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("EXIBINDO PAGINA");
    }

    @Override
    public void adicionarNovaAba(String url) {
        System.out.println("ADICIONANDO NOVA ABA");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO PAGINA");
    }

    @Override
    public void tocar() {
        System.out.println("TOCANDO");
    }

    @Override
    public void pausar() {
        System.out.println("PAUSANDO");
    }

    @Override
    public void selecionarMusica() {
    }
}
