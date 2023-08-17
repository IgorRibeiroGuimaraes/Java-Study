public class Main {
    public static void main(String[] args) {
        int a = 5;

        if (a % 3 == 0 && a % 5 == 0) {
            System.out.println("por 3 e 5");
        } else if (a % 3 == 0) {
            System.out.println("apenas por 3");
        } else if (a % 5 == 0) {
            System.out.println("Apenas por 5");
        } else {
            System.out.println("Por nenhum dos dois");
        }
    }
}