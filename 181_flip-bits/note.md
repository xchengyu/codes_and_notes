```
@Copyright:LintCode
@Author:   vadxin
@Problem:  http://www.lintcode.com/problem/flip-bits
@Language: Markdown
@Datetime: 16-12-27 05:52
```

》》》是无符号右移，在高位补零 
》》是带符号的右移，如果是正数则在高位补零，负数则补1

》》》  ---  右移运算符，它表示是将运算符左边的对象向右移动运算符右边指定的数，并且在高位补0，其实右移n位，就相当于除于2的n此方； 
int a = 16;int b = 2;System.out.print(a>>>b); 结果是:4 
》》  ---  带符号右移运算符，它表示将运算符左边的运算对象，向右移动运算符右边指定的位数。如果是正数，在高位补零，如果是负数，则在高位补1； 
int a = 16,c = -16;int b = 2,d = 2;System.out.print(a>>b); 结果是:4  System.out.print(c>>d);-4 

《《 --- 左移运算符，它表示是将运算符左边的对象，向左移动运算符右边指定的位数，并且在低位补零。其实，向左移n位，就相当于乘上2的n此方； 
int a = 2;int b = 2 ;System.out.print(a < <b); 结果是:8 

a>>>=b 的意思是：a = a>>>b; 