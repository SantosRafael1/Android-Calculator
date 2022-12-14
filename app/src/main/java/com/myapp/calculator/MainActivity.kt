package com.myapp.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.myapp.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        main()
    }

    @Suppress("LABEL_NAME_CLASH")
    private fun main() {
        val numberField = binding.numberField
        val displayResult = binding.displayResult

        binding.clean.setOnClickListener {
            numberField.text.clear()
            displayResult.text = ""
        }

        binding.one.setOnClickListener { numberField.text.append(binding.one.text) }
        binding.two.setOnClickListener { numberField.text.append(binding.two.text) }
        binding.three.setOnClickListener { numberField.text.append(binding.three.text) }
        binding.four.setOnClickListener { numberField.text.append(binding.four.text) }
        binding.five.setOnClickListener { numberField.text.append(binding.five.text) }
        binding.six.setOnClickListener { numberField.text.append(binding.six.text) }
        binding.seven.setOnClickListener { numberField.text.append(binding.seven.text) }
        binding.eight.setOnClickListener { numberField.text.append(binding.eight.text) }
        binding.nine.setOnClickListener { numberField.text.append(binding.nine.text) }
        binding.zero.setOnClickListener { numberField.text.append(binding.zero.text) }

        //operations button
        var n1: Int
        var n2: Int
        var result: Int

        //plus button
        binding.plus.setOnClickListener {
            if(numberField.text.isBlank()) return@setOnClickListener

            n1 = numberField.text.toString().toInt()
            numberField.text.clear()

            binding.equals.setOnClickListener {
                if(numberField.text.isBlank()) return@setOnClickListener

                n2 = numberField.text.toString().toInt()
                result = n1 + n2
                displayResult.text = result.toString()
                numberField.text.clear()
            }
        }

        //minus button
        binding.minus.setOnClickListener {
            if(numberField.text.isBlank()) return@setOnClickListener

            n1 = numberField.text.toString().toInt()
            numberField.text.clear()

            binding.equals.setOnClickListener {
                if(numberField.text.isBlank()) return@setOnClickListener

                n2 = numberField.text.toString().toInt()
                result = n1 - n2
                displayResult.text = result.toString()
                numberField.text.clear()
            }
        }

        //multiplication button
        binding.times.setOnClickListener {
            if(numberField.text.isBlank()) return@setOnClickListener

            n1 = numberField.text.toString().toInt()
            numberField.text.clear()

            binding.equals.setOnClickListener {
                if(numberField.text.isBlank()) return@setOnClickListener

                n2 = numberField.text.toString().toInt()
                result = n1 * n2
                displayResult.text = result.toString()
                numberField.text.clear()
            }
        }

        //division button
        binding.division.setOnClickListener {
            if(numberField.text.isBlank()) return@setOnClickListener

            val value1: Double = numberField.text.toString().toDouble()
            numberField.text.clear()

            binding.equals.setOnClickListener {
                if(numberField.text.isBlank()) return@setOnClickListener

                val value2 = numberField.text.toString().toDouble()
                val total = value1 / value2
                displayResult.text = total.toString()
                numberField.text.clear()
            }
        }
    }
}