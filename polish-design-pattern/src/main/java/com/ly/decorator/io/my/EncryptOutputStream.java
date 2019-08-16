package com.ly.decorator.io.my;

import java.io.IOException;
import java.io.OutputStream;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.decorator.io.my
 * @ClassName: EncryptOutputStream
 * @Author: lin
 * @Description: 自己实现IO的装饰模式，对数据进行简单的加密
 * 只能是小写的英文字母，将字母向后移两位 如 a->c ,b->d ,最后 y->a ,z->b
 * @Date: 2019-08-15 17:14
 * @Version: 1.0
 */
public class EncryptOutputStream extends OutputStream {

    /**
     * 持有被装饰的对象
     */
    private OutputStream os;

    public EncryptOutputStream(OutputStream os) {
        this.os = os;
    }

    @Override
    public void write(int b) throws IOException {
        // 先同一向后移两位
        b = b + 2;
        // 97 是 a 的码值
        if (b >= (97 + 26)) {
            // 如果大于，将表示是y或者z了，减去 26 就回到 a或者b了
            b = b - 26;
        }
        this.os.write (b);
    }
}
