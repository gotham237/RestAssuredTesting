package pojo;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Courses {
    private List<WebAutomation> webAutomation;
    private List<Mobile> mobile;
    private List<Api> api;
}
