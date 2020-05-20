package com.lc.javatest;

import java.util.Map;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;

/**
 * @author toutou 2019/03/17
 * @href https://www.cnblogs.com/toutou/p/sort_map.html
 */
public class Java8future {

    public static void main(String[] args) {
        Map<String, Integer> map = ImmutableMap.of("gq", 7, "aa", 9, "zs", 66, "vv", 3);
        System.out.println("原始的map：" + map);
        System.out.println("初始化Map:"+ConstantMap.INTEGER_STRING_MAP.get(30));
        System.out.println("key降序：" + sortByKey(map, true, 2));
        System.out.println("key升序：" + sortByKey(map, false, 2));
        System.out.println("value降序：" + sortByValue(map, true, 2));
        System.out.println("value升序：" + sortByValue(map, false, 2));
    }

    /**
     * 定义一些常量Map<?,?>
     */
    interface ConstantMap {
        Map<Integer, String> INTEGER_STRING_MAP =
                new ImmutableMap.Builder<Integer, String>().

                        put(30, "IP地址或地址段").
                        put(31, "端口号或范围").
                        put(32, "IP地址或地址段").
                        put(33, "端口号或范围").
                        put(34, "代码值").
                        put(38, "探针名称").
                        put(39, "网络协议号(protocol)").
                        put(40, "ipv6源IP(ipv6_src_addr)").
                        put(41, "ipv6目标IP(ipv6_dst_addr)").
                        put(42, "网络协议名称(protocol_map)").
                        put(43, "输入接口snmp(input_snmp)")
                        .build();
    }
    /**
     * Sort map by value
     *
     * @param map map source
     * @param isDesc 是否降序，true：降序，false：升序
     * @param limit 取前几条
     * @return 已排序map
     */
    public static <K, V extends Comparable<? super V>> Map<K, V> sortByValue(Map<K, V> map, boolean isDesc, int limit) {
        Map<K, V> result = Maps.newLinkedHashMap();
        if (isDesc) {
            map.entrySet().stream().sorted(Map.Entry.<K, V>comparingByValue().reversed()).limit(limit)
                    .forEach(e -> result.put(e.getKey(), e.getValue()));
        } else {
            map.entrySet().stream().sorted(Map.Entry.<K, V>comparingByValue())
                    .forEachOrdered(e -> result.put(e.getKey(), e.getValue()));
        }
        return result;
    }

    /**
     * Sort map by key
     *
     * @param map 待排序的map
     * @param isDesc 是否降序，true：降序，false：升序
     * @param limit 取前几条
     * @return 已排序map
     */
    public static <K extends Comparable<? super K>, V> Map<K, V> sortByKey(Map<K, V> map, boolean isDesc, int limit) {
        Map<K, V> result = Maps.newLinkedHashMap();
        if (isDesc) {
            map.entrySet().stream().sorted(Map.Entry.<K, V>comparingByKey().reversed()).limit(limit)
                    .forEachOrdered(e -> result.put(e.getKey(), e.getValue()));
        } else {
            map.entrySet().stream().sorted(Map.Entry.<K, V>comparingByKey())
                    .forEachOrdered(e -> result.put(e.getKey(), e.getValue()));
        }
        return result;
    }
}
