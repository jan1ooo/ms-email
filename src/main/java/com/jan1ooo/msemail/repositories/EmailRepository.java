package com.jan1ooo.msemail.repositories;

import com.jan1ooo.msemail.models.EmailModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmailRepository extends JpaRepository<EmailModel, Long> {
}
