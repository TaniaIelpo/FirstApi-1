package co.develhope.FirstAPI1.component;

import org.springframework.stereotype.Component;

@Component

public class NameComponent {



    public String reversedName(String name){
        StringBuilder str=new StringBuilder(name);
        return str.reverse().toString();
    }

}
