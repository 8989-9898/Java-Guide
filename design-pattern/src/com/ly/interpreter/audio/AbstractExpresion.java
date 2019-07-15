package com.ly.interpreter.audio;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.interpreter.audio
 * @ClassName: AbstractExpresion
 * @Author: lin
 * @Description: 抽象表达式解析类
 * @Date: 2019/7/15 21:49
 * @Version: 1.0
 */
public abstract class AbstractExpresion {

    // 解析器
    public void interpreter(PlayContext context) {
        if (context.getText().length() == 0) {
            return;
        } else {
            String playKey = context.getText().substring(0, 1);
            context.setText(context.getText().substring(2));
            double playValue = Double.valueOf(context.getText().substring(0, context.getText().indexOf(" ")));
            context.setText(context.getText().substring(context.getText().indexOf(" ") + 1));
            excute(playKey, playValue);
        }
    }
    // 执行
    public abstract void excute(String key, Double value);
}
