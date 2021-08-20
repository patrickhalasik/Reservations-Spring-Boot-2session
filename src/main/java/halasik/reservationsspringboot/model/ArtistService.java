package halasik.reservationsspringboot.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArtistService {
    @Autowired
    private ArtistRepository artistRepository;

    public List<Artist> getAllArtists(){
        List<Artist> artists = new ArrayList<>();
        artistRepository.findAll().forEach(artists::add);
        return artists;
    }

    public Artist getArtist(String id){
        int identifier = Integer.parseInt(id);
        return artistRepository.findById(identifier);
    }

    public void addArtist(Artist artist){
        artistRepository.save(artist);
    }

    public void updateArtist(String id, Artist artist){
        artistRepository.save(artist);
    }

    public void deleteArtist(String id){
        Long identifier = (long) Integer.parseInt(id);
        artistRepository.deleteById(identifier);
    }

}

