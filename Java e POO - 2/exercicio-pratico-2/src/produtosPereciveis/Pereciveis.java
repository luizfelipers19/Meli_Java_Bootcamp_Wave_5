package produtosPereciveis;

public class Pereciveis extends Produto
{
    int diasParaVencer;

    public int getDiasParaVencer() {
        return diasParaVencer;
    }

    public void setDiasParaVencer(int diasParaVencer) {
        this.diasParaVencer = diasParaVencer;
    }

    public Pereciveis(int diasParaVencer, double price, String name){
        super(price,name);
        this.diasParaVencer = diasParaVencer;
    }

    @Override
    public double calcular(int quantidadeDeProdutos) {
        double preco = 0;
        if (diasParaVencer == 1){
            preco = (quantidadeDeProdutos * price)/4;
        }
        else if (diasParaVencer == 2){
            preco = (quantidadeDeProdutos * price)/3;
        }
        else if (diasParaVencer == 3){
             preco = (quantidadeDeProdutos * price)/2;
        }
        else{
             preco = quantidadeDeProdutos * price;
        }

        return preco;
    }
}
