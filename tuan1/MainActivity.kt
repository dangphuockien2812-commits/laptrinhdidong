package com.example.baitap

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {

            // ===== CÂU 3: COMMENT + BIẾN =====
            // Assign once, cannot change
            val age: Int = 5
            val name: String = "Rover"

            // Assign and change as needed
            var roll: Int = 6

            // ===== CÂU 8: SỐ NGẪU NHIÊN =====
            val randomNumber = rollDice()

            Column {

                // ===== CÂU 1 + 2: IN VĂN BẢN =====
                Text(text = "Hello, world!")
                Text(text = "This is the text to print!")

                // ===== CÂU 4: IN BIẾN BẰNG MẪU CHUỖI =====
                Text(text = "You are already $age!")
                Text(text = "You are already $age days old, $name!")

                // ===== CÂU 6: HÀM KHÔNG ĐỐI SỐ =====
                Text(text = printHello())

                // ===== CÂU 6: HÀM CÓ ĐỐI SỐ =====
                Text(text = printBorder("*", 10))

                // ===== CÂU 7: TOÁN TỬ =====
                val sum = 3 + 5
                val isGreater = sum > 5
                Text(text = "Sum = $sum")
                Text(text = "Is sum > 5? $isGreater")

                // ===== CÂU 8: IN SỐ NGẪU NHIÊN =====
                Text(text = "Random dice number: $randomNumber")
            }
        }
    }
}

/* ===== CÂU 6: HÀM KHÔNG CÓ ĐỐI SỐ ===== */
fun printHello(): String {
    return "Hello Kotlin"
}

/* ===== CÂU 6: HÀM CÓ ĐỐI SỐ ===== */
fun printBorder(border: String, timesToRepeat: Int): String {
    return border.repeat(timesToRepeat)
}

/* ===== CÂU 6 + 8: HÀM TRẢ VỀ GIÁ TRỊ (SỐ NGẪU NHIÊN) ===== */
fun rollDice(): Int {
    return (1..6).random()
}
