package com.ly.observer.difference;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.observer.difference
 * @ClassName: WaterQuality
 * @Author: lin
 * @Description: 具体的被观察者对象
 * @Date: 2019-08-01 11:08
 * @Version: 1.0
 */
public class WaterQuality extends WaterQualitySubject {

    /**
     * 污染级别：0、表示正常  1、表示轻度  2、中度  3、重度
     */
    private int polluteLevel;

    @Override
    public void notifyObserver() {
        watchers.forEach((e) -> {
            if (this.polluteLevel >= 0) {
                // 通知监测员做记录
                if ("监测人员".equals(e.getJob())) {
                    e.update(this);
                }
            }
            if (this.polluteLevel >= 1) {
                // 通知预警人员
                if ("预警人员".equals(e.getJob())) {
                    e.update(this);
                }
            }
            if (this.polluteLevel >= 2) {
                // 通知监测部门领导
                if ("监测部门领导".equals(e.getJob())) {
                    e.update(this);
                }
            }
        });


    }

    @Override
    public int getPolluteLevel() {
        return polluteLevel;
    }

    public void setPolluteLevel(int polluteLevel) {
        this.polluteLevel = polluteLevel;
        this.notifyObserver();
    }
}
