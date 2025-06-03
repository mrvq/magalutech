package com.tech.magalutech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tech.magalutech.entity.Channel;

public interface ChannelRepository extends JpaRepository<Channel, Long> {

    // This repository will handle CRUD operations for Channel entities.
    // Additional custom query methods can be defined here if needed.

}
