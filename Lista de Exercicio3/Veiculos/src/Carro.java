public class Carro {
    public int ano;
    public double valor;
    public String modelo;

    public Carro(int ano, double valor, String modelo) {
        this.ano = ano;
        this.valor = valor;
        this.modelo = modelo;
    }

    public double calcIPVA(double taxa) { return this.valor * taxa; }

    public boolean verificarAno(){
        int anoAtual = 2023;

        if ((anoAtual - this.ano) > 20){
            return false;
        }
        return true;
    }



}
