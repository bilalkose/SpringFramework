package com.bilalkose.qualifier2;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "qualifierCdi")
@ApplicationScoped
public class Calisan {

    //defaultta çalışacak kod
    @Inject
    private PatronInterface patronInterface;

    //multiple tanımladığım yerde çalışacak kod
    //@Inject @QualifierMultiple
    //private PatronInterface patronInterface;
    public String getData(String data){
        return patronInterface.surum(data);
    }
}
