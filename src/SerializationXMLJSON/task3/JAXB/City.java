package SerializationXMLJSON.task3.JAXB;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@XmlRootElement(name = "city")
public class City {

    private String size;
    private String city,street,apartaments;
    public City(){}

    public City(String city,String size,String street, String apartaments) {
        this.city = city;
        this.size=size;
        this.street = street;
        this.apartaments = apartaments;
    }
    @Override
    public String toString(){
        return "["+size+" "+street +" " + apartaments +"]";
    }

    public String getStreet() {
        return street;
    }
    @XmlElement(name = "street")
    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }
    @XmlElement(name = "city")
    public void setCity(String city) {
        this.city = city;
    }

    public String getSize() {
        return size;
    }
    @XmlAttribute
    public void setSize(String size) {
        this.size = size;
    }

    public String getApartaments() {
        return apartaments;
    }
    @XmlElement(name = "apartaments")
    public void setApartaments(String apartaments) {
        this.apartaments = apartaments;
    }


}
