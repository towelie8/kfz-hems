package com.hems.kennzeichen.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hems.kennzeichen.entity.Kennzeichen;


public interface KennzeichenRepository extends JpaRepository<Kennzeichen, Integer> {
	
	List<Kennzeichen> findAllByAutokennzeichen(String autokennzeichen);
	List<Kennzeichen> findAllByStadt(String stadt);
	List<Kennzeichen> findAllByLandkreis(String landkreis);
	List<Kennzeichen> findAllByBundesland(String bundesland);
}
