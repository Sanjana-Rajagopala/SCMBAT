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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SCMPropagationMapType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SCMPropagationMapType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="propMap" type="{http://www.ieee.org/DyspanSC/1900/5/SCM}PropMapType"/>
 *         &lt;element name="antennaHeight" type="{http://www.ieee.org/DyspanSC/1900/5/SCM}AntennaHeightType" minOccurs="0"/>
 *         &lt;element name="locationIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="confidence" type="{http://www.ieee.org/DyspanSC/1900/5/SCM}ConfidenceType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SCMPropagationMapType", propOrder = {
    "propMap",
    "antennaHeight",
    "locationIndex",
    "confidence"
})
public class SCMPropagationMapType {

    @XmlElement(required = true)
    protected PropMapType propMap;
    protected AntennaHeightType antennaHeight;
    protected Integer locationIndex;
    protected ConfidenceType confidence;

    /**
     * Gets the value of the propMap property.
     * 
     * @return
     *     possible object is
     *     {@link PropMapType }
     *     
     */
    public PropMapType getPropMap() {
        return propMap;
    }

    /**
     * Sets the value of the propMap property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropMapType }
     *     
     */
    public void setPropMap(PropMapType value) {
        this.propMap = value;
    }

    /**
     * Gets the value of the antennaHeight property.
     * 
     * @return
     *     possible object is
     *     {@link AntennaHeightType }
     *     
     */
    public AntennaHeightType getAntennaHeight() {
        return antennaHeight;
    }

    /**
     * Sets the value of the antennaHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link AntennaHeightType }
     *     
     */
    public void setAntennaHeight(AntennaHeightType value) {
        this.antennaHeight = value;
    }

    /**
     * Gets the value of the locationIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLocationIndex() {
        return locationIndex;
    }

    /**
     * Sets the value of the locationIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLocationIndex(Integer value) {
        this.locationIndex = value;
    }

    /**
     * Gets the value of the confidence property.
     * 
     * @return
     *     possible object is
     *     {@link ConfidenceType }
     *     
     */
    public ConfidenceType getConfidence() {
        return confidence;
    }

    /**
     * Sets the value of the confidence property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfidenceType }
     *     
     */
    public void setConfidence(ConfidenceType value) {
        this.confidence = value;
    }

}
