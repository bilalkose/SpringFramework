package com.bilalkose.qualifier;

import javax.enterprise.inject.Alternative;

@QualifierMultiple
public class Patron2 implements PatronInterface {

    @Override
    public String surum(String data){
        return "qualifier multiple 1:  "+data;
    }
}
