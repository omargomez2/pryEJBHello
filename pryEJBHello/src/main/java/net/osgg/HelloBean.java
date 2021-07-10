package net.osgg;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;


@Stateless
@LocalBean
public class HelloBean implements HelloBeanRemote{
    
    public String getMessage() {
        return "Hello, world";
    }
    
}