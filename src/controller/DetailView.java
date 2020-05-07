package controller;

import data.CustomerList;
import data.DataEntries;
import data.PowerRecord;
import jaxb.JAXB;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.view.ViewScoped;
import java.io.Serializable;

@ManagedBean(name="DetailView")
@ViewScoped
public class DetailView implements Serializable {

    private CustomerList customers = new CustomerList();
    private DataEntries dataEntries = new DataEntries();

    private static final JAXB jaxb = new JAXB("C://Schule//5BHIF//Java//Uebung_Pruefung//energie.xml");

    @ManagedProperty(value = "#{param.customerId}")
    private int customerId;

    @PostConstruct
    public void init() {
        customers = jaxb.getEnergie().getCustomerList();

        dataEntries = customers.getCustomer().get(customerId).getDataEntries();
    }

    public DataEntries getDataEntries() {
        return dataEntries;
    }

    public CustomerList getCustomers() {
        return customers;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
}
