package kirk.example.java_api_dio.service;

import kirk.example.java_api_dio.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}