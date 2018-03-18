package com.divanxan.dao;

import com.divanxan.entity.Product;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Stateless
public class ProductDao {


    @PersistenceContext(unitName = "NewPersistenceUnit")
    private EntityManager entityManager;


    public List<Product> getProductList(){
        Query query = entityManager.createQuery("from Product", Product.class);
        return query.getResultList();
    }

    public Product getProduct(int id){
        String hql = "FROM Product WHERE id =:id";
        Query query = entityManager.createQuery(hql);
       Product product =(Product) query.setParameter("id", id).getSingleResult();
       return  product;
    }

}
