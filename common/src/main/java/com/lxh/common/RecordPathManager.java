package com.lxh.common;

import android.util.Log;


import com.lxh.common.uiils.Config;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 全局路径记录器（根据子模块进行分组）
 * <p>
 * 组名：app，order，personal
 * 详情order=[Order_MainActivity,Order_MainActivity2,Order_MainActivity3]
 */
public class RecordPathManager {

    /**
     * 先理解成 仓库
     * group: app,order,personal
     * <p>
     * order:
     * OrderMainActivity1
     * OrderMainActivity2
     * OrderMainActivity3
     */
    private static Map<String, List<PathBean>> maps = new HashMap<>();

    /**
     * 将路径信息加入全局Map
     *
     * @param groupName 组名，如："personal"
     * @param pathName  路劲名，如："Personal_MainActivity"
     * @param clazz     类对象，如：Personal_MainActivity.class
     */
    public static void addGroupInfo(String groupName, String pathName, Class<?> clazz) {
        List<PathBean> list = maps.get(groupName);

        if (null == list) {
            list = new ArrayList<>();
            list.add(new PathBean(pathName, clazz));
            // 存入仓库
            maps.put(groupName, list);
        } else {
            // 存入仓库
            maps.put(groupName, list);
        }
        // maps.put(groupName, list);
    }

    /**
     * 只需要告诉我，组名 ，路径名，  就能返回 "要跳转的Class"
     *
     * @param groupName 组名 oder
     * @param pathName  路径名  OrderMainActivity1
     * @return 跳转目标的class类对象
     */
    public static Class<?> startTargetActivity(String groupName, String pathName) {
        List<PathBean> list = maps.get(groupName);
        if (list == null) {
            Log.d(Config.TAG, "startTargetActivity 此组名得到的信息，并没有注册进来哦...");
            return null;
        }
        // 遍历 寻找 去匹配 “PathBean”对象
        for (PathBean pathBean : list) {
            if (pathName.equalsIgnoreCase(pathBean.getPath())) {
                return pathBean.getClazz();
            }
        }
        return null;
    }
}
