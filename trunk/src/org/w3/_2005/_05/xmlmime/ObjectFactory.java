//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.02.04 um 12:22:03 PM CET 
//

package org.w3._2005._05.xmlmime;

import javax.xml.bind.annotation.XmlRegistry;

/**
 * This object contains factory methods for each Java content interface and Java element interface generated in the org.w3._2005._05.xmlmime package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the Java representation for XML content. The Java representation of XML content can consist of schema
 * derived interfaces and classes representing the binding of schema type definitions, element declarations and model groups. Factory methods for each of these are provided in this
 * class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

	/**
	 * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.w3._2005._05.xmlmime
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link Base64Binary }
	 * 
	 */
	public Base64Binary createBase64Binary() {
		return new Base64Binary();
	}

	/**
	 * Create an instance of {@link HexBinary }
	 * 
	 */
	public HexBinary createHexBinary() {
		return new HexBinary();
	}

}
