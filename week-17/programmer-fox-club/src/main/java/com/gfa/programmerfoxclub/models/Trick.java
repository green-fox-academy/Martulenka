package com.gfa.programmerfoxclub.models;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Trick {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long trickId;

    private String trickName;

    @ManyToOne
    private Fox fox;

}
