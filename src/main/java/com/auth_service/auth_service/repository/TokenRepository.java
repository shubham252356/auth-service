package com.auth_service.auth_service.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.auth_service.auth_service.entity.Token;
import com.auth_service.auth_service.entity.User;

public interface TokenRepository extends JpaRepository<Token, UUID> {
    Optional<Token> findByToken(String token);

    Optional<Token> findByUser(User user);

    void deleteByUser(User user);
}
