package lk.ijse.internship.dao;

import lk.ijse.internship.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface UserDAO extends JpaRepository<UserEntity, Integer> {
}
