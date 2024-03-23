package com.eShop.Backend.service;


import com.eShop.Backend.entity.SubFilters;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SubFiltersService {
    List<SubFilters> getAllSubFilters();
    SubFilters getSubFilterById(Long Id);

}
