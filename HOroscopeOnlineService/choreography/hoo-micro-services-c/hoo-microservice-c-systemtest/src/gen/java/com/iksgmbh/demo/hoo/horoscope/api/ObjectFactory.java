//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2017.05.03 um 08:51:26 AM CEST 
//


package com.iksgmbh.demo.hoo.horoscope.api;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.iksgmbh.demo.hoo.horoscope.api package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.iksgmbh.demo.hoo.horoscope.api
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateHoroscopeRequest }
     * 
     */
    public CreateHoroscopeRequest createCreateHoroscopeRequest() {
        return new CreateHoroscopeRequest();
    }

    /**
     * Create an instance of {@link HOOHoroscopeRequest }
     * 
     */
    public HOOHoroscopeRequest createHOOHoroscopeRequest() {
        return new HOOHoroscopeRequest();
    }

    /**
     * Create an instance of {@link HOOHoroscopeResponse }
     * 
     */
    public HOOHoroscopeResponse createHOOHoroscopeResponse() {
        return new HOOHoroscopeResponse();
    }

    /**
     * Create an instance of {@link Horoscope }
     * 
     */
    public Horoscope createHoroscope() {
        return new Horoscope();
    }

}
