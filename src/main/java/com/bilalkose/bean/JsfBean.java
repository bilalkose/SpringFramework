package com.bilalkose.bean;
import lombok.Getter;
import lombok.Setter;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named(value = "cdibean")
@RequestScoped
@Getter
@Setter
public class JsfBean {
    private String patika;

    public JsfBean() {
        this.patika = "Spring eğitimi patika!";
    }
}
