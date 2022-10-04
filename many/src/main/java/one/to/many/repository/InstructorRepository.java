package one.to.many.repository;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
 
import one.to.many.model.Instructor;
 
@Repository
public interface InstructorRepository extends JpaRepository<Instructor,Integer>{

	Optional<Instructor> findById(Integer instructorId);
 
}