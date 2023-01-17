package com.bilalkose.cdi;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named(value = "intecttuto")
@ApplicationScoped
public class _03_Inject {
    @Inject // bunu çağırmamız lazım. xhtml ' de çağıralım. tüketiyor. havuzdan çektim
    List<String> tuketen;

    public List<String> getTuketen() {
        return tuketen;
    }
}
