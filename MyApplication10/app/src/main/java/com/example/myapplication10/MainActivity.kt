package com.example.myapplication10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var li = 1 //เก็บค่าของ show อันแรก
    var operators = "" //เก็บค่าว่าจะไปเป็นตัวแทนอะไรอย่างนี้
    var numt = 0 //เก็บค่าตัวเลขกลุ่มแรกที่inputลงไป
    var sum = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            var str = 0

            n9.setOnClickListener {
//            var str = n9.text.toString()!!.toInt()
//            if (str == 0){
                if (num.text.toString() == "0" || li == 1){
                    num.setText("9")
                    li = 0
                }else {
                    var str9 = num.text.toString().plus( 9)
                    num.setText(str9)
                }
            }

            n8.setOnClickListener {
//            var str8 = n8.text.toString()!!.toInt()
                if (num.text.toString() == "0" || li == 1){
                    num.setText("8")
                    li = 0
                } else {
                    var str8 = num.text.toString().plus(8)
                    num.setText(str8)
                }
            }

            n7.setOnClickListener {
//            var str7 = n7.text.toString()!!.toInt()
                if (num.text.toString() == "0" || li == 1){
                    num.setText("7")
                    li = 0
                } else {
                    var str7 = num.text.toString().plus(7)
                    num.setText(str7)
                }
            }

            n6.setOnClickListener {
//            var str6 = n6.text.toString()!!.toInt()
                if (num.text.toString() == "0" || li == 1){
                    num.setText("6")
                    li = 0
                } else {
                    var str6 = num.text.toString().plus(6)
                    num.setText(str6)
                }
            }

            n5.setOnClickListener {
//            var str5 = n5.text.toString()!!.toInt()
                if (num.text.toString() == "0" || li == 1){
                    num.setText("5")
                    li = 0
                } else {
                    var str5 = num.text.toString().plus(5)
                    num.setText(str5)
                }
            }

            n4.setOnClickListener {
//            var str4 = n4.text.toString()!!.toInt()
                if (num.text.toString() == "0" || li == 1){
                    num.setText("4")
                    li = 0
                } else {
                    var str4 = num.text.toString().plus(4)
                    num.setText(str4)
                }
            }

            n3.setOnClickListener {
//            var str3 = n3.text.toString()!!.toInt()
                if (num.text.toString() == "0"|| li == 1){
                    num.setText("3")
                    li = 0
                } else {
                    var str3 = num.text.toString().plus(3)
                    num.setText(str3)
                }
            }

            n2.setOnClickListener {
//            var str2 = n2.text.toString()!!.toInt()
                if (num.text.toString() == "0"|| li == 1){
                    num.setText("2")
                    li = 0
                } else {
                    var str2 = num.text.toString().plus(2)
                    num.setText(str2)
                }
            }

            n1.setOnClickListener {
//            var str1 = n1.text.toString()!!.toInt()
                if (num.text.toString() == "0" || li == 1){
                    num.setText("1")
                    li = 0
                } else {
                    var str1 = num.text.toString().plus(1)
                    num.setText(str1)
                }
            }

            n0.setOnClickListener {
//            var str0 = n0.text.toString()!!.toInt()
                if (num.text.toString() == "0" || li == 1){ // "||" คือ "หรือ"
                    num.setText("0")
                    li = 0
                } else {
                    var str0 = num.text.toString().plus(0)
                    num.setText(str0)
                }
            }

//            dot.setOnClickListener {
////              var str0 = n0.text.toString()!!.toInt()
//                if (num.text.toString() == "0" || li == 1){
//                    num.setText(".")
//                    li = 0
//                } else {
//                    var dot = num.text.toString().plus(".")
//                    num.setText(dot)
//                }
//            }

            clear.setOnClickListener {
                num.setText(0)
            }

            delete.setOnClickListener {
                if (num.text.toString().length >= 0 && num.text.toString().length == 0){
                    num.setText("0")
                } else {
                    var del = num.text.toString().dropLast(1)
                }
            }

            plus.setOnClickListener {
                li = 1
                numt = num.text.toString().toInt()
                operators = "plus"
            }

            minus.setOnClickListener {
                li = 1
                numt = num.text.toString().toInt()
                operators = "minus"
            }

            multiply.setOnClickListener {
                li = 1
                numt = num.text.toString().toInt()
                operators = "multi"
            }

            divide.setOnClickListener {
                li = 1
                numt = num.text.toString().toInt()
                operators = "modulo"
            }

            percent.setOnClickListener {
                li = 1
                numt = num.text.toString().toInt()
                operators = "percent"
            }

            equal.setOnClickListener {
                if (operators == "plus") {
                    sum = numt + num.text.toString().toInt()
//                num.setText(sum.toString())
                    num.text = sum.toString()
                } else if (operators == "minus"){
//                    sum = numt - num.text.toString().toInt()
                num.setText(sum.toString())
                    num.text = sum.toString()
                } else if (operators == "multi"){
                    sum = numt * num.text.toString().toInt()
//                num.setText(sum.toString())
                    num.text = sum.toString()
                } else if (operators == "modulo"){
                    sum = numt / num.text.toString().toInt()
//                num.setText(sum.toString())
                    num.text = sum.toString()
                } else if (operators == "percent"){
                    sum = numt % num.text.toString().toInt()
//                num.setText(sum.toString())
                    num.text = sum.toString()
                }
            }

        }

    }