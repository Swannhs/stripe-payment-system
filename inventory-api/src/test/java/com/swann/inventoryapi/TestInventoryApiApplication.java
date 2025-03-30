package com.swann.inventoryapi;

import org.springframework.boot.SpringApplication;

public class TestInventoryApiApplication {

    public static void main(String[] args) {
        SpringApplication.from(InventoryApiApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
