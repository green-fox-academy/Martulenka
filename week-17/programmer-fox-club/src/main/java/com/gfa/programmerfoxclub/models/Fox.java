package com.gfa.programmerfoxclub.models;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Fox {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long foxId;

    private String name;
    private FoodType food;
    private DrinkType drink;

    @OneToMany(mappedBy = "fox", fetch = FetchType.LAZY)
    @Cascade(CascadeType.ALL)
    private List<Trick> trickList;


    public Fox(String name){
        this.name = name;
        this.food = FoodType.values()[0];
        this.drink = DrinkType.values()[0];
    }
}
