import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int CustomerNumber;
    private String Name;
    private String Surname;
    private int Age;
    List<Order> orderList = new ArrayList<>();

    //-------------------------------------------------//
    public Customer() {

    }

    public Customer(int customerNumber, String name, String surname, int age, List<Order> orderList) {
        CustomerNumber = customerNumber;
        Name = name;
        Surname = surname;
        Age = age;
        this.orderList = orderList;
    }

    //-------------------------------------------------//
    @Override
    public String toString() {
        return "Customer{" +
                "CustomerNumber=" + CustomerNumber +
                ", Name='" + Name + '\'' +
                ", Surname='" + Surname + '\'' +
                ", Age=" + Age +
                ", orderList=" + orderList +
                '}';
    }

    //-------------------------------------------------//
    public int getCustomerNumber() {
        return CustomerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        CustomerNumber = customerNumber;
    }
    //-------------------------------------------------//
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
    //-------------------------------------------------//

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }
    //-------------------------------------------------//
    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }
    //-------------------------------------------------//
    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }
    //-------------------------------------------------//
}
