package vaadin.backend;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vaadin.model.Wrestler;

@Repository
public interface WrestlerRepository extends JpaRepository<Wrestler, Integer> {

}
