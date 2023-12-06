package entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "car_category")
public class CarCategoryEntity {
    @Id
    @Column(name = "Category_ID",nullable = false)
    private String categoryid;

    @Column(name = "Category_Name",nullable = false)
    private String name;

    @OneToMany(mappedBy = "carCategoryEntity",targetEntity = carEntity.class)
    private List<carEntity> carEntities;
}