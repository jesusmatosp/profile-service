package com.ibm.jmatos;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepository extends JpaRepository<Profile, Long> {

	Profile findByName(String name);
	
}
