package com.LJY.member.dto;

import com.LJY.member.entity.MemberEntity;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MemberDTO {
    private Long id;
    private String memberEmail;
    private String memberPassword;
    private String memberName;

    public static MemberDTO toMemberDTO(MemberEntity memberEntity) {
        MemberDTO memberDTO = new MemberDTO();
        memberDTO.setId(memberDTO.getId());
        memberDTO.setMemberEmail(memberDTO.getMemberEmail());
        memberDTO.setMemberPassword(memberDTO.getMemberPassword());
        memberDTO.setMemberName(memberDTO.getMemberName());
        return memberDTO;
    }
}
