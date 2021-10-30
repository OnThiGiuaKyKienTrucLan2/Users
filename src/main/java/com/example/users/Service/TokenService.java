package com.example.users.Service;

import com.example.users.Entity.Token;
import com.example.users.Repository.TokenRepository;
import io.github.resilience4j.retry.annotation.Retry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TokenService  {

    @Autowired
    private TokenRepository tokenRepository;
    @Retry(name="basic")
    public Token createToken(Token token) {
        return tokenRepository.saveAndFlush(token);
    }
}

