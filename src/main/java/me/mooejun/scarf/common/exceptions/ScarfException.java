package me.mooejun.scarf.common.exceptions;

/**
 * @author mooejun
 * @since 2019-02-16
 */

public class ScarfException extends RuntimeException {

    private static final long serialVersionUID = -7732170029531001914L;

    private String code;
    private String msg;

    public ScarfException(String code) {
        super();
        this.code = code;
    }

    public ScarfException(String code, String msg) {
        super();
        this.code = code;
        this.msg = msg;
    }

    public ScarfException(String code, String msg, Throwable t) {
        super(code + "-" + msg, t);
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
