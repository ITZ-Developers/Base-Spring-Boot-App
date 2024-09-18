package com.app.validation.impl;

import com.app.constant.AppConstant;
import com.app.validation.GroupKind;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.List;

public class GroupKindValidation implements ConstraintValidator<GroupKind, Integer> {
    private boolean allowNull;
    private static final List<Integer> VALID_VALUES = List.of(
            AppConstant.GROUP_KIND_ADMIN, AppConstant.GROUP_KIND_USER, AppConstant.GROUP_KIND_MANAGER
    );

    @Override
    public void initialize(GroupKind constraintAnnotation) {
        allowNull = constraintAnnotation.allowNull();
    }

    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext context) {
        return value == null ? allowNull : VALID_VALUES.contains(value);
    }
}