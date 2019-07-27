package com.ly.builder.insurance;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.builder.insurance
 * @ClassName: ConcreteBuilder
 * @Author: lin
 * @Description: 构造保险合同的构造器
 * @Date: 2019/7/27 16:38
 * @Version: 1.0
 */
public class ConcreteBuilder {

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
     * 构造方法传入必要的参数
     *
     * @param contractId 合同编号
     * @param beginDate  开始时间
     * @param endDate    结束时间
     */
    public ConcreteBuilder(String contractId, long beginDate, long endDate) {
        this.contractId = contractId;
        this.beginDate = beginDate;
        this.endDate = endDate;
    }

    /**
     * 选填数据
     * @param personName 被保险人
     * @return 构造对象
     */
    public ConcreteBuilder setPersonName(String personName) {
        this.personName = personName;
        return this;
    }
    /**
     * 选填数据
     * @param companyName 被保险公司
     * @return 构造对象
     */
    public ConcreteBuilder setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    /**
     * 选填数据
     * @param otherData 其他数据
     * @return 构造对象
     */
    public ConcreteBuilder setOtherData(String otherData) {
        this.otherData = otherData;
        return this;
    }

    /**
     * 构建真正的对象并返回
     * @return
     */
    public InsuranceContract build() {
         return new InsuranceContract(this);
    }

    /**
     * 构建真正的对象并返回，添加合同规则
     * @return
     */
    public InsuranceContract build1() {
        if (contractId==null||contractId.trim().length()==0) {
            throw new IllegalArgumentException("合同编号不能为空");
        }

        boolean signPerson=personName!=null&&personName.trim().length()>0;
        boolean signCompany=companyName!=null&&companyName.trim().length()>0;

        if (signCompany&&signPerson) {
            throw new IllegalArgumentException("一份合同不能同时与个人和公司签约");
        }

        if (!signCompany&&!signPerson) {
            throw new IllegalArgumentException("一份合同不能没有签约对象");
        }

        if (beginDate<=0) {
            throw new IllegalArgumentException("一份合同必须有保险开始生效日期");

        }

        if (endDate<=0) {
            throw new IllegalArgumentException("一份合同必须有保险失效日期");
        }

        if (beginDate>=endDate) {
            throw new IllegalArgumentException("保险失效日期必须大于保险生效日期");
        }
        return new InsuranceContract(this);
    }

    public String getContractId() {
        return contractId;
    }

    public String getPersonName() {
        return personName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public long getBeginDate() {
        return beginDate;
    }

    public long getEndDate() {
        return endDate;
    }

    public String getOtherData() {
        return otherData;
    }
}
