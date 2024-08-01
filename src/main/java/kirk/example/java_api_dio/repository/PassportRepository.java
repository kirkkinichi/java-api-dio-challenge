package kirk.example.java_api_dio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kirk.example.java_api_dio.model.Passport;

@Repository
public interface PassportRepository extends JpaRepository<Passport, Long> {
    
}
