//ALuno: Igor Ribeiro Guimarães - 3ºESW

//Exercicio 1
//import java.util.Scanner;

//public class Main {
//
//    public static void main(String[] args) {
//
//
//        String senhaCorreta = "123";
//
//        if (verificarSenha(senhaCorreta)) {
//            System.out.println("Senha correta! Acesso permitido.");
//        }
//        else {
//            System.out.println("Senha incorreta. Acesso negado.");
//        }
//    }
//
//    public static boolean verificarSenha(String senhaCorreta) {
//        Scanner scanner = new Scanner(System.in);
//        int tentativas = 3;
//
//        while (tentativas > 0) {
//            System.out.print("Digite a senha: ");
//            String senhaDigitada = scanner.nextLine();
//
//            if (senhaDigitada.equals(senhaCorreta)){
//                return true;
//            }
//            else {
//                tentativas--;
//                System.out.println("Senha incorreta. Tentativas restantes: " + tentativas);
//            }
//        }
//
//        return false;
//
//    }
//}




// Exercicio 2

//public class Main {
//
//
//    public static void main(String[] args) {
//        int frase = contarPalavras("Hello word");
//        System.out.println(frase );
//    }
//    public static int contarPalavras(String frase){
//       if (frase == null || frase.isEmpty()){
//            return 0;
//        }
//
//        String [] palavaras = frase.split("\\s+");
//        return palavaras.length;
//    }
//}

//Exercicio 3
//public class Main {
//
//    public static void main(String[] args){
//
//        int name = contarCaracteres("Igor");
//        System.out.println(name);
//    }
//    public static int contarCaracteres(String str) {
//        if (str == null || str.isEmpty()) {
//            return 0;
//        }
//
//        return str.length();
//    }
//}

//Exercicio 4
//public class Main {
//    public static void main(String[] args){
//        String words = trocarEspaços("Três tigres tristes para três pratos de trigo. Três pratos de trigo para três tigres tristes");
//        System.out.println(words);
//    }
//    public static String trocarEspaços(String str){
//        if (str == null || str.isEmpty()){
//            return null;
//        }
//        return  str.replaceAll("\\s+", "|");
//    }
//}

//Exercicio 5
//public class Main{
//    public static void main(String[] args){
//        String minhaString = "Olá, mundo!";
//        int quantidadeDeVogais = contarVogais(minhaString);
//        System.out.println("Quantidade de vogais na string: " + quantidadeDeVogais);
//    }
//    public static int contarVogais(String str) {
//        int count = 0;
//        for (int i = 0; i < str.length(); i++) {
//            char c = str.charAt(i);
//            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
//                    || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
//                count++;
//            }
//        }
//        return count;
//    }
//}


