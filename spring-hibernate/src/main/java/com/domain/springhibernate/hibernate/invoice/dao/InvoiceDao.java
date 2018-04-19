package com.domain.springhibernate.hibernate.invoice.dao;

import com.domain.springhibernate.hibernate.invoice.Invoice;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * @author mbaranowicz
 */
@Transactional
@Repository
public interface InvoiceDao extends CrudRepository<Invoice, Integer> {
}
