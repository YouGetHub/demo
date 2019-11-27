/*
* 函数的定义和调用
* */
function kkk(name) {
    if (name == 'ZouHaoyu') {
        return true;
    }else {
        return false;
    }
}
//打印返回值
document.write(kkk("ZouHaoyu"));
var fun1 = function(x){
    if (x == "ZouHaoyu"){
        return true;
    }else {
        return false;
    }
}
document.write(fun1("ZouHaoyu"));


/*/!*
* map 是一组键值对的结构，具有极快的查找速度
* *!/
var map1 = new Map([['邹浩宇',100],['校长',0]]);

var map2 = new Map();
map2.set('张三',90);//同一个key只能指定一个value，重复后 后面的值会覆盖前面的值
map2.set('小明',80);//添加新的key-value
map2.set('小看',80);//添加新的key-value
document.write(map2.has('小明'));//是否存在key
map2.delete('张三')//删除key
//遍历map集合
for (var [key,value] of map2) {
    document.write(key + ' = ' + value);
};
document.write("<br/>");
//遍历Map
map2.forEach(function(value,key,map){
    document.write(value);
});
/!*
* Set 存储单个元素value，不能重复值
* *!/
var set1 = new Set([1,2,3,4,'5']);
var set2 = new Set();
set2.add(1);//添加一个key
set2.add(2);
set2.add('3');
set2.delete(2);//删除元素
//遍历Set集合
for(var kv of set2){
    document.write(kv);
}
//遍历Set
set2.forEach(function(element,sameElement,set){
    document.write(element);
});*/

function Student(name){
    this.name = name;
    this.print = function () {
        document.write(this.name+"真帅");
    }
}
var s1 = new Student("邹浩宇");
s1.print();
document.write("<br/>");
var s2 = new Student("浩宇");
s2.print();
document.write("<br/>");
//为已有的对象添加新的方法 使用 prototype 方法 添加一个 print1方法
Student.prototype.print1 = function(){
    document.write(this.name+"唱歌好听");
}
s1.print1();
document.write("<br/>");
s2.print1();


document.write("<br/>");
function Student(name){
    this.name = name;
    this.print = function () {
        document.write(this.name+"真帅");
    }
}
var s1 = new Student("邹浩宇");
s1.print();
document.write("<br/>");
var s2 = new Student("邹浩宇");
s2.print();


document.write("<br/>");
function f8(message) {
    //创建自定义对象
    var student = new Object();
    student.name = '邹浩宇';//定义一个属性name 并赋值
    document.write(student.name);
}
f8(12);

function f7(message) {
    document.write("<br/>");
    document.write(''+Math.random()*2);
    document.write("<br/>");
    document.write('0-1之间的随机数' + Math.random());
    document.write("<br/>");

    //随机数
    document.write("<br/>");
    //四舍五入
    document.write('四舍五入 取整' + Math.round(1.4));
    document.write("<br/>");
    document.write('四舍五入 取整' + Math.round(1.5));
    document.write("<br/>");
    // 求幂
    document.write('3的3次方'+Math.pow(3,3));
    document.write("<br/>");
    document.write('1到100的 最小值' + Math.min(1,100));
    document.write("<br/>");
    document.write('1到100的 最大值' + Math.max(1,100));
    document.write("<br/>");
    document.write("绝对值" + Math.abs(-12))
    //绝对值
    document.write("<br/>");
    document.write("对数" +Math.E);
    document.write("<br/>");
    document.write("圆周率" + Math.PI);
    document.write("<br/>");
    //获取今天是周几
    var dd = new Date();
    var day = dd.getDay();
    document.write("通过getDay()获取今天是周几 " +day);
    document.write("<br/>");
    var d = new Date();
    document.write(d.getFullYear()+"-");//年
    document.write(d.getMonth()+1+"-");//月
    document.write(d.getDate()+"  ");//日
    document.write(d.getHours()+":");//时
    document.write(d.getMinutes()+":");//分
    document.write(d.getSeconds()+":");//秒
    document.write(d.getMilliseconds()+" ");//毫秒
    document.write("<br/>");
    // 创建日期对象
    var date = new Date();
    document.write("new date()创建日期对象 现在时间为 ---" +date);
    document.write("<br/>");
}
f7(12);

function f6(message) {
    var x = new Array(3,1,4,1,5,9,2,6);
    x.splice (3,2);//从位置3开始 ，删除2个元素
    x.splice(3,0,1,5);// 从位置3开始，删除0个元素，但是插入1和5,最后得到:'+x);
    document.write("<br/>");
    //获取数据的数据
    var v1 = new Array(1,2,4,4,3,4,56,7,8);
    //获取下表是 3 之后的数据
    var numbers = v1.slice(3);
    document.write(numbers);
    document.write("<br/>");
    var numbers1 = v1.slice(1,3);
    document.write(numbers1);
    document.write("<br/>");
    //对数组的内容进行反转
    var v = new Array(1,2,4,34);
    v.reverse();
    document.write("反转后的数据是 " +v);
    document.write("<br/>");

}
f6(12);
//自定义排序
function comparator(v1,v2){
    return v2 - v1;
}
function com(massage){
    document.write(massage);
}
var do1 = new Array(1,3,2,5,4);
do1.sort(comparator);
com('自定义倒序' +do1);

document.write("<br/>");
function k2(dd){
    //数组排序
    var so1 = new Array(1,3,4,52,3);
    so1.sort();
    document.write('排序后的数组' + so1);
    document.write("<br/>");
    // 在数组头部添加数据，获取尾部数据后删除
    var p2 = new Array('1,5,3,9');
    //添加数据 8 到数组头部
    p2.unshift(8);
    document.write('unshift 后的数组为 ' +p2);
    document.write("<br/>");
    //获取数组头部的数据，获取后删除
    p2.shift();
    document.write('shift 后的数组为 ' +p2);

    document.write("<br/>");
    // 在数组尾部添加数据，获取尾部数据后删除
    var p1 = new Array('1,5,3,9');
    //添加数据 8 到数据尾部
    p1.push(8);
    document.write('push 后的数组为 ' +p1);
    document.write("<br/>");
    //获取数组中尾部的数据，获取后删除
    p1.pop();
    document.write('pop 后的数组为 ' +p1);

    document.write("<br/>");
    //通过指定分隔符 返回一个数组的字符串表达
    var p = new Array(1,3,45,5,9);
    document.write('数组对象的类型 ' +typeof p);
    document.write("<br/>");
    document.write('使用join 得到了 p 数组的字符串表达 类型为' +typeof p);
    document.write("<br/>");
    document.write('使用join 得到了 p 数组的字符串表达 用 @ 当做分隔符 ' +p.join('@'));

    document.write("<br/>");
    //连接两个数组
    var ar1 = new Array(1,23,4,12);
    var ar2 = new Array(4,5,1,2,3);
    document.write('连接两个数组 concat' + ar1.concat(ar2));

    document.write("<br/>");
    //使用普通for遍历数组
    var aa = new Array(1,4,2,7);
    for (var i = 0; i<aa.length ;i++){
        document.write(aa[i]);
    }
    document.write("<br/>");
    //使用增强for遍历数组
    for (var i in  aa){
        document.write(aa[i]);
    }

    document.write("<br/>");


    //创建长度为5的数组，但每一个元素都是undefine
    var arr = new Array(5);
    //创建初始值的数组，根据参数创建数组
    var arr1 = new Array(1,2,3,4,5);
    document.write('数组长度为 ' + arr1.length);

    document.write("<br/>");
    //替换字符串
    var xb = new String("Hello JavaScript");
    //替换字符串里面第一个 a 为 l
    var replace = xb.replace('a','l');
    document.write('替换后的' + replace);
    document.write("<br/>");
    var bx = new String("Hello JavaScript");
    //替换字符串里面所有的a 为 k   //g为全局标志
    var s = bx.replace(/a/g,'k');
    document.write("替换后的" +s);
    document.write("<br/>");
    // 根据分隔符，把字符串转换为数组
    var tr = new String('hello Java Script');
    //通过 空格 分隔
    var strings = tr.split(' ');
    document.write('分隔后得到数组' + strings);
    document.write("<br/>");
    var strings1 = tr.split(' ',2);
    document.write('只保留前两个，分隔后得到数组' + strings1);
    document.write("<br/>");
    //截取一段字符串
    var kj = new String('helloJavaScript');
    document.write('截取1 到 3 的字符串 取得到1 取不到3----' +kj.substring(1,3));
    document.write("<br/>");
    //比较两个字符串是否相同
    var gh = new String('hh');
    var ak = new String('hh');
    document.write('比较gh 和 ak 是否相等 0表示相同 非0表示不相同-----' + gh.localeCompare(ak));
    var a = '312' +
        '123' +
        '123' +
        '123' +
        '123123' +
        ''


    document.write("<br/>");
    //获取字符串出现的位置
    var hh = new String('hello javascript')
    document.write('获取 o 出现的位置' +hh.indexOf('o'));
    document.write("<br/>");
    document.write('获取 a 最后一次出现的位置' +hh.lastIndexOf('a'));

    document.write("<br/>");
    //字符串的拼接
    var as = new String('hello ');
    var ag = new String('JavaScript');
    document.write('把 as 和  ag 拼接' + as.concat(ag));
    document.write("<br/>");
    //获取字符串长度
    var gb = new String('hello world JavaScript');
    document.write('获取下标为0的字符' + gb.charAt(0));
    document.write("<br/>");
    document.write('获取下标为0的字符的 Unicode码 ' + gb.charCodeAt(0));
    document.write("<br/>");
    var m = '哈哈';
    document.write('值为' + m + '类型为' +typeof m);
    document.write("<br/>");
    var p = new String('哈哈');
    document.write('值为' + p + '类型为' +typeof p);
    document.write("<br/>");
    var ab = new Number(12);
    document.write('对象的类型是 ' + typeof ab);
    document.write("<br/>");
    var b = ab.valueOf();
    document.write('返回的值的类型的' + typeof b);
    document.write("<br/>");
    var aa = new Number(123);
    document.write("计数法表达" +aa.toExponential());
    document.write("<br/>");
    var aa = new Number(123.4343);
    document.write("计数法表达" +aa.toExponential());
    document.write("<br/>");
    var aa = new Number(123);
    document.write("保留两位小数" +aa.toFixed(2));
    var aa = new Number(123.1212);
    document.write("保留两位小数" +aa.toFixed(2));
}
k2(12);
document.write("<br/>");

function k1(ff){
    var a = Number('123abc');
    document.write("非数字创建number的时候会得到---" + a);
    document.write("<br/>");
    document.write("正确判断是否是NaN的方式是调用isNaN函数" + isNaN(a));
}
k1(12);
document.write("<br/>");

//对象
function gg1(afaa){

    var a = new Number(6);
    document.write("值为" + a + "类型为" + typeof a);
    document.write("<br/>");
    var b = 6;
    document.write("值为" + b + "类型为" + typeof b);
}
gg1(1);

document.write('<br/>');
/*
* 异常
* 异常类型只有Error
* */
try {
    f00();// f00()函数不存在
}catch (error) {
    document.write("捕捉到异常");
    document.write("<br/>");
    document.write("打印异常" +error.message);
}finally{
    document.write("finally块总会执行");
}
try{
    var abc = 10;
    if(abc=18){
        throw new Error("年龄太小了抛出异常抛出异常");
    }
}catch (error){
    //打印异常
    document.write(error.message);
}finally{
    document.write("finally块总会执行");
}
document.write('<br/>');
//条件语句switch
function f5(d) {
    var day = new Date().getDay();//通过日期对象获取数字形式的星期几
    switch (day) {
        case 1:
            document.write("今天周"+day);
            break;
        case 2:
            document.write("今天周"+day);
            break;
    }
}
f5(1);
document.write("<br/>");
//条件语句if else if else
function f4(cc){
    var age = 15;
    if (age<18){
        document.write('如果 age 小于18就吃屎 age=' +age);
    }else if(age=18){
        document.write('如果 age 等于18就喝尿age=' +age);
    }else{
        document.write('如果大于18就去死 age=' +age);
    }
}
f4(2);
document.write("<br/>");
//三目运算符
function f3(massaae){
    var a = 5;
    document.write(a>9?'哈哈':'呵呵');

}
f3(12);
document.write("<br/>");

function f2(massage) {
    document.write(massage);
    document.write("<br/>");
}
f2("1=='1'"  + (1== '1'));
f2("1==='1'" + (1=== '1'));

//基本运算符
function f1(massage) {
    document.write(massage);
    document.write("<br/>");
}
f1("1==2: "+(1==2));
f1("1!=2: "+(1!=2));
f1("1>2: "+(1>2));
f1("1<2: "+(1<2));
f1("1>=2: "+(1>=2));

//自增自减运算符
function p(h,k) {
    document.write("++ 放在后面，先取值 后运算" + h++);
    document.write("<br/>");
    document.write("++ 放在前面，先运算 后取值" + ++k);
}
p(5,5);

document.write("<br/>");
//算数运算符
function f(massage) {
    document.write('' + massage);
    document.write("<br>");
}

f("1+2=" + (1+2));
f("2-1=" + (2-1));
f("2*1=" + (2*1));
f("2/1=" + (2/1));
f("2%1=" + (2%1));
document.write("<br>");


document.write("空字符串''转换为布尔后的值:"+Boolean(""));  //空字符串
document.write("<br/>");
document.write("非空字符'hello javascript '串转换为布尔后的值:"+Boolean("hello javascript"));  //非空字符串
document.write("<br>");
document.write("数字 0 转换为布尔后的值:"+Boolean(0));  //0
document.write("<br>");
document.write("数字 3.14 转换为布尔后的值:"+Boolean(3.14)); //非0
document.write("<br>");
document.write("空对象 null 转换为布尔后的值:"+Boolean(null));  //null
document.write("<br>");
document.write("非空对象 new Object() 转换为布尔后的值:"+Boolean(new Object()));  //对象存在
document.write("<br>");

document.write("字符串的\"10\"转换为数字的:"+parseInt("10")); //转换整数
document.write("<br>");
document.write("字符串的\"3.14\"转换为数字的:"+parseFloat("3.14"));//转换浮点数
document.write("<br>");
document.write("字符串的\"10abc\"转换为数字的:"+parseInt("10abc")); //判断每一位，直到发现不是数字的那一位
document.write("<br>");

document.write("字符串的\"hello javascript\"转换为数字的:"+parseInt("hello javascript")); //如果完全不包含数字，则返回NaN - Not a Number
document.write("<br>");

var r1=10;
document.write('默认模式下，数字10转换为十进制的'+r1.toString()); //默认模式，即十进制
document.write("<br>");

document.write('基模式下，数字10转换为二进制的'+r1.toString(2)); //基模式，二进制
document.write("<br>");

document.write('基模式下，数字10转换为八进制的'+r1.toString(8)); //基模式，八进制
document.write("<br>");

document.write('基模式下，数字10转换为十六进制的'+r1.toString(16)); //基模式，十六进制
document.write("<br>");

var c1 = 123;
document.write('数字---' + c1 + "转换为字符串" + c1.toString());
document.write("<br/>");
var c2 = true;
document.write('布尔---' + c2 + "转换为字符串" + c1.toString());
document.write("<br/>");
var c3 = '字符串';
document.write('字符串---' + c3 + "转换为字符串" + c1.toString());
document.write("<br/>");

document.write('.length获取长度' + c1.length);
document.write("<br/>");

var c ;
document.write('声明了为赋值类型是' + typeof c);
document.write("<br/>");
var b = 5;
document.write('赋值为5后类型是' + typeof b);
document.write("<br/>");
var d = 5.5;
document.write('赋值为5.5后类型是' + typeof d);
document.write("<br/>");
var v = true;
document.write('赋值为true后类型是' + typeof v);
document.write("<br/>");
var f = '哈';
document.write('赋值为哈后类型是' + typeof f);


document.write("<br/>");
var q1 = 12;//number
document.write('此时为数字---' +q1);
document.write("<br/>");
q1 = '哈哈';
document.write('此时为字符串---' +q1);
document.write("<br/>");

var e1 = '哈哈';
var e2 = "哈哈";
document.write('单引号的字符串' +e1);
document.write("<br/>");
document.write('双引号的字符串' +e1);
document.write("<br/>");

/*
* 函数
* */
//命名函数
function username(name1){
    document.write(name1+'真帅');
}
username('邹浩宇');
//匿名函数
var b = function(name2){
    document.write(name2+'真帅');
}
b("小明")

/* 基本数据类型
/!* undefined */
var a=10; //十进制
var b=012;//第一位是0，表示八进制
var c=0xA;//0x开头表示十六进制
var d=3.14;//有小数点表示浮点数
var e=3.14e2;//使用e的幂表示科学计数法
document.write("十进制 10 的值: "+a);
document.write("<br>");
document.write("八进制 012 的值: "+b);
document.write("<br>");
document.write("十六进制 0xA 的值: "+c);
document.write("<br>");
document.write("浮点数 3.14 的值: "+d);
document.write("<br>");
document.write("科学记数法 3.14e2 的值: "+e);
document.write("<br>");

var x=true;
var y=false;
document.write("布尔值:" +x);
document.write("布尔值:" +y);

var a1;
document.write('变量声明了，但没有赋值的变量是' +a1);

var a = 10;
document.write('变量值为' + a);
