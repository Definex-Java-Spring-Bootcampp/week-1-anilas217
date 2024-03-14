import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Computer",2000,"Electronic",40);
        Product product2 = new Product("Phone",1600,"Electroinc",30);
        Product product3 = new Product("Tshirt",100,"Cloth",70);
        Product product4 = new Product("Shirt",50,"Cloth",90);

        List<Product> productListforcustomer1 = new ArrayList<>();
        List<Order> orderListforcustomer1 = new ArrayList<>();

        List<Product> productListforcustomer2 = new ArrayList<>();
        List<Order> orderListforcustomer2 = new ArrayList<>();

        List<Product> productListforcustomer3 = new ArrayList<>();
        List<Order> orderListforcustomer3 = new ArrayList<>();

        List<Customer> Customerlist = new ArrayList<>();
        Customer customer1 = new Customer(1,"Anil","Arslan",26,null);
        Customer customer2 = new Customer(2,"Cem","Dirman",28,null);
        Customer customer3 = new Customer(3,"Gökhan","Tok",31,null);

        /*
        In here if customer want to take a order I can write a method and code -->
         */

        // For the customer 1 //
        Invoice invoice1 = new Invoice(1,"Credit");


        if (stockcheck(product1)){
            product1.setStock(product1.getStock() - 1);
            productListforcustomer1.add(product1);
            Order order = new Order(1,invoice1, productListforcustomer1);
            orderListforcustomer1.add(order);
        }
        if (stockcheck(product2)){
            product2.setStock(product2.getStock() - 1);
            productListforcustomer1.add(product2);
            Order order = new Order(2,invoice1, productListforcustomer1);
            orderListforcustomer1.add(order);
            customer1.setOrderList(orderListforcustomer1);
        }
        Customerlist.add(customer1);

        // For the customer 2 //
        Invoice invoice2 = new Invoice(2,"Debit");

        if (stockcheck(product3)){
            product3.setStock(product3.getStock() - 1);
            productListforcustomer2.add(product3);
            Order order = new Order(3,invoice2, productListforcustomer2);
            orderListforcustomer2.add(order);
        }
        if (stockcheck(product4)){
            product4.setStock(product4.getStock() - 1);
            productListforcustomer2.add(product4);
            Order order = new Order(4,invoice2, productListforcustomer2);
            orderListforcustomer2.add(order);
        }
        if (stockcheck(product2)){
            product2.setStock(product2.getStock() - 1);
            productListforcustomer2.add(product2);
            Order order = new Order(5,invoice2, productListforcustomer2);
            orderListforcustomer2.add(order);
            customer2.setOrderList(orderListforcustomer2);
        }
        Customerlist.add(customer2);
        // For the customer 3 //

        Invoice invoice3 = new Invoice(3,"Credit");

        if (stockcheck(product3)){
            product3.setStock(product3.getStock() - 1);
            productListforcustomer3.add(product3);
            Order order = new Order(3,invoice3, productListforcustomer3);
            orderListforcustomer3.add(order);
        }
        if (stockcheck(product4)){
            product4.setStock(product4.getStock() - 1);
            productListforcustomer3.add(product4);
            Order order = new Order(4,invoice3, productListforcustomer3);
            orderListforcustomer3.add(order);
        }
        if (stockcheck(product1)){
            product4.setStock(product1.getStock() - 1);
            productListforcustomer3.add(product1);
            Order order = new Order(4,invoice3, productListforcustomer3);
            orderListforcustomer3.add(order);
        }
        if (stockcheck(product2)){
            product2.setStock(product2.getStock() - 1);
            productListforcustomer3.add(product3);
            Order order = new Order(5,invoice3, productListforcustomer3);
            orderListforcustomer3.add(order);
            customer3.setOrderList(orderListforcustomer3);
        }
        Customerlist.add(customer3);


        Checkallcustomer(Customerlist);
        CheckOrderVianameiscem(Customerlist);
        CheckTotalPriceVianameisCem(Customerlist);
        Listofmorethan1500(Customerlist);



    }

    private static void Listofmorethan1500(List<Customer> customerlist) {

        for (Customer customer : customerlist) {
            List<Order> orderlist = customer.getOrderList();
            int totalamount = 0;
            for (Order order : orderlist){
                Invoice invoice = order.getInvoice();
                List<Product> prdocutlist = order.getProductList();
                for (Product product : prdocutlist){
                    totalamount += product.getPrice();
                }
                if (totalamount >=1500){
                    System.out.println("Invoice number is: "+invoice.getInvoiceNumber()+" Invoice type is: "+invoice.getInvoiceTpe()+" Total amount is: "+totalamount);
                }
                break;
            }
        }

    }

    private static void CheckTotalPriceVianameisCem(List<Customer> customerlist) {
        int totalamount =0;
        for (Customer customer : customerlist) {
            if ("Cem".equals(customer.getName()) && customer.getAge() >= 25 && customer.getAge() <= 30) {
                List<Order> orderlistofcustomerCem = customer.getOrderList();
                for (Order order : orderlistofcustomerCem){
                    List<Product> prodcutlistofcustomercem = order.getProductList();
                    for (Product product:prodcutlistofcustomercem){
                        totalamount +=product.getPrice();
                    }
                    break;
                }
            }
        }
        System.out.println("Total purchase amount of customers whose name is Cem and whose age is younger than 30 and older than 25 total price is: "+totalamount);
    }

    private static void CheckOrderVianameiscem(List<Customer> customerlist) {
        for (Customer customer : customerlist) {
            if ("Cem".equals(customer.getName())) {
                List<Order> orderlistofcustomer = customer.getOrderList();
                System.out.println("The number of orders placed by the person whose name is cem: "+orderlistofcustomer.size());
            }
        }
    }

    private static void Checkallcustomer(List<Customer> customerlist) {
        long size = customerlist.stream().count();
        System.out.println("Customer list size: " + size);
    }

    private static boolean stockcheck(Product product1) {
        if (product1.getStock() != 0){
            return true;
        }
        else {
            return false;
        }

    }


}