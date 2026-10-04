public class Main {
    public static void main(String[] args) {
        Notificacao[] notificacoes = new Notificacao[4]; // 3 originais + Push
        notificacoes[0] = new Email();
        notificacoes[1] = new SMS();
        notificacoes[2] = new WhatsApp();
        notificacoes[3] = new NotificacaoPush(); // desafio: mesmo vetor
        for (int i = 0; i < notificacoes.length; i++) { // for não muda
            notificacoes[i].enviar();
        }
    }
}
