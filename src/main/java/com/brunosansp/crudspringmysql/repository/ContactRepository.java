package com.brunosansp.crudspringmysql.repository;

import com.brunosansp.crudspringmysql.model.Contact;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository <Contact, Long> {
}