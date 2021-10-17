package FirstProject.Repository.Integration_external;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class ValidateIntegration {
    private final RestTemplate restTemplate;

    public ValidateIntegration(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }
    public boolean podeVotar(String cpf)  {
        try {
            String url = "https://user-info.herokuapp.com/users/" + cpf;
            ResponseEntity<?> response = restTemplate.exchange(url, HttpMethod.GET, null, String.class);
            String responseBody = response.getBody().toString();
            return responseBody.equals("{\"status\":\"ABLE_TO_VOTE\"}");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
