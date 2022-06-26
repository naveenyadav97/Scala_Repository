import org.apache.spark.sql.SparkSession
object readingDataframe {
  def main(args: Array[String]): Unit = {

    val spark = SparkSession.builder().appName("SparkRead").master("local[*]").getOrCreate()
    val newDF = spark.read.format("com.databricks").option("header","true")
      .option("inferSchema","true").load("C:\\Users\\000CJM744\\IdeaProjects\\Intermediate\\src\\main\\scala\\new.csv")
       newDF.show()

  }

}
