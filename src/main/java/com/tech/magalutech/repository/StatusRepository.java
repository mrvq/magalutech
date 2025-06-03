package com.tech.magalutech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tech.magalutech.entity.Status;

public interface StatusRepository extends JpaRepository<Status, Long> {

    // This repository will handle CRUD operations for Status entities.
    // Additional custom query methods can be defined here if needed.

}
