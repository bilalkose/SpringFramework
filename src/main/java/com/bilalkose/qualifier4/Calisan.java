package com.bilalkose.qualifier4;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "qualifier3Cdi")
@ApplicationScoped
public class Calisan {

    //defaultta çalışacak kod
    //@Inject
    //private PatronInterface patronInterface;

    //multiple tanımladığım yerde çalışacak kod. enumlardan istediğimi seçebilirim
    @Inject @QualifierMultiple2(EFazlaSecenekler.IKINCI)
    private PatronInterface patronInterface;
    public String getData(String data){
        return patronInterface.surum(data);
    }
}
