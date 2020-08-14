package com.example.dokkanseller.data_model;

public class ProductitemModel {
    private String productId ;
    private String shopId ;
    private String name ;
    private String price ;
    private String categoryid ;
    private String image1;
    private String image2 ;
    private  String image3;
    private String description;
    private String size ;
    private String materials;
    
    public ProductitemModel() {
        
    }

    public ProductitemModel(String productId, String shopId,
                            String name, String price,
                            String categoryid, String image1, String image2, String image3, 
                            String description, String size, String materials) {
        this.productId = productId;
        this.shopId = shopId;
        this.name = name;
        this.price = price;
        this.categoryid = categoryid;
        this.image1 = image1;
        this.image2 = image2;
        this.image3 = image3;
        this.description = description;
        this.size = size;
        this.materials = materials;
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
    
    public String getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(String categoryid) {
        this.categoryid = categoryid;
    }


    public String getImage1() {
        return image1;
    }

    public void setImage1(String image1) {
        this.image1 = image1;
    }

    public String getImage2() {
        return image2;
    }

    public void setImage2(String image2) {
        this.image2 = image2;
    }

    public String getImage3() {
        return image3;
    }

    public void setImage3(String image3) {
        this.image3 = image3;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getMaterials() {
        return materials;
    }

    public void setMaterials(String materials) {
        this.materials = materials;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //
    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

}
