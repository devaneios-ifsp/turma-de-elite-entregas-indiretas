package com.devaneios.manytomanyrelationship.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClubDto {

    private String name;

    private Integer amountOfPlayers;

    private String coach;

}
