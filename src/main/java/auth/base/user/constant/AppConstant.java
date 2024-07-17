package auth.base.user.constant;

public interface AppConstant {
    String ID_GENERATOR = "idGenerator";

    String DATE_FORMAT = "dd/MM/yyyy";
    String DATE_TIME_FORMAT = "dd/MM/yyyy HH:mm:ss";

    Integer ACCOUNT_KIND_ADMIN = 1;
    Integer ACCOUNT_KIND_MANAGER = 2;
    Integer ACCOUNT_KIND_USER = 3;

    Integer GROUP_KIND_ADMIN = 1;
    Integer GROUP_KIND_MANAGER = 2;
    Integer GROUP_KIND_USER = 3;

    Integer STATUS_ACTIVE = 1;
    Integer STATUS_PENDING = 0;
    Integer STATUS_LOCK = -1;
    Integer STATUS_DELETE = -2;
}