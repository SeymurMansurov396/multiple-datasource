package com.ulife.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ulife.domain.Foo;

@Repository
public interface FooRepository extends JpaRepository<Foo, Long> {

  Foo findById(Long id);

}
