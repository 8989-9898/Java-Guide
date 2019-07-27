package com.ly.builder.insurance;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.builder.insurance.no_pattern
 * @ClassName: Client
 * @Author: lin
 * @Description: 客户端当作指挥者的构建器模式的保险合同
 * @Date: 2019/7/27 16:43
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        // 没有规则的
        InsuranceContract contract = new ConcreteBuilder("1001", 123123L, 234234L).setPersonName("lisi").setOtherData("测试数据").build();
        contract.operation();

        // 有规则的
        contract = new ConcreteBuilder("1003", 1231323L, 2234234L).setPersonName("lisi").setOtherData("测试数据").build1();
        contract.operation();


        // 使用将构建器和被构建对象合并的方式
        InsuranceContract1 contract1 = new InsuranceContract1.ConcreteBuilder("1006", 1231323L, 2234234L).setCompanyName("淘宝").setOtherData("人数很多，大生意").build1();
        contract1.operation();
    }
}
