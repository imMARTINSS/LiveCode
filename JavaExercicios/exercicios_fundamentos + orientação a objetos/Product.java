
public class Product {
    private final String name;
    private final double price;
    private int quantidade;

    public Product(String name, double price, int quantidade){
        this.name = name;
        this.price = price;
        this.quantidade = quantidade;
    }

    public void addStock(int quantidade){
        this.quantidade += quantidade;

    }

    public boolean removeStock(int quantidade) {
        if (quantidade < 0) {
            System.out.println("Quantidade inválida.");
            return false;
        }

        if (this.quantidade < quantidade) {
            System.out.println("Estoque insuficiente.");
            return false;
        }

        this.quantidade -= quantidade;
        return true;
    }


    public double getTotalEstoque(){
        return quantidade * price;
    }

    public Boolean isEmpty(){
        return quantidade <= 0;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Price: %.2f, Quantidade: %d", name, price, quantidade);
    }

    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public int getQuantidade(){
        return quantidade;
    }



        public static void main(String[] args){
            var arroz = new Product("Arroz", 5, 10);
            arroz.removeStock(5);
            System.out.println(arroz);
            arroz.removeStock(2);
            System.out.println(arroz);
        }

}
