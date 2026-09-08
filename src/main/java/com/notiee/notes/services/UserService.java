package com.notiee.notes.services;

import com.notiee.notes.dtos.UserDTO;
import com.notiee.notes.models.User;

import java.util.List;

public interface UserService {
    void updateUserRole(Long userId, String roleName);

    List<User> getAllUsers();

    UserDTO getUserById(Long id);
}
