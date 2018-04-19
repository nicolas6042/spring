package com.domain.springhibernate.hibernate.invoice.dao;

import com.domain.springhibernate.hibernate.invoice.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * @author mbaranowicz
 */
@Transactional
@Repository
public interface ProductDao extends CrudRepository<Product, Integer> {
}
