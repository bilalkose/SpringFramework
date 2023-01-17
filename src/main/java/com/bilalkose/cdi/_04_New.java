package com.bilalkose.cdi;

import com.bilalkose.StudentDTO;
import lombok.Getter;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.New;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "newtuto")
@ApplicationScoped
public class _04_New {

    //üretilen
    @Produces
    public String uretilenData( @New StudentDTO studentDTO){
        studentDTO = StudentDTO.builder()
                .studentId(0L)
                .studentName("studentAdi").build();

        return studentDTO.getStudentName();
    }


    //tüketilen - parametreli
    @Getter
    @Inject
    private String tuketilenData;
}
