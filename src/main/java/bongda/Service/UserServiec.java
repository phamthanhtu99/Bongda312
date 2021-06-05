package bongda.Service;

import bongda.DTO.UserDTO;

import java.util.List;


public interface UserServiec {
    UserDTO Save(UserDTO dto);
    List<UserDTO> findAllByUsernameAndStatus();
}
