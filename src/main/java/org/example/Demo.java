package org.example;

import lombok.extern.log4j.Log4j2;

@Log4j2

public class Demo {
    public static void main(String[] args) {
        Person p = new Person();
        p.setFirstName("Sanket");
        p.setLastName("Mishra");
        log.info(p.getFirstName());
        log.info(p.getLastName());
    }
}
