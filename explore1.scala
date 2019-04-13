val trainInput = spark.read
    .option("header", "true")
    .option("inferSchema","true")
    .format("com.databricks.spark.csv")
    .load(train)
    .cache

Println("trainInput.printSchema())

#println(df.count())
#df.select("id","cat1","cat2","cat3","cont1","cont2","cont3","loss").show()

val newDF = df.withColumnRenamed("loss","label")

newDF.createOrReplaceTempView("insurance")

spark.sql("SELECT avg(insurance.label) as AVG_LOSS FROM insurance").show()

spark.sql("SELECT min(insurance.label) as MIN_LOSS FROM insurance").show()

spark.sql("SELECT max(insurance.label) as MAX_LOSS FROM insurance").show()
