package solma

import org.apache.flink.ml.math.{DenseVector, Vector}
import org.apache.flink.streaming.api.scala._
import eu.proteus.solma.sampling.SimpleReservoirSampling


object TestSolma {

  def main(args: Array[String])
  {

    val data: Seq[Vector] = List(
      DenseVector(Array(2104.00, 3.00, 0.0)),
      DenseVector(Array(1600.00, 3.00, 0.0)),
      DenseVector(Array(2400.00, 3.00, 0.0)),
      DenseVector(Array(1416.00, 2.00, 0.0)),
      DenseVector(Array(3000.00, 4.00, 0.0)),
      DenseVector(Array(1985.00, 4.00, 0.0)),
      DenseVector(Array(1534.00, 3.00, 0.0)),
      DenseVector(Array(1427.00, 3.00, 0.0)),
      DenseVector(Array(1380.00, 3.00, 0.0)),
      DenseVector(Array(1494.00, 3.00, 0.0)),
      DenseVector(Array(1940.00, 4.00, 0.0)),
      DenseVector(Array(2000.00, 3.00, 0.0)),
      DenseVector(Array(1890.00, 3.00, 0.0)),
      DenseVector(Array(4478.00, 5.00, 0.0)),
      DenseVector(Array(1268.00, 3.00, 0.0)),
      DenseVector(Array(2300.00, 4.00, 0.0)),
      DenseVector(Array(1320.00, 2.00, 0.0)),
      DenseVector(Array(1236.00, 3.00, 0.0)),
      DenseVector(Array(2609.00, 4.00, 0.0)),
      DenseVector(Array(3031.00, 4.00, 0.0)),
      DenseVector(Array(1767.00, 3.00, 0.0)),
      DenseVector(Array(1888.00, 2.00, 0.0)),
      DenseVector(Array(1604.00, 3.00, 0.0)),
      DenseVector(Array(1962.00, 4.00, 0.0)),
      DenseVector(Array(3890.00, 3.00, 0.0)),
      DenseVector(Array(1100.00, 3.00, 0.0)),
      DenseVector(Array(1458.00, 3.00, 0.0)),
      DenseVector(Array(2526.00, 3.00, 0.0)),
      DenseVector(Array(2200.00, 3.00, 0.0)),
      DenseVector(Array(2637.00, 3.00, 0.0)),
      DenseVector(Array(1839.00, 2.00, 0.0)),
      DenseVector(Array(1000.00, 1.00, 0.0)),
      DenseVector(Array(2040.00, 4.00, 0.0)),
      DenseVector(Array(3137.00, 3.00, 0.0)),
      DenseVector(Array(1811.00, 4.00, 0.0)),
      DenseVector(Array(1437.00, 3.00, 0.0)),
      DenseVector(Array(1239.00, 3.00, 0.0)),
      DenseVector(Array(2132.00, 4.00, 0.0)),
      DenseVector(Array(4215.00, 4.00, 0.0)),
      DenseVector(Array(2162.00, 4.00, 0.0)),
      DenseVector(Array(1664.00, 2.00, 0.0)),
      DenseVector(Array(2238.00, 3.00, 0.0)),
      DenseVector(Array(2567.00, 4.00, 0.0)),
      DenseVector(Array(1200.00, 3.00, 0.0)),
      DenseVector(Array(852.00, 2.00, 0.0)),
      DenseVector(Array(1852.00, 4.00, 0.0)),
      DenseVector(Array(1203.00, 3.00, 0.0))
    )


    val env = StreamExecutionEnvironment.getExecutionEnvironment
    env.setParallelism(1)
    env.setMaxParallelism(1)

    val stream = env.fromCollection(data)

    val transformer = SimpleReservoirSampling()
      .setReservoirSize(5)

    transformer.transform(stream).print()

    env.execute()
  }


}
