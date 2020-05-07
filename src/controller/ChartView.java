package controller;

import data.CustomerList;
import data.DataEntries;
import data.PowerRecord;
import jaxb.JAXB;
import org.primefaces.model.chart.PieChartModel;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.view.ViewScoped;
import java.io.Serializable;

@ManagedBean(name="ChartView")
@ViewScoped
public class ChartView implements Serializable {

    private CustomerList customers = new CustomerList();
    private DataEntries dataEntries = new DataEntries();
    private PieChartModel pieModel;

    private static final JAXB jaxb = new JAXB("C://Schule//5BHIF//Java//Uebung_Pruefung//energie.xml");

    @ManagedProperty(value = "#{param.customerId}")
    private int customerId;

    @PostConstruct
    public void init() {
        customers = jaxb.getEnergie().getCustomerList();

        dataEntries = customers.getCustomer().get(customerId).getDataEntries();
        createPieModel();
    }

    private void createPieModel() {
        pieModel = new PieChartModel();

        for(int i = 0; i < dataEntries.getContent().size(); i++) {
            pieModel.set(dataEntries.getContent().get(i).getPower(), dataEntries.getContent().get(i).getSellingUser());
        }

        pieModel.setTitle("DataEntries");
        pieModel.setLegendPosition("w");
        pieModel.setShadow(false);
    }

    public PieChartModel getPieModel() {
        return pieModel;
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
