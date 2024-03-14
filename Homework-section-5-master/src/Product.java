public class Product {
    private String ProductName;
    private int price;
    private String Category;
    private int Stock;

    //-------------------------------------------------//
    public Product() {

    }

    //-------------------------------------------------//
    public Product(String productName, int price, String category, int stock) {
        ProductName = productName;
        this.price = price;
        Category = category;
        Stock = stock;
    }

    //-------------------------------------------------//
    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }
    //-------------------------------------------------//
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    //-------------------------------------------------//
    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }
    //-------------------------------------------------//
    public int getStock() {
        return Stock;
    }

    public void setStock(int stock) {
        Stock = stock;
    }
    //-------------------------------------------------//
}
