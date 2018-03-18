package com.divanxan.controller;


import com.divanxan.dao.ProductDao;
import com.divanxan.entity.Product;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.List;

@Path("product")
public class ProductController {

    @Inject
    private ProductDao productDao;

    @GET
    @Path("/one")
    @Produces("application/json")
    public Product test(){
        return productDao.getProduct(1);
    }

    @GET
    @Path("/all")
    @Produces("application/json")
    public List<Product> testAll(){
        return productDao.getProductList();
    }
}
