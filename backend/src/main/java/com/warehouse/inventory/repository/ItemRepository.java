package com.warehouse.inventory.repository;

import com.warehouse.inventory.model.Item;
import java.util.*;

public class ItemRepository {
    private Map<Long, Item> items = new HashMap<>();

    public List<Item> findAll() {
        return new ArrayList<>(items.values());
    }

    public void save(Item item) {
        items.put(item.getId(), item);
    }

    public Optional<Item> findById(Long id) {
        return Optional.ofNullable(items.get(id));
    }
}
