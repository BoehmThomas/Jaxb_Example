package jaxb;

import data.EnergieDataExport;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class JAXB {
    private final String filePath;

    private EnergieDataExport energie;

    public JAXB(String filePath){
        this.filePath = filePath;
        unMarshall();
    }

    private void unMarshall() {
        try {
            File file = new File(filePath);
            JAXBContext jaxbContext = JAXBContext.newInstance(EnergieDataExport.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            energie = (EnergieDataExport) jaxbUnmarshaller.unmarshal(file);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public EnergieDataExport getEnergie(){
        return energie;
    }
}
