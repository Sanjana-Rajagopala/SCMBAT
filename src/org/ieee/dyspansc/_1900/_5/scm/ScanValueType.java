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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScanValueType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScanValueType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="elevation">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
 *               &lt;minExclusive value="-90"/>
 *               &lt;maxExclusive value="90"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="azimuth">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
 *               &lt;minExclusive value="0"/>
 *               &lt;maxExclusive value="360"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="activeDirection" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScanValueType", propOrder = {
    "elevation",
    "azimuth",
    "activeDirection"
})
public class ScanValueType {

    protected Double elevation;
    protected Double azimuth;
    protected Boolean activeDirection;

    /**
     * Gets the value of the elevation property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getElevation() {
        return elevation;
    }

    /**
     * Sets the value of the elevation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setElevation(Double value) {
        this.elevation = value;
    }

    /**
     * Gets the value of the azimuth property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAzimuth() {
        return azimuth;
    }

    /**
     * Sets the value of the azimuth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAzimuth(Double value) {
        this.azimuth = value;
    }

    /**
     * Gets the value of the activeDirection property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActiveDirection() {
        return activeDirection;
    }

    /**
     * Sets the value of the activeDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActiveDirection(Boolean value) {
        this.activeDirection = value;
    }

}
