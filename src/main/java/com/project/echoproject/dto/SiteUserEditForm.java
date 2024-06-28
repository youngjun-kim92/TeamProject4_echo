package com.project.echoproject.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SiteUserEditForm {
    private String userId;

    @NotEmpty(message = "이름은 필수 항목입니다.")
    private String userName;

    @Pattern(regexp = "^010-[0-9]{4}-[0-9]{4}$", message = "전화번호 형식은 010-****-**** 여야 합니다.")
    @NotEmpty(message = "전화번호는 필수 항목입니다.")
    private String phoneNum;

    @NotEmpty(message = "이메일은 필수 항목입니다.")
    @Email(message = "올바른 이메일 형식이 아닙니다.")
    private String email;

    @NotEmpty(message = "주소는 필수 항목입니다.")
    private String address;

    @NotEmpty(message = "성별은 필수 항목입니다.")
    private String gender;

    @Pattern(regexp = ".*\\.(png|jpg)$", message = "파일은 PNG 또는 JPG 형식이어야 합니다.")
    private String imgUrl;
}