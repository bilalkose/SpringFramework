package com.bilalkose.qualifier4;

@QualifierMultiple2(EFazlaSecenekler.IKINCI)
public class Patron3 implements PatronInterface {

    @Override
    public String surum(String data){
        return "qualifier multiple ENUM IKINCI:  "+data;
    }
}
