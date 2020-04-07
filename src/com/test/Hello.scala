package com.test

object Hello {
  def main(args: Array[String]) {
    println("hello ff" +".")
    val str1 = "String2";
    var str2 = "String1"
//    str2 = "sss";正确
//    str1 = "fff";错误，val声明后不可变
    var y=1
    var x = y
    println(x.getClass())
    var i = 0;
    while (i<10){//使用while循环
      print(i)
      i = i+1
    }
    println("循环嵌套")
    for(i <- 1 to 5;j <- 1 to 10){//循环嵌套
      print(i)
    }
    println("过滤")
    for(i<- 1 to 5; j <- 1 to i;if (!(i==3&&j==3)); if(i!=2 || j!=2)){ //过滤
      print (i + " ")
      if(i == j) println()
    }
  }
}
