package sunnylee.seminar.board.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sunnylee.seminar.board.dto.BoardDto;
import sunnylee.seminar.domain.entity.Board;
import sunnylee.seminar.domain.repository.BoardRepository;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor // 생성자로 주입 받는 방식, final이 선언된 모든 필드
@Service
public class BoardService {

    private final BoardRepository boardRepository;

    @Transactional
    public Long savePost(BoardDto boardDto){
        return boardRepository.save(boardDto.toEntity()).getId();
    }

    @Transactional
    public List<BoardDto> getBoardList(){
        List<Board> boardList = boardRepository.findAll();
        List<BoardDto> boardDtoList = new ArrayList<>();

        for(Board board : boardList){
            BoardDto boardDto = BoardDto.builder()
                    .id(board.getId())
                    .author(board.getAuthor())
                    .title(board.getTitle())
                    .content(board.getContent())
                    .build();
            boardDtoList.add(boardDto);
        }

        return boardDtoList;
    }

    @Transactional
    public BoardDto getPost(Long id){
        Board board = boardRepository.findById(id).get();

        BoardDto boardDto = BoardDto.builder()
                .id(board.getId())
                .author(board.getAuthor())
                .title(board.getTitle())
                .content(board.getContent())
                .build();
        return boardDto;
    }

    @Transactional
    public void deletePost(Long id){
        boardRepository.deleteById(id);
    }

}
