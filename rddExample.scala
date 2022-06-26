import org.apache.spark.sql.SparkSession
import org.apache.spark.{SparkConf, SparkContext}

object rddExample  {

  def main(args: Array[String]): Unit = {

    val conf = new SparkConf().setAppName("Basic").setMaster("local[1]")
    val sparkContext = new SparkContext(conf)

    val abc = sparkContext.parallelize(1 to 5)

    println(abc.reduce(_ + _))

  }
}