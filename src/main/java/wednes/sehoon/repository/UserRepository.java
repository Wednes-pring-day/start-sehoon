package wednes.sehoon.repository;

import wednes.sehoon.domain.User;
import java.util.List;
import java.util.Optional;

public interface UserRepository {

    User save(User user); // 저장소에 저장
    Optional<User> findbyId(Long id);
    Optional<User> findbyName(String name);
    List<User> findAll(); // 모든회원리스트 조회

}
