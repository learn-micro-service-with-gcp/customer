package com.rishabhsoft.customer.repository;

import com.rishabhsoft.customer.entity.Shopkeeper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopkeeperRepo extends JpaRepository<Shopkeeper,Long> {
}
