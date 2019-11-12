

package testScala
import org.apache.spark.SparkConf
import org.apache.spark.SparkContext

object SparkWordCount {

  def main (args : Array[String]){

    System.setProperty("hadoop.home.dir", "c://hadoop//");
    val sc = new SparkContext(new SparkConf().setAppName("Spark WordCount").setMaster("local[4]"))

    //Load inputFile
    val inputFile = sc.textFile("src/main/resources/input.txt")
    val counts = inputFile.flatMap(line => line.split(" ")).map(word => (word, 1)).reduceByKey((a, b) => a + b)
    counts.foreach(println)

    sc.stop()

  }

}
