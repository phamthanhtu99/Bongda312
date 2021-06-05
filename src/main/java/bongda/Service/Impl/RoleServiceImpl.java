package bongda.Service.Impl;

import bongda.Converter.RoleCoveter;
import bongda.DTO.RoleDTO;
import bongda.Repository.RoleRepository;
import bongda.Service.RoleService;
import bongda.System.webConstan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private RoleCoveter roleCoveter;
    @Override
    public RoleDTO findOneByCode(String code) {
        RoleDTO dto = roleCoveter.EntityCoveterDTO(roleRepository.findOneByCode(webConstan.RoleCodeUser));
        return dto;
    }
}
