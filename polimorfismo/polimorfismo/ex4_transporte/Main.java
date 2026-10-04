public class Main {
    public static void main(String[] args) {
        Transporte[] transportes = new Transporte[3];
        transportes[0] = new Onibus();
        transportes[1] = new Aviao();
        transportes[2] = new Navio();
        for (int i = 0; i < transportes.length; i++) {
            transportes[i].iniciarViagem();
        }
    }
}
