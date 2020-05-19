/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codeforge.bookservice01;

/**
 *
 * @author Katleho
 */
public class Book {
    private String name;
    private String description;
    private float price;
    private String number;
    
    public Book(String name, String description, float price ){
        this.name = name;
        this.description = description;
        this.price = price;
    }
}
