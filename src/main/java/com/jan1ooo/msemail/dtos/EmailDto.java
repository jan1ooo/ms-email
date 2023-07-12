package com.jan1ooo.msemail.dtos;

import com.jan1ooo.msemail.enums.StatusEmail;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class EmailDto {
    @NotBlank
    private String ownerRef;

    @NotBlank
    @Email
    private @Email String emailFrom;

    @NotBlank
    @Email
    private String emailTo;

    @NotBlank
    private String subject;

    @NotBlank
    private String text;
}
