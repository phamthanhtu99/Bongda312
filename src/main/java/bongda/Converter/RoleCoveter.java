package bongda.Converter;


import bongda.DTO.RoleDTO;
import bongda.Entiy.RoleEntity;
import org.springframework.stereotype.Component;

@Component
public class RoleCoveter {
    public RoleEntity DTOCoveterEntity(RoleDTO dto){
        RoleEntity entity = new RoleEntity();
        entity.setCode(dto.getCode());
        entity.setName(dto.getName());
        return entity;
    }
    public RoleDTO EntityCoveterDTO (RoleEntity entity){
        RoleDTO dto =new RoleDTO();
        dto.setCode(entity.getCode());
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        return dto;
    }
}
