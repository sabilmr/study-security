package org.project.springsecurity.auth.service;

import lombok.RequiredArgsConstructor;
import org.project.springsecurity.auth.model.entity.UserEntity;
import org.project.springsecurity.auth.repository.UserRepo;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class UserService implements UserDetailsService {
    private final UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity user = userRepo.findByEmail(username).orElseThrow(() -> new UsernameNotFoundException(username));

        Set<GrantedAuthority> grantedAuthorities = new HashSet<>(user.getAuthorities());
        return new User(username, user.getPassword(), grantedAuthorities);
    }
}
