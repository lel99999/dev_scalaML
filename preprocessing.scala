import org.apache.spark.mlfeature.{StringIndexer,StringIndexerModel}
import org.apache.spark.ml.feature.VectorAssembler

var trainSample = 1.0
var testSample = 1.0
val train = "data/insurance_train.csv"
val spark = SparkSessionCreate.createSession()
import spark.implicits._
println("Reading data from " + train + " file")

val trainInput = spark.read
