package sunnylee.seminar.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sunnylee.seminar.domain.entity.Board;

public interface BoardRepository extends JpaRepository<Board, Long> {
}

/*

repository는 데이터 조작을 담당한다
JPArepository를 상속.
JPArepository의 값은 매핑할 entity와 id의 타입

 */