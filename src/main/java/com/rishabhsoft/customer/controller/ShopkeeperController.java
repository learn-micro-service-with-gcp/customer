package com.rishabhsoft.customer.controller;

import com.rishabhsoft.customer.dto.ShopkeeperRequestDTO;
import com.rishabhsoft.customer.dto.ShopkeeperResponseDTO;
import com.rishabhsoft.customer.entity.Shopkeeper;
import com.rishabhsoft.customer.service.ShopkeeperService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers/shopkeepers")
public class ShopkeeperController {

    private ShopkeeperService shopkeeperService;

    public ShopkeeperController(ShopkeeperService shopkeeperService) {
        this.shopkeeperService = shopkeeperService;
    }

    @PostMapping
    public ResponseEntity<ShopkeeperResponseDTO> addShopkeeper(@RequestBody ShopkeeperRequestDTO shopkeeperRequestDTO){
        return ResponseEntity.ok(shopkeeperService.addShopkeeper(shopkeeperRequestDTO));

    }
}
