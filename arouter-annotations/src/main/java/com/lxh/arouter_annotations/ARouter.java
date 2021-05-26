package com.lxh.arouter_annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE) // 类上
@Retention(RetentionPolicy.CLASS) // 编译期
public @interface ARouter {
    String path();

    String group() default "";
}
