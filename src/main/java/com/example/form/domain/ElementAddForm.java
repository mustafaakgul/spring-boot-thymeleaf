package com.example.form.domain;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class ElementAddForm {

    @NotEmpty
    @Size(min=2, max=50)
    private String elementName;

    @NotEmpty
    @Size(min=2, max=50)
    private String elementType;

    @NotNull
    private int amount = 1;

    public ElementAddForm() {
    }

    public ElementAddForm(@NotEmpty @Size(min = 2, max = 50) String elementName, @NotEmpty @Size(min = 2, max = 50) String elementType, @NotNull int amount) {
        this.elementName = elementName;
        this.elementType = elementType;
        this.amount = amount;
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

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
