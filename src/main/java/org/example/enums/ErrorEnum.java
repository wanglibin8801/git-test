package org.example.enums;

/**
 * @author 58491
 * @description:
 * @date 2021/6/19
 */
public enum ErrorEnum implements ErrorCode {
    NOT_LOGIN("SYS1000", "用户未登录或已失效！"), NOLY_LOGIN_ONE_PLACE("SYS1000", "账号已在其他地方登录！"), ERROR_LOGIN("SYS1002", "用户名或密码错误！"), NOT_AUTHORIZED("SYS1003", "无权限操作"), NOT_COMPANY_AUTHORIZED("SYS1003", "未被授权公司权限"), NOT_PROJECT_AUTHORIZED("SYS1003", "未被授权项目权限"), LOGIN_SOURCE_NOT_EXISTS("SYS1003", "LOGIN_SOURCE登录来源不存在"), LOCKED_LOGIN("SYS1004", "该账号已被冻结，请联系工作人员"), NOT_REGISTER_PHONE("SYS1005", "该账号未注册，请联系工作人员申请"), SMS_ONE_DAY_FREQUENCE("SYS1006", "短信发送过于频繁，请稍后重试"), SMS_ONE_MINUTE_FREQUENCE("SYS1006", "短信发送过于频繁，请等一分钟再试！"), SMS_SEND_ERROR("SYS1007", "短信发送失败"), SMS_VERIFY_CODE_ERROR("SYS1008", "短信验证码错误"), ERROR_PHONE_FORMAT("SYS1009", "手机号码格式错误"), NOT_PLATFORM_AUTH("SYS1010", "未授权平台权限"), APP_VERSION_ERROR("SYS1011", "请更新APP版本"), NOT_DATE_AUTH("SYS1012", "未授权数据权限"), NOT_ORG_AUTH("SYS1014", "未授权组织机构"), OUT_OF_SERVICE("SYS1111", "系统维护中，请稍后再试"), ERROR_TOKEN("SYS1011", "非法登录！"), FAIL_REDISLOCK("SYS1013", "获取redis分布式锁失败"), ROLE_NAME_EXISTS("SYS1014", "角色名称已存在！"), USER_NAME_EXISTS("SYS1015", "用户名称已存在！"), USER_MOBILE_EXISTS("SYS1016", "用户手机号已存在！"), USER_NOT_EXISTS("SYS1017", "用户不存在！"), USER_INVALID("SYS1018", "用户已被禁用！"), USER_PASSWORD_ERROR("SYS1019", "用户密码错误！"), VERIFY_FAIL("SYS1021", "验证码已失效"), USER_PASSWORD_ENCRYPT_ERROR("SYS1022", "用户密码加密异常"), NOT_INTERFACE_AUTHORIZED("SYS1023", "无接口访问权限"), ERROR_PARAM("SYS2011", "参数不正确"), ERROR_RETURN("SYS2012", "结果不正确"), ERROR_ORDER("SYS2013", "排序参数不正确"), FAIL_ADD("SYS2021", "新增失败"), FAIL_MODIFY("SYS2022", "修改失败"), FAIL_REMOVE("SYS2023", "删除失败"), FAIL_PROCESS("SYS2024", "操作失败"), NOF_USER_ORG("SYS3014", "用户不属于该组织机构"), NOF_USER_ROLE("SYS3015", "用户未分配角色，请联系管理员"), EXIST_USER("SYS3016", "用户已存在"), NOF_FILE("SYS3017", "文件未找到"), ERROR_FILE_TYPE("SYS3018", "文件类型不正确"), ERROR_EXPORT_EXCEL("SYS3020", "导出Excel失败"), ERROR_IMPORT_EXCEL("SYS3021", "导入Excel失败"), ERROR_UPLOAD_FILE("SYS3022", "文件上传失败"), ERROR_DICTIONARY("SYS3023", "数据字典错误"), ERROR_RULE("SYS3024", "编码规则错误"), ERROR_OPERATION_TYPE("SYS3027", "未知的操作方式"), ERROR_ORG("SYS3033", "组织机构不正确"), EXCEPTION_BIND("SYS9011", "绑定异常"), EXCEPTION_ACCESS_DENIED("SYS9012", "您无权限访问此资源"), EXCEPTION_PRIMARY_KEY("SYS9013", "主键异常"), EXCEPTION_UNIQUE_KEY("SYS9014", "唯一约束异常"), EXCEPTION_CONSTRAINT_VIOLATION("SYS9015", "约束冲突异常"), EXCEPTION_MISSING_SERVLET_REQUEST_PARAMETER("SYS9016", "参数缺少异常"), EXCEPTION_SERVLET_REQUEST_BINDING("SYS9017", "参数绑定异常"), EXCEPTION_ILLEGAL_ARGUMENT("SYS9018", "参数非法异常"), EXCEPTION_METHOD_ARGUMENT_NOT_VALID("SYS9019", "参数无效异常"), EXCEPTION_UNKNOWN_HOST("SYS9091", "未知主机异常"), EXCEPTION_SOCKET_TIMEOUT("SYS9092", "处理超时异常"), EXCEPTION_UNKNOWN("SYS9999", "未知异常，请联系系统管理员"), ERROR_LOGIN_CHANNEL("SYS3024", "第三方登录失败"), ERROR_BUSNESS_CODE("SYS3026", "不正确的业务机构"), ERROR_BD_APP_NO_PERMISSION("SYS3029", "数据暂未开放"), ERROR_BD_USER_UNABLE("SYS3030", "账号已被禁用"), SQL_ERROR("SQL0001", "数据异常"), DUBBO_ERROR("DUBBO0001", "远程服务异常"), ORDER_MQ_STRATEGY_NULL("ORDER0010", "MQ没有对应的策略"), ERROR_SETTLE("SYS3031", "结算失败"), TYPE_CODE_EXISTS("SYS3034", "该编码已存在"), IMPORT_MAX_SIZE("import max size 1000", "一次最多导入1000条"), IMPORT_MIN_SIZE("import min size 1", "最少导入一条数据");

    private String code;
    private String message;

    private ErrorEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public String getCode() {
        return this.code;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
