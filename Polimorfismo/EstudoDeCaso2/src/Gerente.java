import com.sun.jdi.FloatValue;

public class Gerente extends Funcionario implements Bonificacao{
    private float valor;
    public Gerente(int id, String nome, float salaraio, float valor) {
        super(id, nome, salaraio);
        this.valor = valor;
    }


    @Override
    public float boniFuncionario(){
        return this.getSalaraio() + (0.05f * valor);
    }

    @Override
    public String toString(){
        return Float.toString(boniFuncionario());
    }
}
