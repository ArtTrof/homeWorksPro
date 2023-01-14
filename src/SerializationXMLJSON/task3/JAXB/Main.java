package SerializationXMLJSON.task3.JAXB;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.catalog.Catalog;
import java.io.File;

public class Main {
    public static void main(String[] args) throws JAXBException {
        AddressList adress = new AddressList();
        adress.add(new City("Kiev","big","Podol","18/6"));
        adress.add(new City("Lviv","small","Shokoladna","18/6"));
        File file = new File("F:\\Programming\\EssentialJavaTests\\HomeWorksJavaPro\\src\\SerializationXMLJSON\\task3\\JAXB\\test.xml");

        JAXBContext jaxbContext = JAXBContext.newInstance(AddressList.class);

        Marshaller marshaller = jaxbContext.createMarshaller();

        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);

        marshaller.marshal(adress,file);
        marshaller.marshal(adress,System.out);

        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

        adress =(AddressList)unmarshaller.unmarshal(file);

        System.out.println(adress);

    }
}
