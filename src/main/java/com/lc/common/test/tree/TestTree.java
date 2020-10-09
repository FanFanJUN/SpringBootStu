package com.lc.common.test.tree;

import com.lc.common.utils.TreeBuild;
import com.lc.model.entity.StudentScore;
import com.lc.model.entity.TestUser;
import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

/**
 *
 * @Description: 测试主类
 * @author: licai
 * @date:  16:41  
 * @param: 
 * @return: 
 *
 */
public class TestTree {
    public static void main(String[] args) throws ParseException {
//        List<TreeNode> list = new ArrayList<TreeNode>();
//        list.add(new TreeNode("F", "顶层节点1", "0"));
//        list.add(new TreeNode("F11", "二级节点4", "F"));
//        list.add(new TreeNode("F12", "二级节点5", "F"));
//        list.add(new TreeNode("F121", "二级节点6", "F12"));
//        list.add(new TreeNode("F122", "三级节点7", "F12"));

//        List<TreeNode> list1 = TreeBuild.toTree02(list,"0");
//        System.out.println(list1);
//        List<TreeNode> list2 = TreeBuild.toTree03(list,"0");
//        System.out.println(list2);
//
//        final String[] TRANSACTION_CODE = {"zmm026", "zmm1005", "zmm1001", "zmm1004",
//                    "zmrko", "OCSS"};
//        System.out.println(TRANSACTION_CODE[0]);
//
//        List<String> list1 = Arrays.asList(TRANSACTION_CODE); // 转换为数组
//        
//        // 测试二 抛出 UnsupportedOperationException https://www.cnblogs.com/goodAndyxublog/p/12758755.html
//        list1.add("test");
//        
//        // 测试一 成功
//        List<String> list3 = new ArrayList<>(Arrays.asList(TRANSACTION_CODE));
//        list3.add("test");
//        
//        System.out.println(list3.toString());
        // 判断是int的String还是日期的String

//        System.out.println(StringUtils.isNumeric("10"));
//        System.out.println(StringUtils.isNumeric("2089-01-23"));
//
//        // 当前时间
//        LocalDate now = LocalDate.now();
//        System.out.println(now.toString() instanceof String);
//
//        String[] movetypes = {"101", "102", "161", "162"};
//        List<String> moveTypesList = Arrays.asList(movetypes);
//        System.out.println(moveTypesList);

//        System.out.println(new BigDecimal(0).negate());

//        TestUser a = new TestUser(1, "a", "234");
//        TestUser b = new TestUser(2, "b", "234");
//        TestUser c = new TestUser(3, "c", "456");
//        TestUser d = new TestUser(4, "d", "456");
//        TestUser e = new TestUser(5, "e", "789");
//        List<TestUser> users = Arrays.asList(a, b, c, d, e);

//        // 逗号分隔（1）
//        String s = users.stream().map(x -> x.getName()).collect(Collectors.joining(","));
//        System.out.println(s);
//
//        // 逗号分隔（2）
//        List<String> stringList = users.stream().map(x -> x.getName()).collect(Collectors.toList());
//        System.out.println(String.join(",", stringList));
//
//        // 分组
//        Map<String, List<TestUser>> listMap = users.stream().collect(Collectors.groupingBy(x -> x.getPassword()));
//        System.out.println(listMap);
//
//        ArrayList<TestUser> list = new ArrayList<>();
//        for (String key: listMap.keySet()) {
//            System.out.println(listMap.get(key));
//            if("789".equals(listMap.get(key))) {
//                list = (ArrayList<TestUser>) listMap.get(key);
//            }
//        }
//        System.out.println(list);


        String stest = "20453678";
        System.out.println(checkYearMonthDay(stest));
        
        // 去重
//        distinct();
        // 时间转换
        Conversiontime();

        // 获取当前年的天数
        int daysOfThisYear = LocalDate.now().lengthOfYear();

        System.out.println(daysOfThisYear);
        /********************Map的 merge用法**************/
        Map<String, Integer> studentScoreMap2 = new HashMap<>();
        List<StudentScore> studentScoreList = buildATestList();
        // 对象包含学生姓名、科目、科目分数三个属性，要求求得每个学生的总成绩
        studentScoreList.forEach(studentScore -> studentScoreMap2.merge(
                studentScore.getStuName(),
                studentScore.getScore(),
                Integer::sum));

        System.out.println(studentScoreMap2);
        
        /****************int/int 保留2位小数****************/

        txfloat();
        /*********累加求和********************/
        int sum = studentScoreList.stream().mapToInt(p -> p.getScore()).sum();
        BigDecimal bigDecimal = studentScoreList.stream().map(item -> item.getMoney()).reduce(BigDecimal.ZERO, BigDecimal::add);
        bigDecimal = bigDecimal.setScale(2, BigDecimal.ROUND_DOWN); // 向下取整  保留两位小数
        BigDecimal bigDecimal1 = studentScoreList.stream().map(StudentScore::getMoney).reduce(BigDecimal::add).get();
        bigDecimal1 = bigDecimal1.setScale(2, BigDecimal.ROUND_DOWN);// 向下取整  保留两位小数
        System.out.println(sum);
        System.out.println(bigDecimal);
        System.out.println(bigDecimal1);

    }

    /****************int/int 保留2位小数****************/
    private static void txfloat() {
        int a=23;
        int b=3;
        DecimalFormat df=new DecimalFormat("0.00");

        System.out.println(df.format((float)a/b));
        System.out.println(df.format(a/(float)b));
        System.out.println(df.format((float)a/(float)b));
        System.out.println(df.format((float)(a/b)));
    }

    // 构建学生分数 list
    private static List<StudentScore> buildATestList() {
        List<StudentScore> studentScoreList = new ArrayList<>();
        StudentScore studentScore1 = new StudentScore() {{
            setStuName("张三");
            setSubJect("语文");
            setScore(70);
            setMoney(new BigDecimal(45.78));
        }};
        StudentScore studentScore2 = new StudentScore() {{
            setStuName("张三");
            setSubJect("数学");
            setScore(80);
            setMoney(new BigDecimal(4.78));
        }};
        StudentScore studentScore3 = new StudentScore() {{
            setStuName("张三");
            setSubJect("英语");
            setScore(65);
            setMoney(new BigDecimal(95.78));
        }};
        StudentScore studentScore4 = new StudentScore() {{
            setStuName("李四");
            setSubJect("语文");
            setScore(68);
            setMoney(new BigDecimal(45.8));
        }};
        StudentScore studentScore5 = new StudentScore() {{
            setStuName("李四");
            setSubJect("数学");
            setScore(70);
            setMoney(new BigDecimal(4.78));
        }};
        StudentScore studentScore6 = new StudentScore() {{
            setStuName("李四");
            setSubJect("英语");
            setScore(90);
            setMoney(new BigDecimal(46.78));
        }};
        StudentScore studentScore7 = new StudentScore() {{
            setStuName("王五");
            setSubJect("语文");
            setScore(80);
            setMoney(new BigDecimal(45.78));
        }};
        StudentScore studentScore8 = new StudentScore() {{
            setStuName("王五");
            setSubJect("数学");
            setScore(85);
            setMoney(new BigDecimal(45.78));
        }};
        StudentScore studentScore9 = new StudentScore() {{
            setStuName("王五");
            setSubJect("英语");
            setScore(70);
            setMoney(new BigDecimal(49.78));
        }};

        studentScoreList.add(studentScore1);
        studentScoreList.add(studentScore2);
        studentScoreList.add(studentScore3);
        studentScoreList.add(studentScore4);
        studentScoreList.add(studentScore5);
        studentScoreList.add(studentScore6);
        studentScoreList.add(studentScore7);
        studentScoreList.add(studentScore8);
        studentScoreList.add(studentScore9);

        return studentScoreList;
    }


    /**
     * 验证字符串是否能够转换成指定格式的日期
     * @param str
     * @return date
     */
    public static boolean isValidDate(String str ,String formater) {
        boolean convertSuccess=true;
        SimpleDateFormat format = new SimpleDateFormat(formater);
        try {
            format.setLenient(false);
            format.parse(str);
        } catch (ParseException e) {
            // e.printStackTrace();
            //如果throw java.text.ParseException或者NullPointerException，就说明格式不对
            convertSuccess=false;
        }
        return convertSuccess;
    }

    /**
     *
     * @Description: //强有力的校验8位字符串日期
     * @auther: licai
     * @date:  09:13  
     * @param: [ymd]
     * @return: boolean
     *
     */
    private static boolean checkYearMonthDay(String ymd) {
        if (ymd == null || ymd.length() == 0) {
            return false;
        }
        if(!StringUtils.isEmpty(ymd)) {
            if (ymd.length() != 8) {
                return  false;
            }
        }
        String s = ymd.replaceAll("[/\\- ]", "");
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        try {
            Date date = format.parse(s);
            if (!format.format(date).equals(s)) {
                return false;
            }
        } catch (ParseException e) {
            return false;
        }
        return true;
    }
    
    private static void distinct() {
        List<String>  test= new ArrayList<>();
        test.add("1");
        test.add("2");
        test.add("3");
        test.add("1");
        System.out.println(test);
        String str = String.join(",", test.stream().distinct().collect(Collectors.toList()));
        System.out.println("distinct去重"+ str);

        List<String> list  =   new  ArrayList<String>();
        list.add("aaa");
        list.add("bbb");
        list.add("aaa");
        list.add("aba");
        list.add("aaa");
        Set set = new HashSet();
        List newList = new  ArrayList();
        for (String cd:list) {
            if(set.add(cd)){
                newList.add(cd);
            }
        }
        System.out.println( "set去重后的集合： " + newList);
        
        

        List<String> list2  =   new  ArrayList<String>();
        list.add("aaa");
        list.add("bbb");
        list.add("aaa");
        list.add("aba");
        list.add("aaa");

        List newList2 = new ArrayList(new HashSet(list2));

        System.out.println( "HashSet去重后的集合： " + newList2);
    }
    
    private static void Conversiontime() throws ParseException {
        //获取的值为"19570323"
        String dateString = "19960122";

        //1、定义转换格式
        SimpleDateFormat formatter  = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat formatter2  = new SimpleDateFormat("yyyyMMdd");
        //2、调用formatter2.parse(),将"19570323"转化为date类型  输出为：Sat Mar 23 00:00:00 GMT+08:00 1957
        Date  date = formatter2.parse(dateString);

        //3、将date类型  (Sat Mar 23 00:00:00 GMT+08:00 1957)转化为String类型 
        //注意现在用的是formatter来做转换,输出为String类型的："1957-03-23"
        String  dString = formatter.format(date);

        //4、将String转化为date，需要注意java.sql.Date.valueOf()函数只能接受参数类型为yyyy-MM-dd类型的
        Date data = java.sql.Date.valueOf(dString);
        //5、将获取的date类型的出生日期赋值给javabean
        System.out.println("19960122转换为=>"+dString+"\n"+"19960122转换为时间"+data);
    }
}