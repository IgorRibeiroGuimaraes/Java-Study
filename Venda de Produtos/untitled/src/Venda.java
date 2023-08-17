import java.util.ArrayList;
import java.util.List;
public class Venda {
    private String docClint;
    private String data;
    private String hora;
    private List<ItemVenda> itens;

    public Venda(String docClint, String data, String hora) {
        this.docClint = docClint;
        this.data = data;
        this.hora = hora;
        this.itens = new ArrayList<>();
    }

    public String getDocClint() {
        return docClint;
    }

    public void setDocClint(String docClint) {
        this.docClint = docClint;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }


}
