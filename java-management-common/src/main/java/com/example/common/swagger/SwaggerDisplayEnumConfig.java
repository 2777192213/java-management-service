//package com.example.common.swagger;
//
//import cn.hutool.core.collection.CollUtil;
//import cn.hutool.core.util.ReflectUtil;
//import cn.hutool.core.util.StrUtil;
//import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
//import io.swagger.annotations.ApiModelProperty;
//import org.springframework.core.annotation.AnnotationUtils;
//import springfox.documentation.builders.PropertySpecificationBuilder;
//import springfox.documentation.schema.Annotations;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spi.schema.ModelPropertyBuilderPlugin;
//import springfox.documentation.spi.schema.contexts.ModelPropertyContext;
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.Objects;
//import java.util.stream.Collectors;
//
///**
// * @author zhouxiaotao
// * @Description: swagger文档枚举规范展示类
// * @date 2023-11-15 9:48
// */
//public class SwaggerDisplayEnumConfig implements ModelPropertyBuilderPlugin {
//    public SwaggerDisplayEnumConfig() {
//    }
//
//    public void apply(ModelPropertyContext context) {
//        if (Annotations.findPropertyAnnotation((BeanPropertyDefinition)context.getBeanPropertyDefinition().get(), ApiModelProperty.class).isPresent()) {
//            Class<?> enumClass = null;
//            if (Annotations.findPropertyAnnotation((BeanPropertyDefinition)context.getBeanPropertyDefinition().get(), AssertEnum.class).isPresent()) {
//                AssertEnum assertEnum = (AssertEnum)((BeanPropertyDefinition)context.getBeanPropertyDefinition().get()).getField().getAnnotation(AssertEnum.class);
//                enumClass = assertEnum.value();
//            } else if (Annotations.findPropertyAnnotation((BeanPropertyDefinition)context.getBeanPropertyDefinition().get(), SwaggerEnum.class).isPresent()) {
//                SwaggerEnum swaggerEnum = (SwaggerEnum)((BeanPropertyDefinition)context.getBeanPropertyDefinition().get()).getField().getAnnotation(SwaggerEnum.class);
//                enumClass = swaggerEnum.value();
//            }
//
//            this.setDisplayEnumValue(context, enumClass);
//        }
//    }
//
//    public boolean supports(DocumentationType delimiter) {
//        return true;
//    }
//
//    private void setDisplayEnumValue(ModelPropertyContext context, Class<?> enumClass) {
//        if (enumClass != null) {
//            SwaggerDisplayEnum swaggerDisplayEnum = (SwaggerDisplayEnum) AnnotationUtils.findAnnotation(enumClass, SwaggerDisplayEnum.class);
//            if (swaggerDisplayEnum != null) {
//                PropertySpecificationBuilder modelPropertyBuilder = context.getSpecificationBuilder();
//                String example = modelPropertyBuilder.build().getExample() != null ? modelPropertyBuilder.build().getExample().toString() : null;
//                List<String> displayValues = (List) Arrays.stream(enumClass.getEnumConstants()).filter(Objects::nonNull).map((item) -> {
//                    String idValue = ReflectUtil.getFieldValue(item, swaggerDisplayEnum.id()).toString();
//                    String nameValue = ReflectUtil.getFieldValue(item, swaggerDisplayEnum.name()).toString();
//                    StringBuilder displayValue = (new StringBuilder(idValue)).append(":").append(nameValue);
//                    if (StrUtil.isNotBlank(example) && example.equals(idValue)) {
//                        displayValue.append("（默认值）");
//                    }
//
//                    return displayValue.toString();
//                }).collect(Collectors.toList());
//                if (!CollUtil.isEmpty(displayValues)) {
//                    String var10001 = StrUtil.isNotBlank(modelPropertyBuilder.build().getDescription()) ? modelPropertyBuilder.build().getDescription() : "";
//                    modelPropertyBuilder.description(var10001 + displayValues.toString());
//                }
//            }
//        }
//    }
//}
