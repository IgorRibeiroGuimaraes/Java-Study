package Cadastro_De_Clientes;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Cliente> clientes = new HashSet<>();

        Cliente joao = new Cliente("000000","Joao","7949-444");
        Cliente maria = new Cliente("11111","Maria","2034-333");
        Cliente joaoOliveira = new Cliente("33333","Joao Oliveira","555-555");

        System.out.println(joao);
        System.out.println(maria);
        System.out.println(joaoOliveira);
    }
}
