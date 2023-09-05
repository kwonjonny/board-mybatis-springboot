package board.mybatis.mvc.dto.stats.reply;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// 댓글 월 생성 통계 DTO 
@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ReplyMonthEntryDTO {
    private Long bno;
    private Long replyCount;
    private String replyMonthEntry;
}