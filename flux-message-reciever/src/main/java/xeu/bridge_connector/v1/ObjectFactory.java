/*
﻿Developed with the contribution of the European Commission - Directorate General for Maritime Affairs and Fisheries
© European Union, 2015-2016.

This file is part of the Integrated Fisheries Data Management (IFDM) Suite. The IFDM Suite is free software: you can
redistribute it and/or modify it under the terms of the GNU General Public License as published by the
Free Software Foundation, either version 3 of the License, or any later version. The IFDM Suite is distributed in
the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details. You should have received a
copy of the GNU General Public License along with the IFDM Suite. If not, see <http://www.gnu.org/licenses/>.
 */
package xeu.bridge_connector.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the xeu.bridge_connector.v1 package. 
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

    private final static QName _Connector2BridgeResponse_QNAME = new QName("urn:xeu:bridge-connector:v1", "Connector2BridgeResponse");
    private final static QName _Connector2BridgeRequest_QNAME = new QName("urn:xeu:bridge-connector:v1", "Connector2BridgeRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: xeu.bridge_connector.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ResponseType }
     * 
     */
    public ResponseType createResponseType() {
        return new ResponseType();
    }

    /**
     * Create an instance of {@link RequestType }
     * 
     */
    public RequestType createRequestType() {
        return new RequestType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:xeu:bridge-connector:v1", name = "Connector2BridgeResponse")
    public JAXBElement<ResponseType> createConnector2BridgeResponse(ResponseType value) {
        return new JAXBElement<ResponseType>(_Connector2BridgeResponse_QNAME, ResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:xeu:bridge-connector:v1", name = "Connector2BridgeRequest")
    public JAXBElement<RequestType> createConnector2BridgeRequest(RequestType value) {
        return new JAXBElement<RequestType>(_Connector2BridgeRequest_QNAME, RequestType.class, null, value);
    }

}