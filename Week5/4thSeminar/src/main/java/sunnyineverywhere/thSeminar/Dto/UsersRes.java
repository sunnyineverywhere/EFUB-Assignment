package sunnyineverywhere.thSeminar.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import sunnyineverywhere.thSeminar.Domain.User;

import javax.swing.*;
import java.util.List;

@AllArgsConstructor
@Getter
public class UsersRes {
    private List<User> users;
}
