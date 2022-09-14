package com.rishabhsoft.customer.service;

import com.rishabhsoft.customer.dto.ShopkeeperRequestDTO;
import com.rishabhsoft.customer.dto.ShopkeeperResponseDTO;
import com.rishabhsoft.customer.entity.Shopkeeper;
import com.rishabhsoft.customer.repository.ShopkeeperRepo;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class ShopkeeperService {


    private ShopkeeperRepo shopkeeperRepo;

    public ShopkeeperService(ShopkeeperRepo shopkeeperRepo) {
        this.shopkeeperRepo = shopkeeperRepo;
    }

    ModelMapper modelMapper = new ModelMapper();

    public ShopkeeperResponseDTO addShopkeeper(ShopkeeperRequestDTO theShopkeeperDto){

        Shopkeeper shopkeeper1 = modelMapper.map(theShopkeeperDto,Shopkeeper.class);

//        Shopkeeper shopkeeper = new Shopkeeper(theShopkeeperDto.getFirstName(),theShopkeeperDto.getLastName()
//        ,theShopkeeperDto.getEmail(),theShopkeeperDto.getMobile(),theShopkeeperDto.getUserName(),theShopkeeperDto.getShopAddress());
       Shopkeeper shopkeeper = shopkeeperRepo.save(shopkeeper1);

       ShopkeeperResponseDTO shopkeeperResponseDTO = modelMapper.map(shopkeeper,ShopkeeperResponseDTO.class);
        return shopkeeperResponseDTO;
    }
}
