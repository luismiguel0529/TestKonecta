package co.com.konecta.techincaltest.repository;

import co.com.konecta.techincaltest.model.ViewSolicitud;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ViewSolicitudRepository extends JpaRepository<ViewSolicitud,Long> {
}
