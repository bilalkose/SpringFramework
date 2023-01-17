package com.bilalkose.qualifier4;

@QualifierMultiple2(EFazlaSecenekler.BIRINCI)
public class Patron2 implements PatronInterface {

    @Override
    public String surum(String data){
        return "qualifier multiple ENUM BIRINCI:  "+data;
    }
}
