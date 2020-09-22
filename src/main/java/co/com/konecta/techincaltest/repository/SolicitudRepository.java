package co.com.konecta.techincaltest.repository;

import co.com.konecta.techincaltest.model.Solicitud;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SolicitudRepository extends JpaRepository<Solicitud,Long> {



}
