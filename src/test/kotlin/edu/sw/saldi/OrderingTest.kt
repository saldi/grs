package edu.sw.saldi

import com.samsung.swchallenge.GRS
import org.testng.annotations.DataProvider
import org.testng.annotations.Test
import java.util.stream.Collectors

class OrderingTest {

    @DataProvider(name = "ordering")
    fun `data provider for test`(): Array<Array<*>> {
        return arrayOf(
            createArray("GRS0a")
        )
    }

    @Test(dataProvider = "ordering")
    fun `test`(input: () -> List<CharArray>, output: () -> List<CharArray>) {

        var inputArray: List<CharArray> = input()
        var correctOutputValues: List<CharArray> = output()

        val grs = GRS()

        inputArray.forEachIndexed { index, array ->
            println(array.plus(0.toChar()))
        }


    }

    fun createArray(fileName: String): Array<*> {
        return arrayOf(
            readInput(fileName),
            readOutput(fileName)
        )
    }

    fun readInput(inputFileName: String): () -> List<CharArray>? {
        return {
            val resourceName = "/in/$inputFileName.in"
            this::class.java
                .getResourceAsStream(resourceName)
                ?.bufferedReader()?.lines()?.skip(1)?.map { str -> str.toCharArray() }
                ?.collect(Collectors.toList())
        }
    }

    fun readOutput(outputFileName: String): () -> List<Any>? {
        return {
            val resourceName = "/out/$outputFileName.out"
            this::class.java
                .getResourceAsStream(resourceName)
                ?.bufferedReader()?.lines()?.map { str -> str.toCharArray() }
                ?.collect(Collectors.toList())
        }
    }

}