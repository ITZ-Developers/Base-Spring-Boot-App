package com.app.constant;

public interface ErrorCode {
    /** Starting error code Account **/
    String ACCOUNT_ERROR_NOT_FOUND = "ERROR-ACCOUNT-0000";
    String ACCOUNT_ERROR_USERNAME_EXISTED = "ERROR-ACCOUNT-0001";
    String ACCOUNT_ERROR_EMAIL_EXISTED = "ERROR-ACCOUNT-0002";
    String ACCOUNT_ERROR_PHONE_EXISTED = "ERROR-ACCOUNT-0003";
    String ACCOUNT_ERROR_PASSWORD_INVALID = "ERROR-ACCOUNT-0004";
    String ACCOUNT_ERROR_EXCEEDED_NUMBER_OF_INPUT_ATTEMPT_OTP = "ERROR-ACCOUNT-0005";
    String ACCOUNT_ERROR_OTP_INVALID = "ERROR-ACCOUNT-0006";
    String ACCOUNT_ERROR_NOT_ALLOW_DELETE_SUPPER_ADMIN = "ERROR-ACCOUNT-0007";
    String ACCOUNT_ERROR_NOT_ALLOW_DELETE_YOURSELF = "ERROR-ACCOUNT-0008";

    /** Starting error code Group **/
    String GROUP_ERROR_NOT_FOUND = "ERROR-GROUP-0000";
    String GROUP_ERROR_NAME_EXISTED = "ERROR-GROUP-0001";

    /** Starting error code Permission **/
    String PERMISSION_ERROR_CODE_EXISTED = "ERROR-PERMISSION-0000";
    String PERMISSION_ERROR_NAME_EXISTED = "ERROR-PERMISSION-0001";
    String PERMISSION_ERROR_ACTION_EXISTED = "ERROR-PERMISSION-0002";

    /** Starting error code Setting **/
    String SETTING_ERROR_NOT_FOUND = "ERROR-SETTING-ERROR-0000";
    String SETTING_ERROR_EXISTED_GROUP_NAME_AND_KEY_NAME = "ERROR-SETTING-ERROR-0001";
}
