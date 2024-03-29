package com.epam.esm.repository;

import com.epam.esm.entity.UserRole;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface UserRoleRepository extends CrudRepository<UserRole, Long> {

	Optional<UserRole> findByName(String name);
}
