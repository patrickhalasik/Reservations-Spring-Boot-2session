package halasik.reservationsspringboot.model;

import org.springframework.data.repository.CrudRepository;

public interface ArtistRepository extends CrudRepository<Artist, Long> {

    List<Artist> findByLastname(String lastname);
    Artist findById(long id);

}