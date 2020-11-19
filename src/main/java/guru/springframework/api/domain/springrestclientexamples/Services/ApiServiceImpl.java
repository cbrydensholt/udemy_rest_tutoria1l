package guru.springframework.api.domain.springrestclientexamples.Services;

import guru.springframework.api.domain.UserModel.User;
import guru.springframework.api.domain.UserModel.UserData;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ApiServiceImpl implements ApiServices {

    private RestTemplate restTemplate;

    public ApiServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public List<User> getUsers(Integer limit) {
        UserData userData = restTemplate.getForObject("https://jsonplaceholder.typicode.com/users", UserData.class);
        return userData.getData();
    }
}
