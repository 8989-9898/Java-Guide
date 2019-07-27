package com.ly.builder.insurance;


/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.builder.insurance
 * @ClassName: InsuranceContract
 * @Author: lin
 * @Description: 保险合同对象
 * @Date: 2019/7/27 16:28
 * @Version: 1.0
 */
public class InsuranceContract {

    /**
     * 保险合同编号
     */
    private String contractId;

    /**
     * 被保险人，和被保险公司只能有一个
     */
    private String personName;

    /**
     * 被保险公司
     */
    private String companyName;

    /**
     * 保险开始时间
     */
    private long beginDate;

    /**
     * 保险结束时间
     */
    private long endDate;

    /**
     * 其他信息
     */
    private String otherData;

    /**
     * 构造方法，同包访问
     */
    InsuranceContract(ConcreteBuilder builder) {
        this.contractId = builder.getContractId();
        this.personName = builder.getPersonName();
        this.companyName = builder.getCompanyName();
        this.beginDate = builder.getBeginDate();
        this.endDate = builder.getEndDate();
        this.otherData = builder.getOtherData();
    }

    /**
     * 示意方法：保险合同的操作
     */
    public void operation() {
        System.out.println("该保险合同的编号是：" + this.contractId);
    }
}
