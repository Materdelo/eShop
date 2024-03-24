package com.eShop.Backend.repository;

import com.eShop.Backend.entity.Item;
import com.eShop.Backend.service.ItemService;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ItemRepository extends JpaRepository<Item, Long> {
    Optional<Item> findItemByID(Integer id);

    List<ItemService> findByCategory(String category);

    List<ItemService> findAllFilters();
}
