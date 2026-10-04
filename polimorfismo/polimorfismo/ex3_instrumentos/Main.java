public class Main {
    public static void main(String[] args) {
        Instrumento[] instrumentos = { new Violao(), new Piano(), new Bateria() };
        for (int i = 0; i < instrumentos.length; i++) {
            instrumentos[i].tocar();
        }
    }
}
