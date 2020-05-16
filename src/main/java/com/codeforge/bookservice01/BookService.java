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
public class BookService {
    
    public Book createBook(String name, String description,float price){
        Book newBook = new Book(name, description, price);
        return newBook;
    }
}
