package com.example.demo.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class MemberDTO {
    private String memberId;
    private String memberNm;
    private String memberEngNm;
    private String memberChnNm;
    private String memberPw;
    private String memberDept;
    private String memberAddress;
    private String memberRRN;
    private int memberGenderCode;
    private String memberPhoneNumber;
    private String memberLink;
    private String memberEmail;
    private int defaultDelNy;
}
