package com.example.form.repository;

import com.example.form.domain.Element;
import org.springframework.data.repository.CrudRepository;

public interface ElementRepository extends CrudRepository<Element, Long> {
}
