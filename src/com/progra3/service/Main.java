package com.progra3.service;

import com.progra3.model.Product;

public class Main {
    public static void main(String[] args) {
        System.out.println("hola mundo");

        Product product = new Product("keyboard" );
        System.out.println(product.getName());
    }
}
