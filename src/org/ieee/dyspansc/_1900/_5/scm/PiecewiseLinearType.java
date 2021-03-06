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
 * <p>Java class for PiecewiseLinearType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PiecewiseLinearType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="firstExponent" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="breakpoint" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="secondExponent" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PiecewiseLinearType", propOrder = {
    "firstExponent",
    "breakpoint",
    "secondExponent"
})
public class PiecewiseLinearType {

    protected double firstExponent;
    protected double breakpoint;
    protected double secondExponent;

    /**
     * Gets the value of the firstExponent property.
     * 
     */
    public double getFirstExponent() {
        return firstExponent;
    }

    /**
     * Sets the value of the firstExponent property.
     * 
     */
    public void setFirstExponent(double value) {
        this.firstExponent = value;
    }

    /**
     * Gets the value of the breakpoint property.
     * 
     */
    public double getBreakpoint() {
        return breakpoint;
    }

    /**
     * Sets the value of the breakpoint property.
     * 
     */
    public void setBreakpoint(double value) {
        this.breakpoint = value;
    }

    /**
     * Gets the value of the secondExponent property.
     * 
     */
    public double getSecondExponent() {
        return secondExponent;
    }

    /**
     * Sets the value of the secondExponent property.
     * 
     */
    public void setSecondExponent(double value) {
        this.secondExponent = value;
    }

}
