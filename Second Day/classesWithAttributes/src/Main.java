public class Main {

    public static void main(String[] args) {

        Product product = new Product();
        Product product1 = new Product(21,"Cell Phone","Redmi Note 9", 3000,150,"Black");
        product.setName("Mobile Phone");
        product.setId(2121);
        product.setDescription("Redmi Note 8");
        product.setPrice(4000);
        product.setStockAmount(100);
        product.getCode();

        ProductManager productManager = new ProductManager();
        productManager.add(product);
        System.out.println(product.getCode());
    }
}
