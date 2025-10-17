package com.warehouse.inventory.controller;

import com.warehouse.inventory.model.Item;
import com.warehouse.inventory.service.InventoryService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/items")
public class InventoryController {
    private InventoryService service = new InventoryService();

    @GetMapping
    public List<Item> getItems() {
        return service.getAllItems();
    }

    @PostMapping
    public void addItem(@RequestBody Item item) {
        service.addItem(item);
    }
}
