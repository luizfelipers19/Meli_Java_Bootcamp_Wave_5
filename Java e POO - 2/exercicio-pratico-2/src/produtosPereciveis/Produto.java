package produtosPereciveis;

public class Produto {
    String name;
    double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Produto(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double calcular(int quantidadeDeProdutos){
        return quantidadeDeProdutos * price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}