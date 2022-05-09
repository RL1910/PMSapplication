package com.cg.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.entities.Tenant;

@Repository
public interface TenantRepository extends JpaRepository<Tenant,Long>{

}
