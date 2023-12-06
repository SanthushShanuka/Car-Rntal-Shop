package controller.Save;

import com.jfoenix.controls.JFXTextField;
import Dao.Custom.impl.CarCategoryDaoImpl;
import Dto.CarCategoryDto;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import service.ServiceFactory;
import service.custom.CarCategoryService;

public class CarCategoryViewController {

    CarCategoryService updateCarCategoryService= (CarCategoryService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.CATEGORY);


    public JFXTextField idText;
    public JFXTextField nameText;

    public void saveCategory(ActionEvent event) {
        Alert alert=new Alert(Alert.AlertType.CONFIRMATION,"Do you want to add new Category");
        if (alert.showAndWait().get()== ButtonType.OK){

            if (idText.getText().isEmpty()&&nameText.getText().isEmpty()){
                new Alert(Alert.AlertType.WARNING,"Please Fill fields").show();
            }else{

                String id = idText.getText();
                String name = nameText.getText();

                CarCategoryDto CarCategoryDto = new CarCategoryDto();
                CarCategoryDto.setCategoryid(id);
                CarCategoryDto.setName(name);
                CarCategoryService.saveCategory(CarCategoryDto);
            }
        }else {

        }
    }

    public void updateCategory(ActionEvent event) {

        Alert alert=new Alert(Alert.AlertType.CONFIRMATION,"Do you want to update  Category");
        if (alert.showAndWait().get()== ButtonType.OK) {

            if (idText.getText().isEmpty() && nameText.getText().isEmpty()) {
                new Alert(Alert.AlertType.WARNING, "Please Fill fields").show();
            } else {

                String id = idText.getText();
                String name = nameText.getText();

                CarCategoryDto CarCategoryDto = new CarCategoryDto();
                CarCategoryDto.setCategoryid(id);
                CarCategoryDto.setName(name);

                CarCategoryService.updateCarCategory(CarCategoryDto);
                Clear();
            }
        }else {

        }
    }
    public void Clear(){
        idText.setText("");nameText.setText("");
    }
    public void deleteCategory(ActionEvent event) {

        Alert alert=new Alert(Alert.AlertType.CONFIRMATION,"Do you want to delete  Category");
        if (alert.showAndWait().get()== ButtonType.OK) {

            if (idText.getText().isEmpty()) {
                new Alert(Alert.AlertType.WARNING, "Please enter category id").show();
            } else {
                String carcategoryId = idText.getText();
                CarCategoryDto dto = new CarCategoryDto();
                dto.setCategoryid(carcategoryId);
                CarCategoryService.deleteCarCategory(dto);
            }
        }else {
        }
    }

    public void showCategory(ActionEvent event) {
        String cacategoryId = idText.getText();
        CarCategoryDaoImpl CarCategoryDao = new CarCategoryDaoImpl();
        CarCategoryDto Dto = CarCategoryService.search(cacategoryId);
        if (Dto!=null){
            nameText.setText(Dto.getName());
        } else {
            new Alert(Alert.AlertType.ERROR, "CarCategory Not Found!").show();
        }
    }
}