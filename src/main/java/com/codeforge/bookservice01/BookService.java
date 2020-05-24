/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codeforge.bookservice01;

import com.codeforge.bookservice01.NumberOfDigits.Digits;
import javax.inject.Inject;

/**
 *
 * @author Katleho
 */
@Loggable
public class BookService {
    
    @Inject @NumberOfDigits(value = Digits.THIRTEEN)
    NumberGenerator numberGenerator;
    
    public Book createBook(String name, String description,float price){
        Book newBook = new Book(name, description, price);
        newBook.setNumber(numberGenerator.generateNumber());
        return newBook;
    }
}
