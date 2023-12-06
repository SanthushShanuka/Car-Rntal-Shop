package service.custom;

import Dto.UserDto;
import service.SuperService;

public interface UserService extends SuperService {
    void saveUser(UserDto userDto);
}