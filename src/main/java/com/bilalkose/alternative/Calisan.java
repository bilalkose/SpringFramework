package com.bilalkose.alternative;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "alternativedi")
@ApplicationScoped
public class Calisan {


    private PatronInterface patronInterface;

    public String getData(String data){
        return patronInterface.surum(data);
    }
}
