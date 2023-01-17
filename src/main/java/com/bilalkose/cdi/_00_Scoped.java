package com.bilalkose.cdi;

import javax.enterprise.context.*;
import javax.inject.Named;

@Named
//@ApplicationScoped // bütün uygulama boyunca çalışır bütün kullanıcılar
//RequestScoped //bir istek boyunca yaşar. response döner ve ölür
//@SessionScoped //bir kullanıcı için yaşar ancak logout olunca ölür
//@Dependent //bukelemon. yani çağırdığın yere göre, bulunduğu class'a göre scope'u ona göre atar kendisinin scope'unu
//@ConversationScoped // belli istek boyunca yaşar. örneğin ürün sepete eklendi. ödeme yapıldı. sonra ölmesi, gibi..
public class _00_Scoped {
}
