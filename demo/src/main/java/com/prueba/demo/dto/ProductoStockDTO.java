package com.prueba.demo.dto;

public class ProductoStockDTO {

    private String sucursal;
    private String producto;
    private int stock;

    public ProductoStockDTO(String sucursal, String producto, int stock) {
        this.sucursal = sucursal;
        this.producto = producto;
        this.stock = stock;
    }

    // Getters
    public String getSucursal() { return sucursal; }
    public String getProducto() { return producto; }
    public int getStock() { return stock; }
}