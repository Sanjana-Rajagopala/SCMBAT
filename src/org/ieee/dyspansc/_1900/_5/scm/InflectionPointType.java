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
 * <p>Java class for InflectionPointType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InflectionPointType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="frequency" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="relativePower" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InflectionPointType", propOrder = {
    "frequency",
    "relativePower"
})
public class InflectionPointType {

    protected double frequency;
    protected double relativePower;

    /**
     * Gets the value of the frequency property.
     * 
     */
    public double getFrequency() {
        return frequency;
    }

    /**
     * Sets the value of the frequency property.
     * 
     */
    public void setFrequency(double value) {
        this.frequency = value;
    }

    /**
     * Gets the value of the relativePower property.
     * 
     */
    public double getRelativePower() {
        return relativePower;
    }

    /**
     * Sets the value of the relativePower property.
     * 
     */
    public void setRelativePower(double value) {
        this.relativePower = value;
    }

}
