package cn.xlm.spark

import cn.xlm.spark
import org.apache.avro.ipc.specific.Person
import org.apache.spark.sql.hive.HiveContext
import org.apache.spark.sql.{SQLContext, SparkSession}
import org.apache.spark.{SparkConf, SparkContext}

object InferringSchema {
  def main(args: Array[String]): Unit = {

    val conf = new SparkConf().setAppName("SQL-1").setMaster("local").set("spark.sql.warehouse.dir", "/spark-warehouse/")
    val sc = new SparkContext(conf)
    val sqlContext  = new SQLContext(sc)
    val lineRDD = sc.textFile("hdfs://192.168.124.81:9000/test8/person.txt").map(_.split(" "))

    val personRDD = lineRDD.map(x => spark.Person(x(0),x(1),x(2)))
    import sqlContext.implicits._
    val personDF = personRDD.toDF()
    personDF.registerTempTable("person")
    val df = sqlContext.sql("select * from person order by age desc limit 2")
//    df.write.json(args(1))
    df.write.json("hdfs://mini1:9000/test8/out")
    sc.stop()


  }

}
case class Person(id:String,name:String,age:String)
