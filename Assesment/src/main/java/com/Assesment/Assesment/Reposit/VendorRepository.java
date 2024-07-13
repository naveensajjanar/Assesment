package com.Assesment.Assesment.Reposit;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Assesment.Assesment.model.Vendor;

@Repository
public interface VendorRepository extends JpaRepository<Vendor, Long> {

}
