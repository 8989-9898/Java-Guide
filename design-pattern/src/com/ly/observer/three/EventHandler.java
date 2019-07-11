package com.ly.observer.three;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.observer.three
 * @ClassName: EventHandler
 * @Author: lin
 * @Description: 事件管理类
 * @Date: 2019-07-11 9:40
 * @Version: 1.0
 */
public class EventHandler {
    private List<Event> events;

    public EventHandler() {
        this.events = new ArrayList<>();
    }

    public void addEvent(Object object, String methodName, Object... arg) {
        events.add(new Event(object, methodName, arg));
    }

    public void notifyX(){
        events.forEach((e)-> {
            try {
                e.invoke();
            } catch (NoSuchMethodException ex) {
                ex.printStackTrace();
            } catch (InvocationTargetException ex) {
                ex.printStackTrace();
            } catch (IllegalAccessException ex) {
                ex.printStackTrace();
            }
        });
    }
}
