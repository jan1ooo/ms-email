package com.jan1ooo.msemail.models;

import com.jan1ooo.msemail.enums.StatusEmail;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Generated;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "TB_EMAIL")
public class EmailModel{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_email;

    private String ownerRef;
    private String emailFrom;
    private String emailTo;
    private String subject;
    @Column(columnDefinition = "TEXT")
    private String text;
    private LocalDateTime sendDateEmail;
    private StatusEmail statusEmail;
}
