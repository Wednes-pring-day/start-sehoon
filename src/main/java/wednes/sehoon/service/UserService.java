package wednes.sehoon.service;

import wednes.sehoon.domain.User;
import wednes.sehoon.repository.UserRepository;

import java.util.List;
import java.util.Optional;

public class UserService {

    private final UserRepository userRepository;
    // 의존성 주입
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    /**
     * @회원가입
     */
    public Long signup(User user) {
        validateUser(user);

        userRepository.save(user);
        return user.getId();
    }

    private void validateUser(User user) {
        userRepository.findbyName(user.getName())
                .ifPresent(m -> {
                    throw new IllegalStateException("이미 존재하는 회원입니다.");
                });
    }

    /**
     * @전체_유저_조회하기
     */
    public List<User> findAllUser(){
        return userRepository.findAll();
    }

    /**
     * @특정_유저_조회하기
     */
    public Optional<User> findOneUser(Long userId){
        return userRepository.findbyId(userId);
    }

}
