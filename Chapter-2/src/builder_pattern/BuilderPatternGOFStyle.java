package builder_pattern;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


// Create product (Employee)
@Setter
@ToString
class Employee {
    private Integer id;

    private String name;

    private String email;

    private String phoneNumber;

    private String profile;
}

// Create interface (Builder)
interface EmployeeBuilder {
    void initialize();

    void id(Integer id);

    void name(String name);

    void email(String email);

    void phoneNumber(String phoneNumber);

    void profile(String profile);
}


// Create concrete class that impl from interface Builder
@Getter
class ConcreteEmployeeBuilder implements EmployeeBuilder {

    // getResult
    private Employee result;

    @Override
    public void initialize() {
        result = new Employee();
    }

    @Override
    public void id(Integer id) {
        result.setId(id);
    }

    @Override
    public void name(String name) {
        result.setName(name);
    }

    @Override
    public void email(String email) {
        result.setEmail(email);
    }

    @Override
    public void phoneNumber(String phoneNumber) {
        result.setPhoneNumber(phoneNumber);
    }

    @Override
    public void profile(String profile) {
        result.setProfile(profile);
    }
}

// Create director
class Director {
    private EmployeeBuilder builder;

    public Director(EmployeeBuilder builder) {
        this.builder = builder;
    }

    public void changeBuilder(EmployeeBuilder builder) {
        this.builder = builder;
    }

    // create make method for initialize value
    public void make() {
        builder.initialize();
        builder.id(1);
        builder.name("Koko");
        builder.email("Koko@gmail.com");
        builder.phoneNumber("+867530900");
        builder.profile("google.com/photo.exe");
    }
}


public class BuilderPatternGOFStyle {

    public static void main(String[] args) {

        ConcreteEmployeeBuilder builder = new ConcreteEmployeeBuilder();
        Director director = new Director(builder);
        director.make();
        Employee em = builder.getResult();
        System.out.println(em);

    }

}
