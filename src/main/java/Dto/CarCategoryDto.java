package Dto;


import entity.carEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class CarCategoryDto {
    private String Categoryid;
    private String name;
    private List<carEntity> carEntities=new ArrayList<>();

}