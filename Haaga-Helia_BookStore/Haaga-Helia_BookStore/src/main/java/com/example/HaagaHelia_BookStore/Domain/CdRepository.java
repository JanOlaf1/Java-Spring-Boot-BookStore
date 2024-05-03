
package com.example.HaagaHelia_BookStore.Domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CdRepository extends CrudRepository<Cd, Long> {

    List<Cd> findByAlbum(String Album);

    List<Cd> findBySongNameContainingIgnoreCaseOrArtistContainingIgnoreCase(String songName, String artist);

    List<Cd> findAllByOrderByArtistAsc();

    List<Cd> findAllByOrderByArtistDesc();

    List<Cd> findAllByOrderBySongNameAsc();

    List<Cd> findAllByOrderBySongNameDesc();

}
