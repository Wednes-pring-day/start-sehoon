package wednes.sehoon.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter // getter and setter auto setting from lombok
public class User {
    private Long id;
    private String name;
    private Long age;

    public User (UserRequestDto userRequestDto) {
        this.name = userRequestDto.getName();
        this.age = userRequestDto.getAge();
    }

    public void UpdateUser (UserRequestDto userRequestDto) {
        this.name = userRequestDto.getName();
        this.age = userRequestDto.getAge();
    }
}
