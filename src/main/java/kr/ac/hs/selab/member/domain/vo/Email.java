package kr.ac.hs.selab.member.domain.vo;

import java.util.regex.Pattern;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Transient;
import kr.ac.hs.selab.error.template.ErrorMessage;
import kr.ac.hs.selab.error.exception.common.InvalidArgumentException;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Embeddable
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Email {

    @Transient
    private static final String EMAIL_REGEX = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";

    @Column(name = "member_email", unique = true)
    private String email;

    private Email(String email) {
        validate(email);
        this.email = email;
    }

    private void validate(String email) {
        if (!Pattern.matches(EMAIL_REGEX, email)) {
            throw new InvalidArgumentException(ErrorMessage.MEMBER_EMAIL_INVALID_ARGUMENT_ERROR);
        }
    }

    public static Email of(String email) {
        return new Email(email);
    }
}