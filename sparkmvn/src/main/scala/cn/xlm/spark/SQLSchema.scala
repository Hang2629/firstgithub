package cn.xlm.spark

import java.util.Properties

import cn.xlm.spark
import org.apache.avro.ipc.specific.Person
import org.apache.calcite.avatica.ColumnMetaData.StructType
import org.apache.spark.sql.hive.HiveContext
import org.apache.spark.sql.types.{StringType, StructField, StructType}
import org.apache.spark.sql.{Row, SQLContext, SparkSession}
import org.apache.spark.{SparkConf, SparkContext}

object SQLSchema {
  def main(args: Array[String]): Unit = {

    val conf = new SparkConf().setAppName("SQL-1").setMaster("local").set("spark.sql.warehouse.dir", "/spark-warehouse/")
    val sc = new SparkContext(conf)
    val sqlContext  = new SQLContext(sc)
    val lineRDD = sc.parallelize(Array("1 tom 5", "2 jerry 3", "3 kitty 6")).map(_.split(" "))

//    val schema = StructType(
//      List(
//        StructField("id",StringType,true),
//        StructField("name",StringType,true),
//        StructField("age",StringType,true)
//      )
//    )
//    val personRDD = lineRDD.map(x => Row(x(0),x(1),x(2)))
//    val personDataFrame = sqlContext.createDataFrame(personRDD,schema)
//    val prop = new Properties()
//    prop.put("user", "root")
//    prop.put("password", "123456")
//
//    personDataFrame.write.mode("append").jdbc("jdbc:mysql://192.168.10.1:3306/hangSQL", "bigdata.person", prop)
    sc.stop()


  }

}
//case class Person(id:String,name:String,age:String)
