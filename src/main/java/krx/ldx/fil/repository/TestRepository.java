package krx.ldx.fil.repository;

import krx.ldx.fil.domain.entity.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TestRepository extends JpaRepository<Test, Long> {

//  @Query(value =
//          "SELECT t" +
//                  "  FROM test t" +
//                  " WHERE t.title = :string")
//  List<Test> findAllTest(
//          @Param("string") String string);
}

