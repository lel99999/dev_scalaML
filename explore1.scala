val trainInput = spark.read
    .option("header", "true")
    .option("inferSchema","true")
    .format("com.databricks.spark.csv")
    .load(train)
    .cache

Println("trainInput.printSchema())

#println(df.count())
