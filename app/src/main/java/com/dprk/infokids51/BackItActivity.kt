package com.dprk.infokids51

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.widget.doOnTextChanged
import kotlinx.android.synthetic.main.activity_back_it.*
import org.w3c.dom.Text

class BackItActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_back_it)

        var inputCity = ""
        var inputAdres = ""
        var inputEmail = ""

        outlinedTextFieldCity.editText?.doOnTextChanged() { inputText, _, _, _ ->
            inputCity = inputText.toString()
            Log.d("INPUT TAG", "inputCity=${inputCity}")
        }

        outlinedTextFieldAdres.editText?.doOnTextChanged() { inputText, _, _, _ ->
            inputAdres = inputText.toString()
            Log.d("INPUT TAG", "inputCity=${inputAdres}")
        }

        outlinedTextFieldEmail.editText?.doOnTextChanged(){inputText, _, _, _ ->
            inputEmail = inputText.toString()
            Log.d("INPUT TAG", "inputCity=${inputEmail}")

        }
    }

    fun sendEmail(textEmail: String) {

        val sendEmail: Intent = Intent(Intent.ACTION_SEND).apply {
            // The intent does not have a URI, so declare the "text/plain" MIME type
            putExtra(Intent.EXTRA_EMAIL, arrayOf("20dprk20@gmail.com")) // recipients
            putExtra(Intent.EXTRA_SUBJECT, "Добавить, редактировать")
            putExtra(Intent.EXTRA_TEXT, textEmail)
            // You can also attach multiple items by passing an ArrayList of Uris
        }

        sendEmail.data = Uri.parse("mailto:")
        sendEmail.type = "text/plain"

        startActivity(sendEmail)
    }
}