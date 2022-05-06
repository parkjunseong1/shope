package com.shop.dto;

import lombok.Data;
import lombok.Getter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@Data
public class MemberFormDto {

    @NotBlank(message = "이름은 필수입니다.")
    private String name;

    @NotEmpty(message = "email 필수")
    @Email(message = "이메일 형식으로 입력")
    private String email;

    @NotEmpty(message = "비번필수")
    @Length(min=4, max=16, message = "4글자 이상 16글자 이하")
    private String password;

    @NotEmpty(message = "주소입력")
    private String address;
}
