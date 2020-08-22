package com.example.dokkanseller.data_model;

import java.io.Serializable;

public class CartItem implements Serializable {
    public String productImage, productName , shopName  , productId, shopId , status ;

    int productQuanitity , productPrice  ;

    public  CartItem(){

    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public int getProductQuanitity() {
        return productQuanitity;
    }

    public void setProductQuanitity(int productQuanitity) {
        this.productQuanitity = productQuanitity;
    }

    @Override
    public String toString() {
        return "CartItem{" +
                "shopId='" + shopId + '\'' +
                '}';
    }
}
