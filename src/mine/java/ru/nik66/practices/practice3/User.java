package ru.nik66.practices.practice3;


import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@ToString(callSuper = true)
public class User extends Entity<Integer> {

    private String name;
    private String login;
    private String password;
    private Role role;
    private List<Ticket> ticketList;

    public User(String name, String login, String password, Role role) {
        this.name = name;
        this.login = login;
        this.password = password;
        this.role = role;
        this.ticketList = new ArrayList<>();
    }
}
