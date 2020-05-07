//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(jaxb.JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2020.05.06 um 03:42:28 PM CEST 
//


package data;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the data package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: data
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PowerRecord }
     * 
     */
    public PowerRecord createPowerRecord() {
        return new PowerRecord();
    }

    /**
     * Create an instance of {@link DataEntries }
     * 
     */
    public DataEntries createDataEntries() {
        return new DataEntries();
    }

    /**
     * Create an instance of {@link Customer }
     * 
     */
    public Customer createCustomer() {
        return new Customer();
    }

    /**
     * Create an instance of {@link EnergieDataExport }
     * 
     */
    public EnergieDataExport createEnergieDataExport() {
        return new EnergieDataExport();
    }

    /**
     * Create an instance of {@link CustomerList }
     * 
     */
    public CustomerList createCustomerList() {
        return new CustomerList();
    }

}
