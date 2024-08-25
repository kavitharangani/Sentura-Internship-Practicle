package lk.ijse.internship.service.impl;

import lk.ijse.internship.dao.UserDAO;
import lk.ijse.internship.dto.UserDTO;
import lk.ijse.internship.service.UserService;
import lk.ijse.internship.util.Mapping;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class UserIMPL implements UserService {
    private final UserDAO userRepo;
    private final Mapping mapping;
    @Override
    public void save(UserDTO user) {
        userRepo.save(mapping.toUserEntity(user));

    }
}
