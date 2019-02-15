package com.example.form.service;

import com.example.form.domain.Element;
import com.example.form.domain.ElementAddForm;

public interface ElementService {

    void addElement(ElementAddForm form);

    Iterable<Element> getElements();

    void deleteElementById(long id);
}
