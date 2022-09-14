package com.rishabhsoft.customer.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table
@Data
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS )
//@DiscriminatorColumn(name="user_type", discriminatorType = DiscriminatorType.STRING)
public class Customer extends User {

    private String country;


}
