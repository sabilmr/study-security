package org.project.springsecurity.auth.model.request;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ChangePasswordReq {
    @NotEmpty
    @Size(min = 5)
    private String currentPassword;

    @NotEmpty
    @Size(min = 5)
    private String newPassword;

    @NotEmpty
    @Size(min = 5)
    private String confirmationPassword;
}
