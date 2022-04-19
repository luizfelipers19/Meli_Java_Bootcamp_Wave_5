package produtosPereciveis;


public class Distribuidora {

    public static void main(String[] args) {

        Produto[] produtos = new Produto[5];

        produtos[0] = new Produto("OMO", 13.99);
        produtos[1] = new Produto("Dolly", 4.19);
        produtos[2] = new Pereciveis(3,10.00, "Maçã");
        produtos[3] = new Pereciveis(4,20.00, "Banana");
        produtos[4] = new NaoPereciveis("Papel Higiênico", 50.99, "higiene");

        System.out.println(produtos[0].toString() + "O preco total da venda desses dois produtos foi de: " + produtos[0].calcular(2));
        System.out.println(produtos[1].toString() + "O preco total da venda desses três produtos foi de: " + produtos[1].calcular(3));
        System.out.println(produtos[2].toString() + "O preco total da venda desses dois produtos foi de: " + produtos[2].calcular(2));
        System.out.println(produtos[3].toString() + "O preco total da venda desses dois produtos foi de: " + produtos[3].calcular(2));
        System.out.println(produtos[4].toString() + "O preco total da venda desses dois produtos foi de: " + produtos[4].calcular(2));


    }
}
