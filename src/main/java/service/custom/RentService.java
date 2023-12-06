package service.custom;

import Dto.RentDto;
import service.SuperService;

public interface RentService extends SuperService {

    void saveRent(RentDto rentDto);
}