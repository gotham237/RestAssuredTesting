package pojo;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class Orders {
    private List<OrderDetail> orders;
}