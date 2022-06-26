import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.types._
object readDataFrame {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder().master("local[*]").appName("readDataFrame").getOrCreate()
    val newDF = spark.read.format("json").load(path= "")

    val simpleSchema: Any = StructType(Array(StructField("name", StringType, true),
                                             StructField("address", StringType,true)
                                             ))
    newDF.createOrReplaceTempView("newSQLDf")
    spark.sql("""select * from newSQLDF""").show(5)
    newDF.write.format("hive").mode("overwrite").save("/path")



  }

}
