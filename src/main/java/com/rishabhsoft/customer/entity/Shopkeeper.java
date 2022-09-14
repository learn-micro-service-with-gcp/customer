package com.rishabhsoft.customer.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table
@Data
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS )
//@DiscriminatorColumn(name="user_type", discriminatorType = DiscriminatorType.STRING)
public class Shopkeeper extends User{

    private String shopAddress;
    public Shopkeeper()
    {
        super();
    }

}
