package service.custom;

import Dto.CarCategoryDto;
import service.SuperService;

public interface CarCategoryService<C> extends SuperService {
    void saveCategory(CarCategoryDto carCategoryDto);

    void updateCarCategory(CarCategoryDto carCategoryDto);


    static CarCategoryDto search(String cacategoryId);

    void deleteCarCategory(CarCategoryDto dto);
}