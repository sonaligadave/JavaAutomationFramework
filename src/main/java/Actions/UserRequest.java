package Actions;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class UserRequest {

    @JsonProperty("user")
    private posts user;
}

