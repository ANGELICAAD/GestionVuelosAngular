package com.SpringBoot.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Historial extends JpaRepository<Historial, Long> {

}
