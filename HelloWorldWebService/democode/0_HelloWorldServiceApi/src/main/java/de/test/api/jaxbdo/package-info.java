/**
 * The domain object classes in these packages ensure
 * having the XmlRootElement annotation.
 * 
 * The classes in this package are derived from those that are autogenerated from JAXB
 * based on the domain objects modelled in src/main/resources/HelloWorldService.xsd.
 * However, they currently are defined in the xsd as complexType not als element.
 * This is so due to the fact an JAXB element definition in the xsd leads to
 * problems when using the same xsd in the wsdl of the SoapService.
 * 
 * However, the JAXB element definition of the domain objects is essential
 * for using those objects in the RestService. For that purpose the XmlRootElement
 * is added in the classes here.
 */
package de.test.api.jaxbdo;

