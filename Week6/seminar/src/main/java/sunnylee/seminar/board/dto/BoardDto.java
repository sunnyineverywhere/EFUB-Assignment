package sunnylee.seminar.board.dto;

import lombok.*;
import sunnylee.seminar.domain.entity.Board;

@Setter
@Getter
@ToString
@NoArgsConstructor
public class BoardDto {

    private Long id;
    private String author;
    private String title;
    private String content;

    @Builder
    public BoardDto(Long id, String author, String title, String content) {
        this.id = id;
        this.author = author;
        this.title = title;
        this.content = content;
    }


    // dto에서 필요한 부분을 (빌더 패턴을 통해) Entity로 만듬
    public Board toEntity(){
        Board build = Board.builder()
                .id(id)
                .author(author)
                .title(title)
                .content(content)
                .build();
        return build;
    }
}
