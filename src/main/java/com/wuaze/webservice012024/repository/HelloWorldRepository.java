package com.wuaze.webservice012024.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wuaze.webservice012024.entity.HelloEntity;

public interface HelloWorldRepository extends JpaRepository<HelloEntity, Long>{

}
