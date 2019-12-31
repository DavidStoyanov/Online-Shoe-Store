package com.stoyanov.onlineshoestore.app.models.view.user;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class UserDetailsViewModel {

    private String id;
    private String username;
    private List<String> authorities;
}
