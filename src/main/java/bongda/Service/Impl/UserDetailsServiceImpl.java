package bongda.Service.Impl;

import bongda.Entiy.RoleEntity;
import bongda.Entiy.UserEntity;
import bongda.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String Username) throws UsernameNotFoundException {
        UserEntity entity = userRepository.findOneByUsername(Username);
        if (entity==null){
            throw new UsernameNotFoundException("không có user");
        }
        List<RoleEntity> list = entity.getRoleEntity();
        List<GrantedAuthority> authorities = new ArrayList<>();
        if(list!=null){
            for (RoleEntity role: list) {
                authorities.add(new SimpleGrantedAuthority(role.getName()));
            }
        }
        UserDetails userDetails = new User(entity.getUsername(), entity.getPassword(), authorities);
        return userDetails;
    }
}
