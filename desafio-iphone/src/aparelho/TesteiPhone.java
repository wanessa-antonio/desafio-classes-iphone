package aparelho;

public class TesteiPhone {
    public static void main(String[] args) {
        iPhone iphone = new iPhone();

        // Teste do Reprodutor Musical
        ReprodutorMusical reprodutor = iphone;
        reprodutor.tocarMusica();
        reprodutor.pausarMusica();
        reprodutor.selecionarMusica();

        // Teste do Aparelho Telefônico
        AparelhoTelefonico telefone = iphone;
        telefone.ligar();
        telefone.atenderLigacao();
        telefone.iniciarCorreioVoz();

        // Teste do Navegador na Internet
        NavegadorInternet navegador = iphone;
        navegador.exibirPagina();
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();
    }
}