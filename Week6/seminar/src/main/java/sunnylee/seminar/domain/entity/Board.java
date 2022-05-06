package sunnylee.seminar.domain.entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;

@Getter // 클래스 내 모든 필드 Getter 메소드 자동 생성
@Entity // 테이블과 링크될 클래스
@NoArgsConstructor(access = AccessLevel.PROTECTED) // 기본 생성자 자동 추가, protected는 외부 생성을 닫음
@EntityListeners(AuditingEntityListener.class)
public class Board {

    @Id
    @GeneratedValue
    private Long id;

    @Column(length = 100, nullable = false)
    private String author;

    @Column(length = 100, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    // 해당 클래스의 빌더 패턴 클래스를 생성
    // 생성자 상단에 선언 시 생성자에 포함된 필드만 빌더에 포함
    // Entity에서 메소드를 사용 X, Builder를 사용
    @Builder
    public Board(Long id, String author, String title, String content) {
        this.id = id;
        this.author = author;
        this.title = title;
        this.content = content;
    }
}
