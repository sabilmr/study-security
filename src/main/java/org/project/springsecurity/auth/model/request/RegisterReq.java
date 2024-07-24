package org.project.springsecurity.auth.model.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RegisterReq {
    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private List<String> roles;
}
