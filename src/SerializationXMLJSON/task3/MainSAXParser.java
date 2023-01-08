package SerializationXMLJSON.task3;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.*;
import java.io.IOException;

public class MainSAXParser {
    public static void main(String[] args) {
        String fileName = "F:\\Programming\\EssentialJavaTests\\HomeWorksJavaPro\\src\\SerializationXMLJSON\\task3\\test1.xml";
        try {
            SAXParserFactory f = SAXParserFactory.newInstance();
            SAXParser saxParser = f.newSAXParser();

            DefaultHandler df = new DefaultHandler() {
                boolean city = false;
                boolean street = false;
                boolean apartaments = false;

                @Override
                public void startElement(String uri, String localName, String qName, Attributes attributes) {
                    if (qName.equalsIgnoreCase("city")) {
                        city = true;
                    }
                    if (qName.equalsIgnoreCase("street")) {
                        street = true;
                    }
                    if (qName.equalsIgnoreCase("apartaments")) {
                        apartaments = true;
                    }
                }

                @Override
                public void characters(char ch[], int start, int length) {
                    if (city) {
                        System.out.println();
                        System.out.println("root element city: " + new String(ch, start, length));
                        city = false;
                    }
                    if (street) {
                        System.out.println("street: " + new String(ch, start, length));
                        street = false;
                    }
                    if (apartaments) {
                        System.out.println("apartametns: " + new String(ch, start, length));
                        apartaments = false;
                    }
                }

            };
            saxParser.parse(fileName, df);

        } catch (ParserConfigurationException | IOException | SAXException e) {
            throw new RuntimeException(e);
        }


    }
}
