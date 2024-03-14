import java.util.ArrayList;
import java.util.List;

public class Order {
    private int OrderNumber;
    private Invoice invoice;
    List<Product> productList = new ArrayList<>();

    //-------------------------------------------------//
    public Order() {

    }
    //-------------------------------------------------//
    public Order(int orderNumber, Invoice invoice, List<Product> productList) {
        OrderNumber = orderNumber;
        this.invoice = invoice;
        this.productList = productList;
    }

    //-------------------------------------------------//
    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    //-------------------------------------------------//


    //-------------------------------------------------//
    public int getOrderNumber() {
        return OrderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        OrderNumber = orderNumber;
    }
    //-------------------------------------------------//

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
    //-------------------------------------------------//
}
