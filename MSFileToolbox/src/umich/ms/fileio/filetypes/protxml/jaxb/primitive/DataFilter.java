/* 
 * Copyright 2016 Dmitry Avtonomov.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package umich.ms.fileio.filetypes.protxml.jaxb.primitive;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="number" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="parent_file" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="windows_parent" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class DataFilter {

    @XmlAttribute(name = "number", required = true)
    protected String number;
    @XmlAttribute(name = "parent_file", required = true)
    protected String parentFile;
    @XmlAttribute(name = "windows_parent")
    protected String windowsParent;
    @XmlAttribute(name = "description", required = true)
    protected String description;

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the parentFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentFile() {
        return parentFile;
    }

    /**
     * Sets the value of the parentFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentFile(String value) {
        this.parentFile = value;
    }

    /**
     * Gets the value of the windowsParent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWindowsParent() {
        return windowsParent;
    }

    /**
     * Sets the value of the windowsParent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWindowsParent(String value) {
        this.windowsParent = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
