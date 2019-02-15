package com.example.form.service;

import com.example.form.domain.ElementAddForm;
import com.example.form.domain.Element;
import com.example.form.repository.ElementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ElementServiceImplementation implements ElementService {

    private final ElementRepository elementRepository;

    @Autowired
    public ElementServiceImplementation(ElementRepository elementRepository) {
        this.elementRepository = elementRepository;
    }

    @Override
    public void addElement(ElementAddForm form) {
        for (int i = 0; i < form.getAmount(); i++) {
            String inventoryCode = Long.toHexString(Double.doubleToLongBits(Math.random())).substring(10);
            Element element = new Element(inventoryCode, form.getElementName(), form.getElementType());
            elementRepository.save(element);
            System.out.println(elementRepository.findById(element.getElement_id()));
        }
    }

    @Override
    public Iterable<Element> getElements() {
        return elementRepository.findAll();
    }

    @Override
    public void deleteElementById(long id) {
        elementRepository.deleteById(id);
    }
}
