package bongda.Service.Impl;


import bongda.Converter.UserConverter;
import bongda.DTO.UserDTO;
import bongda.Entiy.UserEntity;
import bongda.Repository.RoleRepository;
import bongda.Repository.UserRepository;
import bongda.Service.UserServiec;
import bongda.System.EncrytedPasswordUtils;
import bongda.System.webConstan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class UserServiceImpl implements UserServiec {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserConverter userConverter;
    @Autowired
    private RoleRepository roleRepository;

    @Override
    @Transactional
    public UserDTO Save(UserDTO dto) {
        UserEntity entity = userConverter.DTOConverterEntity(dto);
        entity.setRoleEntity(Collections.singletonList(roleRepository.findOneByCode(webConstan.RoleCodeUser)));
        entity.setPassword(EncrytedPasswordUtils.encrytePassword(entity.getPassword()));
        return userConverter.EntityConverterDTO(userRepository.save(entity));
    }

    @Override
    public List<UserDTO> findAllByUsernameAndStatus() {
        List<UserEntity> entities = userRepository.findAllBy();
        List<UserDTO> userDTOS = new ArrayList<>();
        for (UserEntity entity : entities) {
            UserDTO userDTO = new UserDTO();
            userDTO=userConverter.EntityConverterDTO(entity);
            userDTOS.add(userDTO);
        }
        return userDTOS;
    }
}
