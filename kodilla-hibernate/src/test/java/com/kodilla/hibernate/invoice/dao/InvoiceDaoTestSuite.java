//package com.kodilla.hibernate.invoice.dao;
//
//import com.kodilla.hibernate.invoice.Invoice;
//import com.kodilla.hibernate.invoice.Item;
//import com.kodilla.hibernate.invoice.Product;
//import org.junit.Assert;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.math.BigDecimal;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class InvoiceDaoTestSuite {
//    @Autowired
//    private InvoiceDao invoiceDao;
//    @Autowired
//    private ItemDao itemDao;
//    @Autowired
//    private ProductDao productDao;
//
//    @Test
//    public void testInvoiceDaoSave() {
//        //Given
//        Product product1 = new Product("Test product 1");
//        Product product2 = new Product("Test product 2");
//        Product product3 = new Product("Test product 3");
//
//        Invoice invoice = new Invoice("Test invoice 1");
//
//        Item item1 = new Item(product1, new BigDecimal(1), 2, new BigDecimal(3));
//        Item item2 = new Item(product2, new BigDecimal(4), 5, new BigDecimal(6));
//        Item item3 = new Item(product3, new BigDecimal(7), 8, new BigDecimal(9));
//
//        product1.getItems().add(item1);
//        product2.getItems().add(item2);
//        product3.getItems().add(item3);
//
//        item1.setInvoice(invoice);
//        item2.setInvoice(invoice);
//        item3.setInvoice(invoice);
//
//        invoice.getItems().add(item1);
//        invoice.getItems().add(item2);
//        invoice.getItems().add(item3);
//
//        //When
//        productDao.save(product1);
//        productDao.save(product2);
//        productDao.save(product3);
//        invoiceDao.save(invoice);
//        itemDao.save(item1);
//        itemDao.save(item2);
//        itemDao.save(item3);
//        int id = invoice.getId();
//
//        //Then
//        Assert.assertEquals(3, productDao.count());
//        Assert.assertEquals(3, itemDao.count());
//        Assert.assertNotEquals(0, id);
//
//        //CleanUp
//        invoiceDao.deleteAll();
//        productDao.deleteAll();
//        itemDao.deleteAll();
//    }
//}