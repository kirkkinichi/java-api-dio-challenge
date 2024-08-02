package kirk.example.java_api_dio.service.impl;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import kirk.example.java_api_dio.model.User;
import kirk.example.java_api_dio.repository.UserRepository;
import kirk.example.java_api_dio.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if (userRepository.existsByPassport_PassportNumber(userToCreate.getPassport().getPassportNumber())) {
            throw new IllegalArgumentException("This Passport Number already exists.");
        }
        return userRepository.save(userToCreate);
    }
    
}
