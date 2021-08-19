package halasik.reservationsspringboot.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor(force=true, access= AccessLevel.PROTECTED)
@Table(name="Artists")
@Entity
public class Artist {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String firstname;
    private String lastname;

}
