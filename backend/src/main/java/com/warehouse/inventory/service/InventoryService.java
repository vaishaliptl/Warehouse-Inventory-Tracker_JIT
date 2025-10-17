package com.warehouse.inventory.service;

import com.warehouse.inventory.model.Item;
import com.warehouse.inventory.repository.ItemRepository;
import java.util.List;

public class InventoryService {
    private ItemRepository repo = new ItemRepository();

    public List<Item> getAllItems() {
        return repo.findAll();
    }

    public void addItem(Item item) {
        repo.save(item);
    }
}
