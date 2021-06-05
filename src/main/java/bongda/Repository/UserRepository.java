package bongda.Repository;

import bongda.Entiy.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<UserEntity,Long> {
    UserEntity findOneByUsername(String name);
    List<UserEntity> findAllBy();
}
