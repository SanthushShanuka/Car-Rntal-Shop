package service.custom.impl;

import Dao.DaoFactory;
import Dao.Custom.CarCategoryDao;
import Dto.CarCategoryDto;
import entity.CarCategoryEntity;
import javafx.scene.control.Alert;
import service.custom.CarCategoryService;

public class CarCategoryServiceImpl implements CarCategoryService {
    CarCategoryDao carCategoryDao= (CarCategoryDao) DaoFactory.getInstance().getDao(DaoFactory.DaoType.CATEGORY);

    @Override
    public void saveCategory(CarCategoryDto carCategoryDto) {
        CarCategoryEntity carCategoryEntity = new CarCategoryEntity();
        carCategoryEntity.setCategoryid(carCategoryDto.getCategoryid());
        carCategoryEntity.setName(carCategoryDto.getName());
        carCategoryDao.save(carCategoryEntity);
    }

    @Override
    public void updateCarCategory(CarCategoryDto carCategoryDto) {
        try {
            CarCategoryEntity entity = carCategoryDao.findById(carCategoryDto.getCategoryid());
            if (entity!=null){
                entity.setName(carCategoryDto.getName());
                boolean updated = carCategoryDao.update(entity);
                if (updated) {
                    new Alert(Alert.AlertType.INFORMATION,"Category update success").show();
                } else {
                    new Alert(Alert.AlertType.ERROR,"Category update fail").show();
                }
            } else {
                new Alert(Alert.AlertType.WARNING,"Category not found").show();
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }


    @Override
    public CarCategoryDto search(String cacategoryId) {

        CarCategoryEntity carCategoryEntity = carCategoryDao.search(cacategoryId);
        CarCategoryDto carCategoryDto = new CarCategoryDto();

        carCategoryDto.setCategoryid(carCategoryEntity.getCategoryid());
        carCategoryDto.setName(carCategoryEntity.getName());

        return carCategoryDto;
    }

    @Override
    public void deleteCarCategory(CarCategoryDto dto) {
        try {
            CarCategoryEntity entity = carCategoryDao.findById(dto.getCategoryid());
            if (entity != null) {
                boolean isDeleted = carCategoryDao.delete(entity);

                if (isDeleted) {

                } else {

                }
            } else {

            }
        } catch (Exception e){
            e.printStackTrace();

        }
    }
}
