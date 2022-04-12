package sunnyineverywhere.thSeminar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sunnyineverywhere.thSeminar.Domain.User;
import sunnyineverywhere.thSeminar.repository.JdbcUserRepository;

import java.util.List;

@Service
public class UserService {
    private final JdbcUserRepository userRepository;

    @Autowired
    public UserService(JdbcUserRepository userRepository){
        this.userRepository = userRepository;
    }

    public List<User> findAllUsers(){
        return userRepository.findAll();
    }

    public User findUser(Long id){
        return userRepository.findById(id).get();
    }

    public User createUser(User user){
        return userRepository.save(user);
    }

    public void deleteUser(Long id){
        userRepository.delete(id);
    }
}
