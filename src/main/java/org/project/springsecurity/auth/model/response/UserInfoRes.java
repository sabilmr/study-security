package org.project.springsecurity.auth.model.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserInfoRes {
    private String userId;
    private String username;
    private String email;
    private String phone;
    private String role;
    private String group;
    private String dob;
    private String pob;
}
