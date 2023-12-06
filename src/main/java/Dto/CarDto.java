package Dto;



import entity.RentEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class CarDto {
    private String carid;
    private String brand;
    private String model;
    private Integer vehino;
    private String year;
    private Double priceperday;
    private List<RentEntity> rentEntityList=new ArrayList<>();
    private CarCategoryDto carCategoryDto;
}