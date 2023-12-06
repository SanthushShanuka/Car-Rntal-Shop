package entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Table(name = "user")
public class UserEntity {
    @Id
    @Column(name = "UserID",nullable = false,length = 4)
    private String id;

    @Column(name = "Name",length = 20,nullable = false)
    private String name;

    @Column(name = "Address",nullable = false)
    private String address;

    @Column(name ="Email" ,nullable = false)
    private String email;

    @Column(name = "Username",length = 10,nullable = false)
    private String username;

    @Column(name = "Password",length = 8,nullable = false)
    private String password;

}