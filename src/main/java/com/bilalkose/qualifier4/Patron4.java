package com.bilalkose.qualifier4;

@QualifierMultiple2(EFazlaSecenekler.UCUNCU)
public class Patron4 implements PatronInterface {

    @Override
    public String surum(String data){
        return "qualifier multiple ENUM UCUNCU:  "+data;
    }
}
