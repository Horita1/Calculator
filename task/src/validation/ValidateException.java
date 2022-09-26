package validation;

/**
 * 入力内容に誤りがあればエラーを発生させる
 * @author Horita
 */
public class ValidateException extends Exception{

    private static final long serialVersionUID = 1L;
    
    public ValidateException(String msg){
		super(msg);
	}

}