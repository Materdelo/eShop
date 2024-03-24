package com.eShop.Backend.service.impl;

import com.eShop.Backend.dto.ItemDTO;
import com.eShop.Backend.entity.Item;
import com.eShop.Backend.repository.ItemRepository;
import com.eShop.Backend.service.ItemService;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public class ItemServiceImpl implements ItemService {

    private ItemRepository itemRepo;

    public ItemServiceImpl(ItemRepository itemRepo){
        this.itemRepo = itemRepo;
    }

    @Override
    public List<ItemService> getAllItemsByCategory(String category) {
        return itemRepo.findByCategory(category);
    }

    @Override
    public List<ItemService> getAllFilters(ItemDTO itemDTO) {
        return itemRepo.findAllFilters();
    }

    @Override
    public List<Item> getAllItems() {
        return itemRepo.findAll();
    }

    @Override
    public Item createItem(ItemDTO itemDTO) {

        LocalDate endDate = LocalDate.now().plusWeeks(2);
        Item item = new Item();

        item.setFilters(itemDTO.getFilters());
        item.setItemCondition(itemDTO.getItemCondition());
        item.setItemName(itemDTO.getItemName());
        item.setItemPostPlace(itemDTO.getItemPostPlace());
        item.setItemPostEnd(String.valueOf(java.sql.Date.valueOf(endDate)));

        return itemRepo.save(item);
    }

    @Override
    public Item updateItem(Long id, ItemDTO itemDTO) {

        Optional<Item> optionalItem = itemRepo.findById(id);

        if(optionalItem.isPresent()){
            Item item = new Item();

            item.setFilters(itemDTO.getFilters());
            item.setItemCondition(itemDTO.getItemCondition());
            item.setItemName(itemDTO.getItemName());
            //to pole pozotanie nie
            // do zmiany auction type = aukcja albo sprzedaż bezpośrednia
            //to samo z item potst place i item postDate
            //item.setAuctionType();

            item.setAuctionType(itemDTO.getAuctionType());
            return itemRepo.save(item);
        } else{
            return null;
        }
    }

    @Override
    public void deleteItem(Long id) {
        itemRepo.deleteById(id);
    }
}
