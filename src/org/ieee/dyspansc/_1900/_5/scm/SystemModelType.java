/*
Copyright (C) 2016 Syracuse University

This file is part of the Spectrum Consumption Model Builder and
Analysis Tool

This program is free software; you can redistribute it and/or modify it
under the terms of the GNU General Public License as published by the
Free Software Foundation; either version 3 of the License, or (at your
option) any later version.

This program is distributed in the hope that it will be useful, but WITHOUT
ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
for more details.

You should have received a copy of the GNU General Public License
along with program.  If not, see <http://www.gnu.org/licenses/>.

*/

package org.ieee.dyspansc._1900._5.scm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SystemModelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SystemModelType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="systemID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="boundary" type="{http://www.ieee.org/DyspanSC/1900/5/SCM}BoundaryType" minOccurs="0"/>
 *         &lt;element name="uberModel" type="{http://www.ieee.org/DyspanSC/1900/5/SCM}UberModelType" minOccurs="0"/>
 *         &lt;element name="txModel" type="{http://www.ieee.org/DyspanSC/1900/5/SCM}TxModelType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="rxModel" type="{http://www.ieee.org/DyspanSC/1900/5/SCM}RxModelType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="purpose">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="AUTHORIZATION"/>
 *             &lt;enumeration value="CONSTRAINT"/>
 *             &lt;enumeration value="CONSUMPTION"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemModelType", propOrder = {
    "systemID",
    "name",
    "boundary",
    "uberModel",
    "txModel",
    "rxModel"
})
public class SystemModelType {

    @XmlElement(required = true)
    protected String systemID;
    protected String name;
    protected BoundaryType boundary;
    protected UberModelType uberModel;
    protected List<TxModelType> txModel;
    protected List<RxModelType> rxModel;
    @XmlAttribute(name = "purpose")
    protected String purpose;

    /**
     * Gets the value of the systemID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemID() {
        return systemID;
    }

    /**
     * Sets the value of the systemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemID(String value) {
        this.systemID = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the boundary property.
     * 
     * @return
     *     possible object is
     *     {@link BoundaryType }
     *     
     */
    public BoundaryType getBoundary() {
        return boundary;
    }

    /**
     * Sets the value of the boundary property.
     * 
     * @param value
     *     allowed object is
     *     {@link BoundaryType }
     *     
     */
    public void setBoundary(BoundaryType value) {
        this.boundary = value;
    }

    /**
     * Gets the value of the uberModel property.
     * 
     * @return
     *     possible object is
     *     {@link UberModelType }
     *     
     */
    public UberModelType getUberModel() {
        return uberModel;
    }

    /**
     * Sets the value of the uberModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link UberModelType }
     *     
     */
    public void setUberModel(UberModelType value) {
        this.uberModel = value;
    }

    /**
     * Gets the value of the txModel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the txModel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxModel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TxModelType }
     * 
     * 
     */
    public List<TxModelType> getTxModel() {
        if (txModel == null) {
            txModel = new ArrayList<TxModelType>();
        }
        return this.txModel;
    }

    /**
     * Gets the value of the rxModel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rxModel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRxModel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RxModelType }
     * 
     * 
     */
    public List<RxModelType> getRxModel() {
        if (rxModel == null) {
            rxModel = new ArrayList<RxModelType>();
        }
        return this.rxModel;
    }

    /**
     * Gets the value of the purpose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurpose() {
        return purpose;
    }

    /**
     * Sets the value of the purpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurpose(String value) {
        this.purpose = value;
    }

}
