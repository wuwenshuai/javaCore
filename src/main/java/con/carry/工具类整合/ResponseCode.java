package con.carry.工具类整合;

public enum ResponseCode {

	SUCCESS("success", "处理成功"), BIZERROR("bizerror", "业务异常"),
    SYSERROR("syserror", "系统异常"), PARAMETERS_REQUIRED("params_required", "缺少必要参数"),
    NOT_EXIST("not_exist", "数据不存在"), DUPLICATED("duplicated", "重复提交"),
    PERMISSION_DENIED("permission_denied", "无权操作");

	private String code;
	private String message;

	ResponseCode(String code, String message) {
		this.code = code;
		this.message = message;
	}
	
	public ResponseCode getByCode(String code){
		for (ResponseCode res : values()) {
			if (res.code.equals(code)) {
				return res;
			}
		}
		return null;
	}

	public String getMessage() {
		return message;
	}

	public String getCode() {
		return code;
	}

}