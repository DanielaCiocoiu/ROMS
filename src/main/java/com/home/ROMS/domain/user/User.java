package com.home.ROMS.domain.user;

import com.home.ROMS.domain.Order;
import com.home.ROMS.validation.ValidPassword;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @NotBlank
    @Size(min = 2, max = 30)
    private String firstName;
    @NotNull
    @NotBlank
    @Size(min = 2, max = 30)
    private String lastName;
    @Size(min = 8, max = 30)
    @ValidPassword
    private String password;
    @NotNull
    private int credits;
    @Embedded
    @NotNull
    private Address address;

    @OneToMany(mappedBy = "user")
    private List<Order> serviceOrders = new ArrayList<>();

    public User(){  }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Order> getServiceOrders() {
        return serviceOrders;
    }

    public void setServiceOrders(List<Order> serviceOrders) {
        this.serviceOrders = serviceOrders;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return credits == user.credits && Objects.equals(id, user.id) && Objects.equals(firstName, user.firstName) && Objects.equals(lastName, user.lastName) && Objects.equals(password, user.password) && Objects.equals(address, user.address) && Objects.equals(serviceOrders, user.serviceOrders);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, password, credits, address, serviceOrders);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", password='" + password + '\'' +
                ", credits=" + credits +
                ", address=" + address +
                ", serviceOrders=" + serviceOrders +
                '}';
    }
}
