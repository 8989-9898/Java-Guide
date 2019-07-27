package com.ly.builder.insurance;


/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.builder.insurance
 * @ClassName: InsuranceContract
 * @Author: lin
 * @Description: 保险合同对象,将构建器和被构建的对象合并
 * @Date: 2019/7/27 16:28
 * @Version: 1.0
 */
public class InsuranceContract1 {

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
    InsuranceContract1(ConcreteBuilder builder) {
        this.contractId = builder.getContractId();
        this.personName = builder.getPersonName();
        this.companyName = builder.getCompanyName();
        this.beginDate = builder.getBeginDate();
        this.endDate = builder.getEndDate();
        this.otherData = builder.getOtherData();
    }



    public static class ConcreteBuilder {

        private String contractId;
        private String personName;
        private String companyName;
        private long beginDate;
        private long endDate;
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
        public InsuranceContract1 build() {
            return new InsuranceContract1(this);
        }

        /**
         * 构建真正的对象并返回，添加合同规则
         * @return
         */
        public InsuranceContract1 build1() {
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
            return new InsuranceContract1(this);
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



    /**
     * 示意方法：保险合同的操作
     */
    public void operation() {
        System.out.println("该保险合同的编号是：" + this.contractId);
    }
}
