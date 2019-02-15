package com.example.form.controller;

import com.example.form.domain.ElementAddForm;
import com.example.form.service.ElementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class ElementController {

    private final ElementService elementService;

    @Autowired
    public ElementController(ElementService elementService) {
        this.elementService = elementService;
    }

    @RequestMapping("/elements/add")
    public ModelAndView elementAddPage() {
        return new ModelAndView("addElement", "elementForm", new ElementAddForm());
    }

    @RequestMapping(value = "/elements", method = RequestMethod.POST)
    public String handleItemAdd(@Valid @ModelAttribute("itemForm") ElementAddForm form, BindingResult bindingResult) {
        if (bindingResult.hasErrors())
            return "addElement";
        elementService.addElement(form);
        return "redirect:/elements";
    }

    @RequestMapping("/elements")
    public ModelAndView getItemsPage() {
        return new ModelAndView("elements", "elements", elementService.getElements());
    }

    @RequestMapping(value = "/elements/{id}", method = RequestMethod.DELETE)
    public String handleItemDelete(@PathVariable Long id) {
        elementService.deleteElementById(id);
        return "redirect:/elements";
    }
}
