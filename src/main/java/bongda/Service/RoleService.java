package bongda.Service;

import bongda.DTO.RoleDTO;

public interface RoleService {
    RoleDTO findOneByCode (String code);
}
