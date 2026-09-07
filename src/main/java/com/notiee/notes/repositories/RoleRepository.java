package com.notiee.notes.repositories;

import com.notiee.notes.models.AppRole;
import com.notiee.notes.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByRoleName(AppRole appRole);

}
