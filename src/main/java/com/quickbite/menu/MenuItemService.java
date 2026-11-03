package com.quickbite.menu;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MenuItemService {
    private final MenuItemRepository menuItemRepository;

    public MenuItemService(MenuItemRepository menuItemRepository) {
        this.menuItemRepository = menuItemRepository;
    }

    // Create MenuItem
    @Transactional
    public MenuItem createMenuItem(MenuItem menuItem) {
        return menuItemRepository.save(menuItem);
    }

    // View MenuItem
    @Transactional(readOnly = true)
    public List<MenuItem> getAllMenuItems() {
        return menuItemRepository.findAll();
    }

    // Get available menu items
    @Transactional(readOnly = true)
    public List<MenuItem> getAvailableMenuItems() {
        return menuItemRepository.findByAvailableTrue();
    }

    // Get menu item by ID
    @Transactional(readOnly = true)
    public MenuItem getMenuItemById(Long id) {
        return menuItemRepository.findById(id)
        .orElseThrow(() -> new RuntimeException("Menu item not found with ID: " + id));
    }

    // Delete menu item
    @Transactional
    public void deleteMenuItem(Long id) {
        MenuItem menuItem = getMenuItemById(id);
        menuItemRepository.delete(menuItem);
    }

    @Transactional
    public MenuItem updateMenuItem(Long id, MenuItem updatedMenuItem){

        MenuItem existingMenuItem = getMenuItemById(id);

        existingMenuItem.setName(updatedMenuItem.getName());
        existingMenuItem.setCategory(updatedMenuItem.getCategory());
        existingMenuItem.setPrice(updatedMenuItem.getPrice());
        existingMenuItem.setAvailable(updatedMenuItem.isAvailable());

        return menuItemRepository.save(existingMenuItem);
    }
}