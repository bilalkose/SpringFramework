package com.bilalkose.iocli_dili;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "ioclicdliCalisan")
@ApplicationScoped
public class Calisan {

    @Default
    private PatronInterface patronInterface;
    public String getData(String data){
        return patronInterface.surum(data);
    }
}
