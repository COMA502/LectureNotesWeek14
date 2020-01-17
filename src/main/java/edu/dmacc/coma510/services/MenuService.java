package edu.dmacc.coma510.services;

import edu.dmacc.coma510.database.MenuDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
@Service//same thing as @Component, "Service" makes it more readable
public class MenuService {

    @Autowired
    public MenuService(MenuDatabase menuDatabase) {
        System.out.println("Loading the menu from the database...");
    }

    public void getMenu() {
        System.out.println("Our menu today is...");
    }
}
