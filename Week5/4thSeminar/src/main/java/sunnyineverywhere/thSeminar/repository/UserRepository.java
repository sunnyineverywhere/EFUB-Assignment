package sunnyineverywhere.thSeminar.repository;

import sunnyineverywhere.thSeminar.Domain.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository {
    User save(User user);
    Optional<User> findById(Long id);
    List<User> findAll();
    void delete(Long id);
}
