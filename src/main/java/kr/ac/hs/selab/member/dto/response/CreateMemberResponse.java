package kr.ac.hs.selab.member.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class CreateMemberResponse {

    @Schema(description = "닉네임")
    private final String nickname;
}