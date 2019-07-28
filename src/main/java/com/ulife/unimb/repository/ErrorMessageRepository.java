package com.ulife.unimb.repository;

import com.ulife.unimb.domain.ErrorMessage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ErrorMessageRepository extends JpaRepository<ErrorMessage, Long> {

  ErrorMessage findByKeyAndLocale(String key, String locale);

}
