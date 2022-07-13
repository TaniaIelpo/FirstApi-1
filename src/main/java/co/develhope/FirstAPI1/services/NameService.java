package co.develhope.FirstAPI1.services;


import co.develhope.FirstAPI1.component.NameComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NameService {

    private NameComponent nameComponent;

    @Autowired
    public NameService(NameComponent name){
        nameComponent=name;
    }

    public String reversedName(String name){
        return nameComponent.reversedName(name);
    }
}
