package com.bilalkose.alternative;

import javax.enterprise.inject.Alternative;

@Alternative
public class Patron2 implements PatronInterface2 {

    @Override
    public String surum(String data){
        return "patron 2 "+data;
    }
}
