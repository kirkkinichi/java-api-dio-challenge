package kirk.example.java_api_dio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kirk.example.java_api_dio.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
    boolean existsByPassport_PassportNumber(String passportNumber);
}
