package auth.base.user.dto.account;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AccountDto {
    Long id;
    Integer kind;
    String username;
    String phone;
    String email;
    String fullName;
    String avatarPath;
}