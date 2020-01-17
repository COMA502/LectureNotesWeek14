package edu.dmacc.coma510;

import edu.dmacc.coma510.services.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Restaurant {
    private MenuService menuService;

    @Autowired
    public Restaurant(MenuService menuService) {
        this.menuService = menuService;
    }

    public void open() {
        System.out.println("Welcome to Greg's Cafe!");
        menuService.getMenu();
    }
}
