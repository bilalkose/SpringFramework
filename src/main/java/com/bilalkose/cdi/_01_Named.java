package com.bilalkose.cdi;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder // creation design pattern yapısıyla geliyor

//cdi bean yapısı
@Named(value = "namedtuto")
@ApplicationScoped
public class _01_Named {
    private Long namedId;
    private String namedData="Hello Named Cdi Bean";
}

// https://kod5.org/jsf-dersleri-cdi-bean-kullanimi/#:~:text=CDI%20Bean%20Nedir%3F,ba%C4%9F%C4%B1ml%C4%B1l%C4%B1k%20enjeksiyonu%20i%C5%9Flemleri%20i%C3%A7in%20getirilmi%C5%9Ftir.

// https://www.alpaytirasoglu.com/portfolio-item/managedbeanler/

// named yapısı => cdi bean yapılarını olusturmak için gerekli yapıyı sunar. amaç loose coupling'dir.
// bir de scope yapımız vardı. applicationScoped kullandık

// ------------

//@Produces => üretmek. bu yapıyı üreticez başka yerde de tüketicez
//üretilen bir şeyi tüketmek istiyorum
// bu yapı inject yapısıdır
//@Inject => tüketmek.

// -----------

// inject yapısı produces yapısına bağlı. peki produces yapıısnda parametre lazımsa?
// new keyword'u kullanırız.
// parameter -> produces -> inject ( -> inject produces'e bağlı. produces ie parametreye objeye bağlı)

// -----------

// scoped yapısı => oluşturduğumuz projenin yaşam süresini bildirir. performansı etkiler + -
//bütün proje application, bütün proje request scoped olamaz.

// --------------------------

// IOC => Inversion of Control
// kontrolü tersine çevirme. IOC, Dependency injection yapısına EŞİT DEĞİLDİR. D.I , üretilen bir yapıyı tüketmektir.
// Core bileşeni, IOC yapısıyla birlikte kullanılıyor spring te. spring bizim yerimize ioc yapısını yapacaktır
//loose coupling'i sağlayan yapı spring deki IOC yapısı bizim için bunu yapıyor.

//nerelerde kullanıyoruz? => büyük projelerde büyük avantaj. yönetimi spring framework'e veriyoruz.

// ---------------------------

//@Alternative
//bir interface i birden fazla class implements ettiyse bunlardan sadece bir tanesini seçmeye yarar. aynı anda sadece 1 proje çalısıyor. diğerleri inaktif
//bizim 2 tane müşterimiz olsun. bir tanesiyle uzun yıllardır çlaısıyoruz. sonra bu eski müşteri biz şuan da sizle çalışmıcaz. ilerde çalısabiliriz
//bizim de b planımız var. biz artık patron1 yerine patron2 ile çalışıyoruz.

// ----------------------------

//