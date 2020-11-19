package guru.springframework.api.domain.springrestclientexamples.Services;


import guru.springframework.api.domain.UserModel.User;

import java.util.List;

public interface ApiServices {

    List<User> getUsers(Integer limit);

}
