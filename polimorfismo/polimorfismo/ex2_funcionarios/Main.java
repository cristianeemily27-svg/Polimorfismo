public class Main {
    public static void main(String[] args) {
        Funcionario f1 = new Professor();
        Funcionario f2 = new Gerente();
        f1.apresentar();
        f2.apresentar();
    }
}
