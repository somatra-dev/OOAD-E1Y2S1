package domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@ToString
public class Customer extends User{

    private Set<Order> orders = new HashSet<>();
}
