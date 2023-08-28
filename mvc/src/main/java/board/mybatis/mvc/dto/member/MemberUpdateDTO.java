package board.mybatis.mvc.dto.member;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class MemberUpdateDTO {
     // tbl_member 
    private String email;
    private String memberName;
    private String memberPw;
    private String memberPhone;
    private LocalDate createDate;
}
