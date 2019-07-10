package com.ly.atomic;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.atomic.*;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.atomic
 * @ClassName: AtomicIntegerDemo
 * @Author: lin
 * @Description: 测试原子类
 * @Date: 2019-06-27 16:56
 * @Version: 1.0
 */
public class AtomicIntegerDemo {
    public static void main(String[] args) {
        AtomicInteger integer = new AtomicInteger();
        // 0
        System.out.println(integer.getAndSet(3));
        // 4
        System.out.println(integer.incrementAndGet());
        // 3
        System.out.println(integer.decrementAndGet());
        // 3
        System.out.println(integer.getAndAdd(3));
        // 6
        System.out.println(integer.getAndUpdate(IntUnaryOperator.identity()));
        // 6
        System.out.println(integer.get());
    }
}

class AtomicLongDemo {
    public static void main(String[] args) {
        AtomicLong integer = new AtomicLong();
        // 0
        System.out.println(integer.getAndSet(3));
        // 4
        System.out.println(integer.incrementAndGet());
        // 3
        System.out.println(integer.decrementAndGet());
        // 3
        System.out.println(integer.getAndAdd(3));
        // 6
        System.out.println(integer.getAndUpdate(LongUnaryOperator.identity()));
        // 6
        System.out.println(integer.get());
    }
}

class AtomicBooleanDemo {
    public static void main(String[] args) {
        AtomicBoolean integer = new AtomicBoolean();
        // false 默认
        System.out.println(integer.getAndSet(true));
        // true
        System.out.println(integer.get());
    }
}

class AtomicIntegerArrayDemo {
    public static void main(String[] args) {
        int[] nums = {5, 1, 6, 8, 3};
        AtomicIntegerArray integer = new AtomicIntegerArray(nums);
        for (int i = 0; i < integer.length(); i++) {
            System.out.println(integer.get(i));
        }
        System.out.println(integer.getAndSet(3, 4));
        System.out.println(integer.incrementAndGet(4));
        System.out.println(integer.decrementAndGet(1));
        System.out.println(integer.getAndAdd(3, 9));
        System.out.println(integer.getAndUpdate(3, IntUnaryOperator.identity()));
        System.out.println(integer.get(4));
        System.out.println(integer.get(3));
    }
}

class AtomicLongArrayDemo {
    public static void main(String[] args) {
        long[] nums = {5, 1, 6, 9, 3};
        AtomicLongArray integer = new AtomicLongArray(nums);
        System.out.println(integer.incrementAndGet(4));
        System.out.println(integer.getAndSet(3, 4));
        System.out.println(integer.decrementAndGet(1));
        System.out.println(integer.getAndUpdate(3, LongUnaryOperator.identity()));
        System.out.println(integer.getAndAdd(3, 9));
        System.out.println(integer.get(4));
        System.out.println(integer.get(3));
    }
}


class Author {
    private String name;
    public volatile int age;

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Author(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}

class AtomicReferenceDemo {
    public static void main(String[] args) {
        Author author = new Author("zhangsan", 30);
        AtomicReference<Author> reference = new AtomicReference<>();
        reference.set(author);
        System.out.println(reference.get());
        boolean lisi = reference.compareAndSet(author, new Author("lisi", 20));
        System.out.println(lisi);
        System.out.println(reference.get());
    }
}


class AtomicIntegerFieldUpdaterDemo{
    public static void main(String[] args) {
        Author author = new Author("zhangsan", 30);
        AtomicIntegerFieldUpdater<Author> updater =AtomicIntegerFieldUpdater.newUpdater(Author.class,"age");
        System.out.println(updater.incrementAndGet(author));
        System.out.println(updater.compareAndSet(author,31,50));
        System.out.println(updater.get(author));

    }
}