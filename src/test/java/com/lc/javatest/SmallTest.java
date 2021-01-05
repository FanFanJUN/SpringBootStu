package com.lc.javatest;

import com.lc.model.entity.TestUser;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SmallTest {
    public static void main(String[] args) {
        ArrayList<TestUser> arrayList = new ArrayList<>();
        arrayList.add(new TestUser(1, "李彩" ,"test"));
        arrayList.add(new TestUser(1, "李彩" ,"test"));
        arrayList.add(new TestUser(1, "cc" ,"test"));
        arrayList.add(new TestUser(1, "cc" ,"test"));
        Set<String> set = new HashSet<>();
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList.forEach(x -> {
            if("李彩".equals(x.getName())) {
                arrayList1.add(x.getName());
            } else {
                arrayList1.add(null);
            }
        });
        System.out.println(arrayList.toString());
        System.out.println(arrayList1);
    }
}
