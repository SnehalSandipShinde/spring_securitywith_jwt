package com.security_demo.spring_securitywith_jwt.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.security_demo.spring_securitywith_jwt.models.ERole;
import com.security_demo.spring_securitywith_jwt.models.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{

	 Optional<Role> findByName(ERole name);
}
