package Dto.TM;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CustomerTM {
    private String custid;
    private String nic;
    private String name;
    private String address;
    private Integer mobileno;
}