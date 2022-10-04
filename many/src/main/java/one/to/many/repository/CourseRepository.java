package one.to.many.repository;
import java.util.List;
import java.util.Optional;
 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
 
import one.to.many.model.Course;
import one.to.many.controller.CourseController;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer>{
 
 Optional<Course> findByIdAndInstructorId(Integer id, Integer instructorId);
List<Course> findByInstructorId(Integer instructorId);
}