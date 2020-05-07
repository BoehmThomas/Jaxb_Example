package controller;

import data.Customer;
import data.CustomerList;
import data.DataEntries;
import jaxb.JAXB;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import java.io.Serializable;

@ManagedBean(name = "addView")
@RequestScoped
public class AddView implements Serializable {

    @ManagedProperty(value = "#{CustomerView}")
    private CustomerView customerView;

    private DataEntries dataEntries = new DataEntries();

    private String firstName;
    private String lastName;

    public void addCustomer() {
        int id = customerView.getCustomers().getCustomer().size();
        Customer c = new Customer();
        c.setFirstName(firstName);
        c.setLastName(lastName);
        c.setId(id);
        customerView.getCustomers().getCustomer().add(c);
        System.out.println(customerView.getCustomers().getCustomer().get(id).getFirstName());
    }

    public CustomerView getCustomerView() {
        return customerView;
    }

    public void setCustomerView(CustomerView customerView) {
        this.customerView = customerView;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public DataEntries getDataEntries() {
        return dataEntries;
    }

}
