package produtosPereciveis;

public class NaoPereciveis extends Produto{

    String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public NaoPereciveis(String name, double price, String tipo) {
        super(name, price);
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "NaoPereciveis{" +
                "tipo='" + tipo + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
