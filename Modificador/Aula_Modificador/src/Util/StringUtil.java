package Util;

public class StringUtil {
    //Recebe uma String e a retorna sem caracteres especiais
    public static String removeCaracteresEspeciais(String string){
        return string.replaceAll("[-+.^:,;!#@]","");
    }

    //Converte um valor de double para String aplicando uma máscara de R$

    public static String converteValorFormatado(double valor){
        String valorFormato = String.valueOf(valor);
        return "R$" + valorFormato.replace(".",",");
    }

    //Ocultar email questões de segurança
    public static String mascaraEmail(String email){
        if (!email.isEmpty() && email.contains("@")){
            String[] emailSplit = email.split("@");
            String identificador = emailSplit[0]
                    .substring(0,Math.round(emailSplit[0].length() / 3))
                    .concat("***********@");
            return identificador.concat(emailSplit[1]);
        }
        return null;
    }

}
