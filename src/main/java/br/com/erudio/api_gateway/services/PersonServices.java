package br.com.erudio.api_gateway.services;

import br.com.erudio.api_gateway.model.Person;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonServices {
    private final AtomicLong counter = new AtomicLong(); //usamos para simular id

    private Logger logger = Logger.getLogger(PersonServices.class.getName());

    public Person findById(String id){

        logger.info("Finding one person!"); //mostra msg no terminal.
        Person person = new Person();

        //mock
        person.setId(counter.incrementAndGet());
        person.setFirstName("Leandro");
        person.setLastName("Costa");
        person.setAddress("Uberlândia - MG");
        person.setGender("Male");
        return person;
    }
}
