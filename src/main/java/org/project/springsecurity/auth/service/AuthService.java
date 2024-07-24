package org.project.springsecurity.auth.service;


import org.project.springsecurity.auth.model.request.ChangePasswordReq;

import java.security.Principal;

public interface AuthService {
    void changePassword(ChangePasswordReq request, Principal connectedUser);

}
