//package com.example.common.swagger;
//
//import javax.validation.Constraint;
//import javax.validation.Payload;
//import java.lang.annotation.ElementType;
//import java.lang.annotation.Retention;
//import java.lang.annotation.RetentionPolicy;
//import java.lang.annotation.Target;
//
///**
// * @author zhouxiaotao
// * @Description: 校验枚举注解
// * @date 2023-11-15 9:52
// */
//@Target({ElementType.FIELD, ElementType.PARAMETER})
//@Retention(RetentionPolicy.RUNTIME)
//@Constraint(
//        validatedBy = {AssertEnumValidator.class}
//)
//public @interface AssertEnum {
//    Class<? extends BaseValidatorEnum> value();
//
//    String message() default "数据值不正确";
//
//    Class<?>[] groups() default {};
//
//    Class<? extends Payload>[] payload() default {};
//}
//
