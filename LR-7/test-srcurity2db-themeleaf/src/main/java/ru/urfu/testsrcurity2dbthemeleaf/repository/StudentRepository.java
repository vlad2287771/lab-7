package ru.urfu.testsrcurity2dbthemeleaf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.urfu.testsrcurity2dbthemeleaf.entity.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
