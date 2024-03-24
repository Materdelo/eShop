package com.eShop.Backend.service;

import com.eShop.Backend.dto.ItemDTO;
import com.eShop.Backend.entity.Item;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ItemService {

    List<ItemService> getAllItemsByCategory(String itemName);

    List<ItemService> getAllFilters(ItemDTO itemDTO);

    List<Item> getAllItems();

    Item createItem(ItemDTO itemDTO);

    Item updateItem(Long id,ItemDTO itemDTO);

    void deleteItem(Long id);

}
