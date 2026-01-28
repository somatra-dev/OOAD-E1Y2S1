package dto_dao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.Random;

record UserCreateDto(

        String name,
        String email,
        String password,
        String phoneNumber
){}

record UserResponseDto(
        Integer id,
        String name,
        String email,
        String phoneNumber,
        String profile,
        String cover,
        Boolean isDeleted,
        Boolean isActive
){}

@AllArgsConstructor
@Getter
@ToString
class User{
    private Integer id;
    private String name;
    private String email;
    private String password;
    private String phoneNumber;
    private String profile;
    private String cover;
    private Boolean isDeleted;
    private Boolean isActive;

}

class UserMapper{
    public static User convertDtoToOriginal(UserCreateDto userCreateDto){
        return  new User(
                new Random().nextInt(999999),
                userCreateDto.name(),
                userCreateDto.email(),
                userCreateDto.password(),
                userCreateDto.phoneNumber(),
                null,
                null,
                false,
                true
        );
    }

    public static UserResponseDto convertOriginalToDto(User user){
        return  new UserResponseDto(
                user.getId(),
                user.getName(),
                user.getEmail(),
                user.getPhoneNumber(),
                user.getProfile(),
                user.getCover(),
                user.getIsDeleted(),
                user.getIsActive()
        );
    }
}

public class Main {

    public static void main(String[] args) {
        UserCreateDto createDto = new UserCreateDto(
                "Koko",
                "koko@gmail.com",
                "02345679",
                "+855321432"
        );

        System.out.println(createDto);
        User  user = UserMapper.convertDtoToOriginal(createDto);
        System.out.println(user);
        System.out.println("===========================");
        System.out.println(UserMapper.convertOriginalToDto(user));


    }
}
