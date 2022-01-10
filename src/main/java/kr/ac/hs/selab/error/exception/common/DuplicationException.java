package kr.ac.hs.selab.error.exception.common;

import kr.ac.hs.selab.error.template.ErrorMessage;
import kr.ac.hs.selab.error.exception.BusinessException;

public class DuplicationException extends BusinessException {

    public DuplicationException(ErrorMessage message) {
        super(message);
    }
}