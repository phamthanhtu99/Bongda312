package bongda.Converter;

import bongda.DTO.UserDTO;
import bongda.Entiy.UserEntity;
import org.springframework.stereotype.Component;

@Component
public class UserConverter {
    public UserDTO EntityConverterDTO(UserEntity entity){
        UserDTO dto = new UserDTO();
        dto.setId(entity.getId());
        dto.setFullName(entity.getFullName());
        dto.setPassword(entity.getPassword());
        dto.setUsername(entity.getUsername());
        dto.setPhone(entity.getPhone());
        dto.setAddress(entity.getAddress());
        return dto;
    }
    public UserEntity DTOConverterEntity(UserDTO userDTO){
        UserEntity entity = new UserEntity();
        entity.setId(userDTO.getId());
        entity.setFullName(userDTO.getFullName());
        entity.setPassword(userDTO.getPassword());
        entity.setStatus(userDTO.getStatus());
        entity.setUsername(userDTO.getUsername());
        entity.setPhone(userDTO.getPhone());
        entity.setAddress(userDTO.getAddress());
        return entity;
    }
}
