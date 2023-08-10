package com.example.form.domain;

import javax.persistence.*;

@Entity
public class Element {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false)
    private long element_id;

    @Column(name = "code", nullable = false, unique = true)
    private String elementCode1;

    @Column(name = "name", nullable = false)
    private String elementName;

    @Column(name = "type", nullable = false)
    private String elementType;

    public Element() {
    }

    public Element(String elementCode, String elementName, String elementType) {
        this.elementCode = elementCode;
        this.elementName = elementName;
        this.elementType = elementType;
    }

    public long getElement_id() {
        return element_id;
    }

    public void setElement_id(long element_id) {
        this.element_id = element_id;
    }

    public String getElementCode() {
        return elementCode;
    }

    public void setElementCode(String elementCode) {
        this.elementCode = elementCode;
    }

    public String getElementName() {
        return elementName;
    }

    public void setElementName(String elementName) {
        this.elementName = elementName;
    }

    public String getElementType() {
        return elementType;
    }

    public void setElementType(String elementType) {
        this.elementType = elementType;
    }

    @Override
    public String toString() {
        return "Element{" +
                "element_id=" + element_id +
                ", elementCode='" + elementCode + '\'' +
                ", elementName='" + elementName + '\'' +
                ", elementType='" + elementType + '\'' +
                '}';
    }
}
