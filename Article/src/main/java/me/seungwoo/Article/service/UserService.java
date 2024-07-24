package me.seungwoo.Article.service;

import lombok.RequiredArgsConstructor;
import me.seungwoo.Article.domain.User;
import me.seungwoo.Article.dto.AddUserRepuest;
import me.seungwoo.Article.repository.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public Long save(AddUserRepuest request) {
        return userRepository.save(User.builder()
                .email(request.getEmail())
                .password(bCryptPasswordEncoder.encode(request.getPassword()))
                .build()).getId();
    }
}
