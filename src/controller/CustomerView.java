package controller;

import data.CustomerList;
import jaxb.JAXB;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.view.ViewScoped;
import java.io.Serializable;

@ManagedBean(name="CustomerView")
@SessionScoped
public class CustomerView implements Serializable {

    private CustomerList customers = new CustomerList();

    private static final JAXB jaxb = new JAXB("C://Schule//5BHIF//Java//Uebung_Pruefung//energie.xml");

    @PostConstruct
    public void init() {
        customers = jaxb.getEnergie().getCustomerList();

    }

    public CustomerList getCustomers() {
        return customers;
    }
}
