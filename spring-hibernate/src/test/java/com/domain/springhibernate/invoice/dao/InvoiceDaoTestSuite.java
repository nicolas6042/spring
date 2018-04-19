package com.domain.springhibernate.invoice.dao;

import com.domain.springhibernate.hibernate.invoice.Invoice;
import com.domain.springhibernate.hibernate.invoice.Item;
import com.domain.springhibernate.hibernate.invoice.Product;
import com.domain.springhibernate.hibernate.invoice.dao.InvoiceDao;
import com.domain.springhibernate.hibernate.invoice.dao.ProductDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.Assert.assertNotEquals;

/**
 * @author mbaranowicz
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    InvoiceDao invoiceDao;

    @Autowired
    ProductDao productDao;

    @Test
    public void testInvoiceDaoSave() {

        Product product1 = new Product("PRODUCT 1");

        Item item1 = new Item(new BigDecimal("10.0"), 5);
        Item item2 = new Item(new BigDecimal("15.0"), 10);

        Invoice invoice1 = new Invoice("1");

        item1.setProduct(product1);
        item2.setProduct(product1);

        invoice1.getItems().add(item1);
        invoice1.getItems().add(item2);


        productDao.save(product1);
        int product1Id = product1.getId();

        invoiceDao.save(invoice1);
        int invoice1Id = invoice1.getId();


        assertNotEquals(0,invoice1Id);
        assertNotEquals(0,product1Id);


        //CleanUp

        try{
         invoiceDao.delete(invoice1Id);

         productDao.delete(product1Id);
        }catch (Exception e){

        }
    }
}
