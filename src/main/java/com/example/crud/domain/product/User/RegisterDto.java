package com.example.crud.domain.product.User;

public record RegisterDto(
        String login,
        String password,
        UserRole role
) {
}
