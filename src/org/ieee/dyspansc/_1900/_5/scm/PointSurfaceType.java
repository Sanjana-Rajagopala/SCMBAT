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
 * <p>Java class for PointSurfaceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PointSurfaceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="point" type="{http://www.ieee.org/DyspanSC/1900/5/SCM}PointType"/>
 *         &lt;element name="antennaHeight" type="{http://www.ieee.org/DyspanSC/1900/5/SCM}AntennaHeightType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointSurfaceType", propOrder = {
    "point",
    "antennaHeight"
})
public class PointSurfaceType {

    @XmlElement(required = true)
    protected PointType point;
    @XmlElement(required = true)
    protected AntennaHeightType antennaHeight;

    /**
     * Gets the value of the point property.
     * 
     * @return
     *     possible object is
     *     {@link PointType }
     *     
     */
    public PointType getPoint() {
        return point;
    }

    /**
     * Sets the value of the point property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointType }
     *     
     */
    public void setPoint(PointType value) {
        this.point = value;
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

}
