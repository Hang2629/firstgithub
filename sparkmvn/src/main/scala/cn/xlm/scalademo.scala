package cn.xlm

import scala.collection.mutable.ArrayBuffer
import scala.util.Random

object scalademo {
  def main(args: Array[String]): Unit = {
//    val content ="hello world"
//    val x,y =100
//    x.+(y)
//    x+y
//    if(x>0)y else ()
//    for(i <- 0 to 5) println(1)
//    for(i until 10)
//      for(i <- 1 to 3;j <- 1 to 5 if i!j) {
//        print()
//      }

    val arr = Array(1,23,13.14,5,76,7)
//    for (i <- (arr(0) until(arr.length,3))) {
//      println(i)
//    }
//    println(arr.sum)
//    println(arr.sorted.toBuffer)
//    println(arr.sortWith(_>_).toBuffer)
//    println(arr.count(_>23))

//    val map = Map(("a",1),("a",2))
//    println(map)
//    "NewYork".partition(_.isUpper)

    val arr1 = Array("YoshizawaAkiho", "YuiHatano", "AoiSola")
    val name = arr1(Random.nextInt(arr.length-1))
    println(name)

  }

def sum(result:Int): Int = {
  result +1
}
  def qw(a:Int) ={

  }
  val r = (result:Int) =>result + 1

  val arr1  = new Array[Int](3)
  val arr2 = Array(1,2,3)
  val r2 = arr2(2)
  val b1 = ArrayBuffer[Int]()
  b1 +=1
  b1 +=(12,23)
  b1 ++= ArrayBuffer(2)
  b1.trimEnd(2)
  b1.insert(1,5,6,7)
  b1.remove(1,2)
  val b11 = b1.toArray
  b11.toBuffer

val f1 = (x:Int,y:Int) => x+y
  f1(2,3)

  def g1 (f:(Int,Int) => Int) ={
    f(1,2)
  }

  val q1 = (x:Int,y:Int) => (x+y)

  g1(q1)

  def b1 (x:Int,y:Int) = x*y
  val u1 = b1 _
  val u2 = g1 _

  val t =("sdfsd",1,234,'a')

  val h1 = Array(("1",2),("2",4))
  val map1 = h1.toMap
  
}

class Student(val name:String,val age:Int) {
//  private var gender =""
//  def this (name:String,gender:String) {
////    this(name,age)
////    gender.toString
//  }
}
