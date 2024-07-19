package auth.base.user.validation.impl;

import auth.base.user.constant.EnumDef;
import auth.base.user.validation.AccountKind;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Set;

@FieldDefaults(level = AccessLevel.PRIVATE)
public class AccountKindValidation implements ConstraintValidator<AccountKind, Integer> {
    boolean allowNull;

    @Override
    public void initialize(AccountKind constraintAnnotation) {
        allowNull = constraintAnnotation.allowNull();
    }

    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext context) {
        if (value == null) {
            return allowNull;
        }
        return Set.of(EnumDef.ACCOUNT_KIND_ADMIN, EnumDef.ACCOUNT_KIND_MANAGER, EnumDef.ACCOUNT_KIND_USER).contains(value);
    }
}