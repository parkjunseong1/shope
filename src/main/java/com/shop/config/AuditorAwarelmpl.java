package com.shop.config;

import org.springframework.data.domain.AuditorAware;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.Optional;

public class AuditorAwarelmpl implements AuditorAware<String> {

    @Override
    public Optional<String> getCurrentAuditor() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String userId="";
        if(authentication != null){
            userId=authentication.getName();
        }
        return Optional.of(userId);
        //null값이 아니라면 userId를 등록자와 수정자로 지정한다.

    }
}
