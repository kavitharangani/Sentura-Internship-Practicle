package lk.ijse.internship.util;


import lk.ijse.internship.dto.UserDTO;
import lk.ijse.internship.entity.UserEntity;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class Mapping {
    private final ModelMapper mapper;

    public UserDTO toUserDTO(UserEntity user) {
        return  mapper.map(user, UserDTO.class);
    }
    public UserEntity toUserEntity(UserDTO userDTO){
        return  mapper.map(userDTO, UserEntity.class);
    }
    public List<UserDTO> toUserDTOList(List<UserEntity> users) {
        return mapper.map(users, List.class);

    }
}
