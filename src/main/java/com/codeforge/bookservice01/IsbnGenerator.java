/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codeforge.bookservice01;

import com.codeforge.bookservice01.NumberOfDigits.Digits;
import java.util.Random;
import java.util.logging.Logger;
import javax.inject.Inject;

/**
 *
 * @author Katleho
 */
@NumberOfDigits(value = Digits.THIRTEEN)
public class IsbnGenerator implements NumberGenerator{
    private String prefix = "13-84356-";
    
    @Inject
    Logger log;
   
    @Override
    @Loggable
    public String generateNumber(){
        String isbn = prefix + Math.abs(new Random().nextInt());
        log.info("Generated ISBN: "+isbn);
        return isbn;
    }
}
