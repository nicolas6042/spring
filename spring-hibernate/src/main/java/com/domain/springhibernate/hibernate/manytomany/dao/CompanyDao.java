package com.domain.springhibernate.hibernate.manytomany.dao;

import com.domain.springhibernate.hibernate.manytomany.Company;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * @author mbaranowicz
 */
@Transactional
@Repository
public interface CompanyDao extends CrudRepository<Company, Integer>{

}
