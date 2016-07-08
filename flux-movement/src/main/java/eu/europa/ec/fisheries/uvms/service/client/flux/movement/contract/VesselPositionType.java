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
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.07.08 at 11:04:40 fm CEST 
//


package eu.europa.ec.fisheries.uvms.service.client.flux.movement.contract;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for VesselPositionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VesselPositionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Obtained" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:13}DateTimeType"/>
 *         &lt;element name="Speed" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:13}MeasureType" minOccurs="0"/>
 *         &lt;element name="Course" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:13}MeasureType" minOccurs="0"/>
 *         &lt;element name="Type" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:13}CodeType"/>
 *         &lt;element name="Position" type="{urn:xeu:ec:fisheries:flux-bl:FLUXVesselPosition:1:1}FLUXGeographicalCoordinateType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VesselPositionType", namespace = "urn:xeu:ec:fisheries:flux-bl:FLUXVesselPosition:1:1", propOrder = {
    "obtained",
    "speed",
    "course",
    "type",
    "position"
})
public class VesselPositionType {

    @XmlElement(name = "Obtained", required = true)
    protected XMLGregorianCalendar obtained;
    @XmlElement(name = "Speed")
    protected MeasureType speed;
    @XmlElement(name = "Course")
    protected MeasureType course;
    @XmlElement(name = "Type", required = true)
    protected CodeType type;
    @XmlElement(name = "Position", required = true)
    protected FLUXGeographicalCoordinateType position;

    /**
     * Gets the value of the obtained property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getObtained() {
        return obtained;
    }

    /**
     * Sets the value of the obtained property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setObtained(XMLGregorianCalendar value) {
        this.obtained = value;
    }

    /**
     * Gets the value of the speed property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getSpeed() {
        return speed;
    }

    /**
     * Sets the value of the speed property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setSpeed(MeasureType value) {
        this.speed = value;
    }

    /**
     * Gets the value of the course property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getCourse() {
        return course;
    }

    /**
     * Sets the value of the course property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setCourse(MeasureType value) {
        this.course = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setType(CodeType value) {
        this.type = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link FLUXGeographicalCoordinateType }
     *     
     */
    public FLUXGeographicalCoordinateType getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link FLUXGeographicalCoordinateType }
     *     
     */
    public void setPosition(FLUXGeographicalCoordinateType value) {
        this.position = value;
    }

}