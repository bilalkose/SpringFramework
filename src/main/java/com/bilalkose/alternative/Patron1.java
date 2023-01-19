package com.bilalkose.alternative;


import javax.enterprise.inject.Alternative;

@Alternative
public class Patron1 implements PatronInterface2 {

    //@Alternative: aynı anda sadece 1 tane proje çalışıyor diğerleri kapalı
    @Override
    public String surum(String data){
        return "patron 1 "+data;
    }
}
