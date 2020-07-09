package com.formatoweb.git06072020.repository;

import com.formatoweb.git06072020.entity.Padres;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface PadreRepository extends JpaRepository<Padres, Serializable> {
}
